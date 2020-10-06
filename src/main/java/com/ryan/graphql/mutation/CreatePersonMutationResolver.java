package com.ryan.graphql.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import com.ryan.graphql.model.Person;
import com.ryan.graphql.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonMutationResolver implements GraphQLMutationResolver {

   private final PersonService personService;

   public CreatePersonMutationResolver(final PersonService personService) {
       this.personService = personService;
   }

   public Person createPerson(final String firstName, final String lastName) {
       return personService.createPerson(firstName, lastName);
   }
}
