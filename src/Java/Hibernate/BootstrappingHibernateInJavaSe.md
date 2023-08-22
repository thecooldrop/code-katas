# Introduction

Hibernate is often used prepackaged within your framework of choice.
In such setups the frameworks, such as Quarkus and Spring Boot, take
care of configuring the Hibernate and necessary Hibernate components
for the user of the library.

We feel that while such an approach is fast, it keeps the users
shielded from complexity should they need to make
changes and adaptions to the preconfigured instances of Hibernate.

# Goal

The goal of this exercise is to gain rudimentary understanding
of components which are necessary for running Hibernate.

# Exercise

The exercise will be described as list of acceptance criteria
which need to be satisfied the application you are about to develop:

- Beside Hibernate and mentioned allowed dependencies no additional
  external dependencies are allowed
- Java SE is allowed. Java Jakarta (formerly known as EE) is forbidden
- Instance of EntityManager can be obtained from Hibernate.
- EntityManager can be used to read/write/delete data from/to database
- Hibernate Entities are configured strictly using annotations
- Hibernate configuration paramaters are retrieved from system properties 
  or environment variables