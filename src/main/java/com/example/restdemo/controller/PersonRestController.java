package com.example.restdemo.controller;

import com.example.restdemo.model.Person;
import com.example.restdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonRestController {

    @Autowired
    private PersonService service;

    @GetMapping("/")
    public Map<Long, Person> getAll() {
        return service.getPersonMap();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable Long id) {
        return service.getPerson(id);
    }

    @PostMapping("/")
    public void addPerson(@RequestBody Person p) {
        service.addPerson(p);
    }

}
