package com.example.demo.zomato.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

@RestController
@RequestMapping("/rest/zomato")
public class OrderManagementController {

	
	@GetMapping(value="/hello")
	public String sayHello() {
		return "Hello mf";
	}
	
	@GetMapping(value="/order", produces="application/json")
	public JSONObject getOrderResponse() {
		return new OrderManagementControllerService().returnResult();
	}
	
	
	
}
