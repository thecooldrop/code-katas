# Create Spring Boot Hello World Application protected by TLS

In this exercise we will practise using the TLS to protect our 
Spring Boot applications. 

The goal of this exercise is to:

- Write a Spring Application which has one controller with one
  GET endpoint. This endpoint should simply return `Hello World!` text
- The application can be accessed via HTTPS
- The application can not be accessed via HTTP

# Solution

The solution to this is demonstrated in the 
corresponding solution directory. All we have to
do is generate a certificate and assign some
configuration properties to our Spring Boot application.

In order to configure the Spring Boot application with
TLS we use `server.ssl.*` Spring Boot application properties.

[//]: # (TODO: Change the hello world controller with Spring Pet Clinic for more
WOW effect)

[//]: # (Add guidance on generating actual cert with keytool)
