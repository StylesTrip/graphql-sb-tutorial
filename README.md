My first attempt at learning GraphQL.

Run:
`./gradlew clean build`
`java -jar build/libs/graphql-tutorial-*.jar`

Navigate to:
`http://localhost:8080/graphiql`

Queries to try:
To say hello
```
query {
    hello(who: "John")
 }
```

To create a person
```
mutation {
    createPerson(firstName: "John", lastName: "Doe") {
        id
        firstName
        lastName
    }
 }
```

To query for a person
```
query {
  people {
    id
    firstName
    lastName
    fullName
  }
}
```
