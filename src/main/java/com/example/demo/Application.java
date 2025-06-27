package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		Jpa bean = run.getBean(Jpa.class);
		List<Customer> content = bean.findAll(PageRequest.of(0,5)).getContent();
		for(Customer c:content) {
			
			System.out.println(c);
		}
	}

}