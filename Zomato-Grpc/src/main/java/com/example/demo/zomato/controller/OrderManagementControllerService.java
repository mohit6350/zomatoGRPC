package com.example.demo.zomato.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.apnadhaba.services.OrderResponse;
import com.example.demo.zomato.client.ZomatoClientForApnaDhaba;
import com.example.demo.zomato.model.ZomatoOrderRequest;
import com.example.demo.zomato.model.ZomatoOrderResponse;
import com.example.demo.zomato.util.OrderResponseWrapper;

public class OrderManagementControllerService {
   
	public JSONObject returnResult() {
		
		ZomatoClientForApnaDhaba client = new ZomatoClientForApnaDhaba();
		ZomatoOrderRequest request = new ZomatoOrderRequest();
		request.setUserName("Mohit Khare").setOrderItem("Fried Chicken").setTransactionDate("18-02-2019").setAddress("5th avenue , Boston").setAmount(288.99f);
		OrderResponse orderResponse = client.orderFoodOnline(request);
		OrderResponseWrapper wrapper = new OrderResponseWrapper();
		ZomatoOrderResponse output = wrapper.wrapResponse(orderResponse);
		JSONObject jo = new JSONObject();
		jo.put("assignedDeliveryPerson", output.getAssignedDeliverPerson());
		jo.put("amount", output.getAmount()+"");
		jo.put("confirmation", output.getConfirmation());
		jo.put("GeneratedDate", output.getGeneratedDate());
		jo.put("Discount", output.getDiscount()+"");
		jo.put("Packaging charges", output.getPackagingCharges()+"");
		jo.put("Tax", output.getTax()+"");
		jo.put("Total Amount", output.getTotalAmount()+"");
		return jo;
	}
	
}
