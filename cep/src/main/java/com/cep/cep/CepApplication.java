package com.cep.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CepApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepApplication.class, args);
	}
}
