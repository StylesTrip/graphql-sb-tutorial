package com.ryan.graphql.resolver;

import com.ryan.graphql.model.Person;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@Service
public class PersonResolver implements GraphQLResolver<Person> {

   public String fullName(final Person person) {
       return person.getFirstName() + " " + person.getLastName();
   }
}
