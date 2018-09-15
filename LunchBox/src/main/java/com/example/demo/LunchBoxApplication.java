package com.example.demo;

//import org.hibernate.annotations.BatchSize;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.*") 
public class LunchBoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(LunchBoxApplication.class, args);
	}
}
