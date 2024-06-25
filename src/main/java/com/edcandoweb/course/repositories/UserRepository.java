package com.edcandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edcandoweb.course.entities.User;
//Possibilita a utilização do CRUD;

public interface UserRepository extends JpaRepository<User, Long>{
//JPA já tem uma implementação, não preciso implementar;
}
