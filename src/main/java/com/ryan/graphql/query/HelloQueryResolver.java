package com.ryan.graphql.query;

import org.springframework.stereotype.Service;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Service
public class HelloQueryResolver implements GraphQLQueryResolver {
  public String hello() {
    return "Hello, GraphQL!";
  }
}
