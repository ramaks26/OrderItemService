package com.orderitemservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orderitemservice.model.OrderItem;

@Repository
public interface OrderIteamserviceRepository extends CrudRepository<OrderItem, Long> {

	 OrderItem findByProductcode(String id);
	
}
	
