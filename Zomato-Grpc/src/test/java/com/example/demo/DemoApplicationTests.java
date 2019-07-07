package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.apnadhaba.services.OrderResponse;
import com.example.demo.zomato.client.ZomatoClientForApnaDhaba;
import com.example.demo.zomato.model.ZomatoOrderRequest;
import com.example.demo.zomato.model.ZomatoOrderResponse;
import com.example.demo.zomato.util.OrderResponseWrapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		
	}

}
