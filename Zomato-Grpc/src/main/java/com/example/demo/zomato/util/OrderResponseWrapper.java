package com.example.demo.zomato.util;

import com.apnadhaba.services.OrderResponse;
import com.example.demo.zomato.model.ZomatoOrderResponse;

public class OrderResponseWrapper {
	
	public ZomatoOrderResponse wrapResponse(OrderResponse resp){
		ZomatoOrderResponse response = new ZomatoOrderResponse();
	    response.setAmount(resp.getBill().getAmount());
	    response.setAssignedDeliverPerson(resp.getAssignedDeliveryPerson());
	    response.setConfirmation(resp.getConfirmation());
	    response.setDeliveryCharges(20.00);
	    response.setDiscount(resp.getBill().getDiscount());
	    response.setGeneratedDate(resp.getBill().getGeneratedDate());
	    response.setPackagingCharges(resp.getBill().getPackingCharges());
	    response.setTax(resp.getBill().getTax());
	    response.setTotalAmount(resp.getBill().getTotalAmount());
	    
	    return response;
	}

}
