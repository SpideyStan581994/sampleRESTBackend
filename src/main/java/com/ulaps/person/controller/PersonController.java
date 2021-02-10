package com.ulaps.person.controller;

import com.ulaps.person.model.Person;
import com.ulaps.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPersons(){
       return personService.getAllPersons();
    }

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }

    @GetMapping("/find/{id}")
    public Person getPersonById(@PathVariable(name = "id") int id){
        return personService.getPersonById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePersonById(@PathVariable(name = "id") int id){
         personService.deletePersonById(id);

    }

    @PutMapping("/update")
    public Person updatePersonById(@RequestBody Person person){
        return personService.updatePerson(person);
    }
}
