# Adapt a Spring Boot Application to require basic authentication for all sites

As per title in this exercise we will start with a fully built application, and
we will retrospect it with [Basic authentication](https://developer.mozilla.org/en-US/docs/Web/HTTP/Authentication)
for all the endpoints. For our purposes we will be using the 
[Spring Pet Clinic](https://github.com/spring-projects/spring-petclinic).

Goal is to protect the endpoints:

- Any attempt to access a web page without authentication will respons with
  HTTP Status 401 Unauthoriezd with WWW-Authenticate header properly
  set for Basic authentication
- All endpoints are protected by Basic authentication scheme

