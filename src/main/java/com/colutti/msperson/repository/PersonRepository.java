package com.colutti.msperson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colutti.msperson.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
