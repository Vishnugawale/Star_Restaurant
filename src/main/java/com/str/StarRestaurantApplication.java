package com.str;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients("com.str.Star_Restaurant")
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication

public class StarRestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarRestaurantApplication.class, args);
	}

}
