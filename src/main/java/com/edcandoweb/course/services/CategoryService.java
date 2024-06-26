package com.edcandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edcandoweb.course.entities.Category;
import com.edcandoweb.course.repositories.CategoryRepository;

@Service //Permite que seja injetado pelo autowired
public class CategoryService {
	
	@Autowired
	private CategoryRepository CategoryRepository;
	
	public List<Category> findAll(){
		return CategoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional <Category> obj = CategoryRepository.findById(id);
		return obj.get();
	}


}
