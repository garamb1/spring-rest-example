package com.example.restdemo.repository;

import com.example.restdemo.model.Person;

import java.util.Map;

public interface PersonRepository {

    Map<Long, Person>  getPersonMap();

    Person getPerson(Long id);

    void addPerson(Person p);

}
