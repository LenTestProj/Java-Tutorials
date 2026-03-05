package com.telecom.SpringAICode;

import java.util.List;

import org.springframework.ai.document.Document;
import org.springframework.ai.reader.TextReader;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.subst.Token;
import jakarta.annotation.PostConstruct;

@Component
public class DataInitializer {

    @Autowired
    private VectorStore vectorStore;

    @PostConstruct //inititalized when you start the project
    public void initData(){
        TextReader textReader = new TextReader(new ClassPathResource("product_details.txt"));

        TokenTextSplitter splitter = new TokenTextSplitter(100,30,5,500,false);
        List<Document> documents = splitter.split(textReader.get()); //split the file into document chunks
        
        vectorStore.add(documents);
    }
}
