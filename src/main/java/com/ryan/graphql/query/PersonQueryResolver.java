package com.ryan.graphql.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.Collection;

import com.ryan.graphql.model.Person;
import com.ryan.graphql.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonQueryResolver implements GraphQLQueryResolver {

    private final PersonService personService;

    public PersonQueryResolver(final PersonService personService) {
        this.personService = personService;
    }

    public Collection<Person> people() {
        return personService.getPeople();
    }
}
