package com.example.restdemo.service;

import com.example.restdemo.model.Person;
import com.example.restdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Map<Long, Person> getPersonMap() {
        return personRepository.getPersonMap();
    }

    public void addPerson(Person p) {
        personRepository.addPerson(p);
    }

    public Person getPerson(Long id) {
        return personRepository.getPerson(id);
    }

}
