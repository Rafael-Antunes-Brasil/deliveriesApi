package com.deliveries.deliveriesApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.deliveries.deliveriesApi.entity")
public class DeliveriesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveriesApiApplication.class, args);
	}
}
