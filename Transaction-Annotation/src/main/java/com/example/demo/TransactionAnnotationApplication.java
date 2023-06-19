package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionAnnotationApplication.class, args);
	}

}
