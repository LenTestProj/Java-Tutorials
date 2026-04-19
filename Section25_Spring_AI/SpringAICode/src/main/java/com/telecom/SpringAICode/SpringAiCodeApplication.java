package com.telecom.SpringAICode;

// import org.springframework.ai.vectorstore.pgvector.autoconfigure.PgVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableAutoConfiguration(exclude = {
//     PgVectorStoreAutoConfiguration.class
// })
public class SpringAiCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiCodeApplication.class, args);
	}

}
