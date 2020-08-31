package com.colutti.msperson.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colutti.msperson.data.vo.PersonVO;
import com.colutti.msperson.services.PersonService;


@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService service;

	@GetMapping("/{id}")
	public PersonVO findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<PersonVO> findAll() {
		return service.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

	@PostMapping
	public PersonVO create(@RequestBody PersonVO personVO) {
		return service.create(personVO);
	}
	
	@PutMapping
	public PersonVO update(@RequestBody PersonVO personVO) {
		return service.update(personVO);
	}

}
