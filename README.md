to run
./mvnw spring-boot:run
./mvnw clean package


see at localhost:8080/abilities?id=1

h2 repo visible at:
http://localhost:8080/h2
    - change setup at
        -application.properties


http://localhost:8080/actuator/health


This project is a simple rest API that returns info from an in memory DB. 

# Includes
- Flyway - Data migration and tracking tool
- h2 - in memory DB
- springBoot data JPA - easy repository handling with connection to the database
- actuator - easy health endpoint checks 
- lombok -  framework that deals with repetitive code I.E getters and setters

    