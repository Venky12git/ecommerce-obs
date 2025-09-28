package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( info = @Info( title = "E-CommerceOnlineBookStore",
                                   version = "3.0", 
                                    description = "APIs for user registration and login" ) )
public class EcommerceOnlineBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceOnlineBookStoreApplication.class, args);
	}

}
