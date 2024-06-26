package com.edcandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edcandoweb.course.entities.Category;
//Possibilita a utilização do CRUD;

//@Repository --> mas como esta herdando do JpaRepository, já é componente registrado
public interface CategoryRepository extends JpaRepository<Category, Long>{
//JPA já tem uma implementação, não preciso implementar;
}
