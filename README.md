schema.sql 

CREATE DATABASE employeeservicedb;
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    designation VARCHAR(100),
    salary DECIMAL(15, 2),
    department VARCHAR(100)
);
Instructions:
1. Need to Define .proto File
2. Create employee.proto inside /proto directory in /src/main.
3. Generate gRPC Classes
4. Use protoc to generate Java classes from the .proto file.
5. Configure application.properties
Configure MySQL connection in src/main/resources/application.properties:
spring.application.name=rest-api-development
spring.datasource.url=jdbc:mysql://localhost:3306/employeeservice
spring.datasource.username=Local
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
6. Testing and Running the Application
7. Run the Application
8. Ensure MySQL is running and properly configured. Run the Spring Boot application using:
mvn spring-boot:run.
9.Test REST API
10.Use a tool like Postman to test the REST API endpoints:
POST /api/employees
GET /api/employees
GET /api/employees/{id}
PUT /api/employees/{id}
DELETE /api/employees/{id}
11.Test gRPC Service Use a gRPC client like BloomRPC to interact with the gRPC service

