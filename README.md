 Cognizant Deep Skilling Program - Java Backend & Spring Boot Exercises

This repository showcases the hands-on tasks and learning modules completed as part of the **Cognizant Deep Skilling Program**. It includes real-world backend development scenarios using **Spring Boot**, **Spring Core**, **REST APIs**, **Spring Data JPA**, **JUnit**, **Mockito**, **SLF4J Logging**, and **PL/SQL**.


📌 Topics Covered

🔹 Spring Boot
- Setup via [Spring Initializr](https://start.spring.io)
- Annotation: `@SpringBootApplication`, `SpringApplication.run()`
- Application structure walkthrough

🔹 Spring Core
- Bean creation using XML: `country.xml`
- IoC Container: `ApplicationContext`, `ClassPathXmlApplicationContext`
- Dependency Injection: Constructor & Setter Injection

🔹 RESTful Web Services
- `@RestController`, `@RequestMapping`, `@GetMapping`
- Endpoints:
  - `/hello` → Returns `Hello World!!`
  - `/country` → Returns India country details
  - `/countries/{code}` → Returns country by ISO code (case-insensitive)

 🔹 Spring Data JPA + MySQL
- Entity: `Country.java`
- Repository: `CountryRepository` (extends `JpaRepository`)
- Service Layer: `CountryService`
- Configured using `application.properties`
- Connected to MySQL DB with schema `ormlearn`

🔹 SLF4J + Logback Logging
- Logger setup using `LoggerFactory`
- Configured logging levels and patterns
- Log messages in constructors, setters, and service methods

 🔹 JUnit Testing
- Maven-based setup with JUnit 4/5
- Basic test cases, assertions (`assertEquals`, `assertTrue`, etc.)
- Used `@Before`, `@After`, and AAA pattern

🔹 Mockito
- Mocking dependencies for unit testing
- Stubbing methods using `when(...).thenReturn(...)`
- Verifying interactions using `verify(...)`

 🔹 PL/SQL Exercises (SQL Workbench)
- Control Structures: Age-based discounts, VIP flag
- Error Handling: Fund transfer, salary update
- Stored Procedures: Interest calculation, salary bonus
- Functions: Age calculation, balance checks
- Triggers: Audit logs, data validation
- Cursors & Packages


 🔧 Tools & Technologies

| Category         | Technology                      |
|------------------|----------------------------------|
| Language         | Java 17 / 22                    |
| Frameworks       | Spring Boot, Spring Core        |
| Testing          | JUnit 4/5, Mockito              |
| Logging          | SLF4J, Logback                  |
| Database         | MySQL 8.x, SQL Workbench        |
| Build Tool       | Maven 3.6+                      |
| IDE              | Eclipse / VS Code               |
| API Testing      | Postman                         |





