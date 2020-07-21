package com.orderitemservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.orderitemservice.exception.ItemNotFoundException;
import com.orderitemservice.exception.OrderException;
import com.orderitemservice.model.OrderItem;
import com.orderitemservice.repo.OrderIteamserviceRepository;

@Component
public class OrderItemservice {
	
	@Autowired
	OrderIteamserviceRepository orderIteamserviceRepository;
	
	
	public void createorderes(OrderItem order) throws OrderException{
		orderIteamserviceRepository.save(order);
    }
	
	public OrderItem retrievingOrderItem(String id) throws ItemNotFoundException{
		return orderIteamserviceRepository.findByProductcode(id);
    }


}
