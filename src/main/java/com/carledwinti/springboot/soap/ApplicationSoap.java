package com.carledwinti.springboot.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationSoap {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSoap.class, args);
		
		System.out.println("Access the WSDL in http://localhost:8082/ws/notes.wsdl");
	}

}
