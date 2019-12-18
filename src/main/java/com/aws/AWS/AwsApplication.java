package com.aws.AWS;

import com.aws.AWS.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AwsApplication implements CommandLineRunner {

	@Autowired
	EventService eventService;
	public static void main(String[] args) {
		SpringApplication.run(AwsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World from Application Runner");
		eventService.storeEvent();
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
