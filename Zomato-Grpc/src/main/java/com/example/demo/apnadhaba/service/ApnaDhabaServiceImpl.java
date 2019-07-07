package com.example.demo.apnadhaba.service;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apnadhaba.services.Bill;
import com.apnadhaba.services.OrderFoodServiceGrpc.OrderFoodServiceImplBase;
import com.apnadhaba.services.OrderRequest;
import com.apnadhaba.services.OrderResponse;
import com.apnadhaba.services.OrderResponse.Builder;

import io.grpc.stub.StreamObserver;

@GRpcService
public class ApnaDhabaServiceImpl extends OrderFoodServiceImplBase{
    private Logger log = LoggerFactory.getLogger(ApnaDhabaServiceImpl.class);
    public ApnaDhabaServiceImpl() {
    	System.out.println("SERVER IMPL CLASS LOADED...");
    }
	@Override
	public void orderFoodOnline(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
		// Fetching the data from the Request
		log.info("########## Fetching Data from Request ############");
		String userName = request.getUserName();
		String orderItem = request.getOrderItem();
		String address = request.getAddress();
		double amount = request.getAmount();
		String date = request.getTransactionDate();
		
		// Constructing Bill using BillBuilder
		log.info("########### Constructing Bill using Request data #############");
		com.apnadhaba.services.Bill.Builder billBuilder = Bill.newBuilder();
		billBuilder.setAmount(amount);
		billBuilder.setDiscount(15.15);
		billBuilder.setGeneratedDate(date);
		billBuilder.setPackingCharges(15.88);
		billBuilder.setTax(20.20);
		double totalAmount = ((amount + 15.88 +20.20) - 15.15);
		billBuilder.setTotalAmount(totalAmount);
		
		// Creating Bill
		Bill bill = billBuilder.build();
		/*Builder builder = OrderResponse.newBuilder();
		builder.setAssignedDeliveryPerson("Rakesh Kumar");
		builder.setConfirmation("Order Confirmed");
		builder.setBill(bill);*/
		
		// Building the Response
		log.info("############## Creating Response ###################");
		OrderResponse response = OrderResponse.newBuilder().setAssignedDeliveryPerson("Rakesh kumar").setConfirmation("your order is confirmed").setBill(bill).build();
		
		// Setting the Response
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	
}
