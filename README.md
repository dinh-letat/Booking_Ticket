# Booking Ticket Website #

 Link Project: 

## Create Project Step By Step ##
### Step 1: Prepare delevopment environment ###
1. Setup Java and Spring Boot:
   - Setup Java Development Kit (JDK): https://www.oracle.com/java/technologies/javase-downloads.html
   - Setup Spring Initializer to create a Spring Boot Project: https://start.spring.io/
   - Add dependencies to your project:
        + Spring Web:  `spring-boot-starter-web` 
        + Spring Data JPA: `spring-boot-starter-data-jpa`
        + MySQL Database: `mysql-connector-java`
        + SpringBoot Devtools: `spring-boot-devtools`
        + Lombook: `lombok`
        + Spring Boot Test: `spring-boot-starter-test`
        + Thymeleaf: `spring-boot-starter-thymeleafspring-boot-starter-thymeleaf`
        + Spring Security: `spring-boot-starter-security`
        + H2 Database: `h2`
2. Setup MySQL:
   - Setup MySQL Server: https://dev.mysql.com/downloads/mysql/
   - Create a database for your project, database has name "booking_ticket"
   - Database has 7 table: users, tours, bookings, reviews, images, payments, locations
   - Configuration to database:
      -   `spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name`
      -   `spring.datasource.username=your_database_username`
      -   `spring.datasource.password=your_database_password`
      -   `spring.jpa.hibernate.ddl-auto=update`
---
### Step 2: Development Backend with Spring Boot ###
1. Create Entity, Repository and Service:
   - Entity class: these classes represents user information in the database
   - Repository class: CRUD with database
   - Service class: perform user-related processing logic
   - Create Java classes to ... for entities in database.
   - Build JPARepository to interact with database.
   - Implement business logic in Services.
3. Build API Restful:
   - Use @RestController to build APIs for create, update, delete and get infomation from database.
   - Ensure handle request and response the data in JSON format.
4.  Connect Frontend to Backend:
   - Establish HTTP request from frontend to call APIs from backend.
   - Handle data returned from API and display this to frontend
