package com.edcandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edcandoweb.course.entities.Product;

//@Repository --> mas como esta herdando do JpaRepository, já é componente registrado
public interface ProductRepository extends JpaRepository<Product, Long>{
//JPA já tem uma implementação, não preciso implementar;
}
