package com.bridgeit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class CrudSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSampleApplication.class, args);
	}

}
