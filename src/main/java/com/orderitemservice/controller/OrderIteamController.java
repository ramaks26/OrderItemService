package com.orderitemservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderitemservice.exception.ItemNotFoundException;
import com.orderitemservice.exception.OrderException;
import com.orderitemservice.model.OrderItem;
import com.orderitemservice.service.OrderItemservice;

@RestController
@RequestMapping("/orderitem")
public class OrderIteamController {

	@Autowired
	OrderItemservice orderItemservice;

	@PostMapping("/orderItem")
	public void createOrderItem(OrderItem order) {
		try {
			orderItemservice.createorderes(order);
		} catch (OrderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@GetMapping("/retriveItem")
	public OrderItem retrievingOrderItem(String ItemID) {

		OrderItem retrievingOrderItem= null;
		try {
			retrievingOrderItem = orderItemservice.retrievingOrderItem(ItemID);
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		}
		return retrievingOrderItem;
 
	}

}
