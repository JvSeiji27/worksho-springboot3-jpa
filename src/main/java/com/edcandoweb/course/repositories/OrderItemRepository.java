package com.edcandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edcandoweb.course.entities.OrderItem;
//Possibilita a utilização do CRUD;
import com.edcandoweb.course.entities.pk.OrderItemPK;

//@Repository --> mas como esta herdando do JpaRepository, já é componente registrado
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
//JPA já tem uma implementação, não preciso implementar;
}
