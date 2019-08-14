package com.carledwinti.springboot.soap.pjspringbootsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PjSpringbootSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(PjSpringbootSoapApplication.class, args);
		
		System.out.println("Access the WSDL in http://localhost:8080/ws/notes.wsdl");
	}

}
