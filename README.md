# Spring Boot demo project by Roland Balogh
This project is a Spring Boot application that can store metering data.

## Description
Using the following endpoints, different operations can be achieved:
- `/clients` - This returns the list of clients.
- `/clients/post` - This is the saving endpoint for clients. JSON example: { "name": "Matthew Nichols", "address": "3344 East 100 North Princeton, IN 47670, USA" }
- `/clients/{clientId}` - This returns a specific client's meter data. ClientId is the identifier of a Client.
- `/clients/{clientId}/post` - This updates a specific client's meter data. JSON example: { "year": "2018", "month": "January", "value": 12 }
- `/clients/{clientId}/oneyear` - This returns a specific client's measurement values. The response contains only one year (last 12 months).
- `/clients/{clientId}/total/{year}` - This returns a specific client's TOTAL measurement data. Total is the latest, highest data.
- `/clients/{clientId}/{month}/{year}` - This returns a specific client's measurement data based on the chosen month and year. For example: /clients/1/january/2018

## Only functional requirements (3)
- `/clients/{clientId}/total/{year}`
- `/clients/{clientId}/oneyear`
- `/clients/{clientId}/{month}/{year}`

## Libraries used
- Spring Boot
- Spring MVC (Spring Web)
- Spring Data JPA with Hibernate
- H2 Database

## Tools used
- Spring Tool Suite 3.9.6
- Ubuntu Linux 18.04
- POSTMAN
- H2 - localhost:8080/db (Dummy data is in the data.sql)

## Compilation Command
- `mvn clean install` - Maven clean and install
