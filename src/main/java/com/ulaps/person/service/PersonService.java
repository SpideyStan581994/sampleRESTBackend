package com.ulaps.person.service;

import com.ulaps.person.model.Person;
import com.ulaps.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }


    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPersonById(int id) {
        return personRepository.findPersonById(id).orElseThrow(()-> new IllegalStateException("user not found on id " + id));

    }

    public void deletePersonById(int id) {
        personRepository.deleteById(id);
    }

    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }
}
