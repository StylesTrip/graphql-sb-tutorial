package com.ryan.graphql.service;

import com.ryan.graphql.model.Person;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.time.LocalDate;

@Service
public class PersonService {
   private static int INDEX_COUNTER = 0;
   private final Collection<Person> people = new ConcurrentLinkedQueue<>();

   public PersonService() {
   }

   public Person createPerson(final String firstName, final String lastName, LocalDate dateOfBirth) {
       final Person person = new Person(++INDEX_COUNTER, firstName, lastName, dateOfBirth);
       people.add(person);
       return person;
   }

   public Collection<Person> getPeople() {
       return Collections.unmodifiableCollection(people);
   }
}
