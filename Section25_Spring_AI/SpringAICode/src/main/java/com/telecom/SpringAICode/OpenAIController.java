package com.telecom.SpringAICode;

import java.util.List;
import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.vectorstore.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemoryRepository;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class OpenAIController {
    
    // private OpenAiChatModel chatModel;

    private ChatClient chatClient; 

    @Autowired
    private VectorStore vectorStore;

    @Autowired
    @Qualifier("openAiEmbeddingModel")
    private EmbeddingModel embeddingModel;

    ChatMemory chatMemory = MessageWindowChatMemory.builder().build();

    public OpenAIController(OpenAiChatModel chatModel){
        this.chatClient = ChatClient.create(chatModel);
    }

    //only for one ai model not multiple models
    // public OpenAIController(ChatClient.Builder builder){
    //     this.chatClient = builder
    //     .defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
    //     .build();
    // }

    @GetMapping("/api/{message}") 
    public ResponseEntity<String> getAnswer(@PathVariable String message){
        // String response = chatModel.call(message);
        // String response = chatClient.prompt(message).call().content();
        ChatResponse chatResponse = chatClient.prompt(message).call().chatResponse();
        
        System.out.println(chatResponse.getMetadata().getModel());
        
        String response = chatResponse.getResult().getOutput().getText();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/api/recommend")
    public String recommend(@RequestParam String type, @RequestParam String year,@RequestParam String lang) {
        String tempt = """
                    I want to watch a {type} movie tonight with good rating,
                    looking for movies around this year {year}.
                    The language I am looking for is {lang}.
                    Suggest one specific movie and tell me the cast and lenght of the movie. 
                
                    response format should be:
                    1. Movie name
                    2. basic plot
                    3. cast
                    4. length
                    5.IMDB rating
                """;

        PromptTemplate promptTemplate = new PromptTemplate(tempt);
        Prompt prompt = promptTemplate.create(Map.of("type",type,"year",year,"lang",lang)); //create a prompt

        String response = chatClient.prompt(prompt).call().content();

        return response;
    }

    @PostMapping("/api/embedding")
    public float[] embedding(@RequestParam String text){
        return embeddingModel.embed(text);
    }

    //compute vector distance between two items
    @PostMapping("/api/similarity")
    public double getSimmilarity(@RequestParam String text1, @RequestParam String text2) {
        float[] embedding1 = embeddingModel.embed(text1);
        float[] embedding2 = embeddingModel.embed(text2);
        
        double dotProduct = 0;
        double norm1 = 0;
        double norm2=0;

        for(int i=0;i<embedding1.length; i++){
            dotProduct += embedding1[i] * embedding2[i];
            norm1 += Math.pow(embedding1[i],2);
            norm2 += Math.pow(embedding2[i],2 );
        }

        return dotProduct*100 / (Math.sqrt(norm1) * Math.sqrt(norm2));
    }
    
    @PostMapping("/api/product")
    public List<Document> getProducts(@RequestParam String text){
        
        // return vectorStore.similaritySearch(text);
        return vectorStore.similaritySearch(SearchRequest.builder().query(text).topK(2).build());
        
    }
    
    @PostMapping("/api/ask") 
    public String getAnswerUsingRag(@RequestParam String query){
       return chatClient
       .prompt(query)
       .advisors(QuestionAnswerAdvisor.builder(vectorStore).build())
       .call()
       .content();
    }
    
}
