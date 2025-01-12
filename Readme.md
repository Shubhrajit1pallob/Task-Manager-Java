# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.task-manager' is invalid and this project uses 'com.example.task_manager' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.1/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.1/gradle-plugin/packaging-oci-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.1/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.1/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.1/reference/using/devtools.html)


# Task Manager

This is a simple Task Manager application built with Spring Boot.

## Prerequisites

- Java 21
- Docker
- Gradle

## Building the Project

To build the project, run the following command:

```sh
./gradlew build
```

##Running the Application

```sh
docker build -t task-manager .
docker run -p 8080:8080 task-manager
```
The application will be accessible at http://localhost:8080.


## Endpoints

- GET / - Returns a welcome message.

## Running Tests
To run the tests, use the following command:

```sh
./gradlew test
```

# License
This project is licensed under the Apache License 2.0. See the LICENSE file for details.



### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


