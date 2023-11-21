package com.example.restdemo.repository;

import com.example.restdemo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryPersonRepository implements PersonRepository {

    private final Map<Long, Person> personMap = new HashMap<>();
    private long nextId = 0;

    @Override
    public Map<Long, Person> getPersonMap() {
        return personMap;
    }

    @Override
    public Person getPerson(Long id) {
        return personMap.get(id);
    }

    @Override
    public void addPerson(Person p) {
        personMap.put(nextId++, p);
    }
}
