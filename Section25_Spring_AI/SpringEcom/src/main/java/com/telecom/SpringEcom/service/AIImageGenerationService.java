package com.telecom.SpringEcom.service;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.management.RuntimeErrorException;

import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIImageGenerationService {

    @Autowired
    private ImageModel imageModel;
    
    public byte[] generateImage(String imagePrompt) {
        OpenAiImageOptions options = OpenAiImageOptions.builder()
            .N(1)
            .width(1024)
            .height(1024)
            .quality("standard")
            .responseFormat("url")
            .model("dall-e-3")
            .build();
        ImageResponse response = imageModel.call(new ImagePrompt(imagePrompt,options));
        String imageUrl = response.getResult().getOutput().getUrl();
        
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(imageUrl))
            .GET()
            .build();

            HttpResponse<byte[]> res = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

            byte[] imageBytes = res.body();
            return imageBytes;
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
        
    
    }
    
}
