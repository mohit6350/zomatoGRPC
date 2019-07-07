package com.example.demo.zomato.client;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.apnadhaba.services.OrderFoodServiceGrpc;
import com.apnadhaba.services.OrderRequest;
import com.apnadhaba.services.OrderRequest.Builder;
import com.apnadhaba.services.OrderResponse;
import com.example.demo.zomato.model.ZomatoOrderRequest;
import com.example.demo.zomato.model.ZomatoOrderResponse;
import com.example.demo.zomato.util.OrderResponseWrapper;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class ZomatoClientForApnaDhaba {

	private static Logger log = LoggerFactory.getLogger(ZomatoClientForApnaDhaba.class);
	private static OrderFoodServiceGrpc.OrderFoodServiceBlockingStub orderFoodServiceBlockingStub;
	
	@PostConstruct
	public void init() {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
		orderFoodServiceBlockingStub = OrderFoodServiceGrpc.newBlockingStub(managedChannel);
	}
	
	public OrderResponse orderFoodOnline(ZomatoOrderRequest request) {
		log.info("%%%%%%%%%%%%%  Building Actual Request For Apna Dhaba  %%%%%%%%%%%%%%%%%%%%%%");
		Builder requestBuilder = OrderRequest.newBuilder();
		requestBuilder.setAddress(request.getAddress());
		requestBuilder.setAmount((float)request.getAmount());
		requestBuilder.setOrderItem(request.getOrderItem());
		requestBuilder.setTransactionDate(request.getTransactionDate());
		requestBuilder.setUserName(request.getUserName());
		OrderRequest orderRequest = requestBuilder.build();
	
		log.info("######################## Fetching Response ##############################");
		
		OrderResponse response = orderFoodServiceBlockingStub.orderFoodOnline(orderRequest);
		
		return response;
	}
}
