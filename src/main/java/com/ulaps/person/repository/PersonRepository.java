package com.ulaps.person.repository;

import com.ulaps.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    public Optional<Person> findPersonById (int id);
}
