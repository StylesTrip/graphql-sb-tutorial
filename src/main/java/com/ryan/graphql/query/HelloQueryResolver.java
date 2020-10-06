package com.ryan.graphql.query;

import org.springframework.stereotype.Service;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.Optional;

@Service
/**
 * GraphQLQueryResolver is a marker interface that tells library to
 * use bean for resolving queries and will automatically match
 * the hello method with the hello query
 */
public class HelloQueryResolver implements GraphQLQueryResolver {
  public String hello(final String who) {
    return String.format("Hello, %s!", Optional.ofNullable(who).orElse("GraphQL"));
  }
}
