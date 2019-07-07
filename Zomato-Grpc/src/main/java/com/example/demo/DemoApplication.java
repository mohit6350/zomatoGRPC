package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apnadhaba.services.OrderRequest;
import com.apnadhaba.services.OrderResponse;
import com.example.demo.zomato.client.ZomatoClientForApnaDhaba;
import com.example.demo.zomato.model.ZomatoOrderRequest;
import com.example.demo.zomato.model.ZomatoOrderResponse;
import com.example.demo.zomato.util.OrderResponseWrapper;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.err.println("Application started Successfully...");
		
	}

}
