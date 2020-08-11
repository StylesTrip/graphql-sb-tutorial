package com.ryan.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import graphql.kickstart.execution.config.GraphQLServletObjectMapperConfigurer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlTutorialApplication.class, args);
	}
}
