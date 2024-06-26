package com.edcandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edcandoweb.course.entities.Order;
import com.edcandoweb.course.repositories.OrderRepository;

@Service //Permite que seja injetado pelo autowired
public class OrderService {
	
	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> findAll(){
		return OrderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional <Order> obj = OrderRepository.findById(id);
		return obj.get();
	}


}
