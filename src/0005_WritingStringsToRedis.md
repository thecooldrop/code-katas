# Writing Strings to Redis

The goal of this exercise is to get familiar with basics of using Redis. In this most simple example we will
create an application such that:

- Application has a HTTP POST endpoint
- The endpoint expects the body of the POST method to be a simple string
- String passed to endpoint gets written to Redis
- Application has a GET endpoint, which is used to retrieve all written strings
- Application has a DELETE endpoint, which enables us to delete a single string