package com.telecom.SpringAICode;

import java.util.List;
import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.converter.BeanOutputConverter;
import org.springframework.ai.converter.ListOutputConverter;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {
    
    // private OpenAiChatModel chatModel;

    private ChatClient chatClient; 

    public MovieController(OpenAiChatModel chatModel){
        this.chatClient = ChatClient.create(chatModel);
    }

    @GetMapping("movies")
    public List<String> getMovies(@RequestParam String name){
        String message = """
                  List Top 5 movies of {name} {format}
                """;

        ListOutputConverter opCon = new ListOutputConverter(new DefaultConversionService());    
        
        PromptTemplate template = new PromptTemplate(message);
    
        Prompt prompt = template.create(Map.of("name",name,"format",opCon.getFormat()));

        String chatClientResponse = chatClient.prompt(prompt).call().content();

        List<String> movies = opCon.convert(chatClientResponse);
        
        return movies;
    }

    @GetMapping("movie")
    public Movie GetMovieData(@RequestParam String name){
        String message = """
            Get me the best movie of {name} {format}
        """;

        BeanOutputConverter<Movie> opCon = new BeanOutputConverter<Movie>(Movie.class);

        PromptTemplate template = new PromptTemplate(message);
    
        Prompt prompt = template.create(Map.of("name",name,"format",opCon.getFormat()));
        
        Movie movie = opCon.convert(chatClient.prompt(prompt).call().content());
        
        return movie;
    }

    @GetMapping("moviesList")
    public List<Movie> GetMoviesList(@RequestParam String name){
        String message = """
            Top 5 movies of {name} {format}
        """;

        BeanOutputConverter<List<Movie>> opCon = new BeanOutputConverter<List<Movie>>(
            new ParameterizedTypeReference<List<Movie>>() {}
        );

        PromptTemplate template = new PromptTemplate(message);
    
        Prompt prompt = template.create(Map.of("name",name,"format",opCon.getFormat()));
        
        List<Movie> movies = opCon.convert(chatClient.prompt(prompt).call().content());
        
        return movies;
    }

}

