package org.martinlippert.sb3.sb3demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;

@SpringBootApplication
public class Sb3DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb3DemoApplication.class, args);
	}
	
   	@Bean
    	public HttpExchangeRepository httpTraceRepository()
    	{
        	return new InMemoryHttpExchangeRepository();
    	}
}
