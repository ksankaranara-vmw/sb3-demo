package org.martinlippert.sb3.sb3demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;

@SpringBootApplication
public class Sb3DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb3DemoApplication.class, args);
	}
	
	@Bean
	public HttpTraceRepository htttpTraceRepository() {
		return new InMemoryHttpTraceRepository();
	}
}
