# Student Management REST API

A RESTful API for managing student records using Spring Boot, Spring Data JPA, and MySQL.

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Postman

## Features

* Create a student
* Get all students
* Get a student by ID
* Update student details
* Delete a student
* Store student data in MySQL

## Project Architecture

The application follows a layered architecture:

**Controller → Service → Repository → Database**

### Controller

Handles HTTP requests and API endpoints.

### Service

Contains the application and business logic.

### Repository

Uses Spring Data JPA to interact with the database.

### Database

MySQL is used for persistent data storage.

## API Endpoints

| Method | Endpoint               | Description          |
| ------ | ---------------------- | -------------------- |
| POST   | `/api/students/create` | Create a new student |
| GET    | `/api/students`        | Get all students     |
| GET    | `/api/students/{id}`   | Get a student by ID  |
| PUT    | `/api/students/{id}`   | Update a student     |
| DELETE | `/api/students/{id}`   | Delete a student     |

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/spring-boot-student-crud-api.git
```

### 2. Open the Project

Open the project in IntelliJ IDEA or any Java IDE that supports Maven and Spring Boot.

### 3. Configure MySQL

Create a MySQL database and update the database configuration in:

```text
src/main/resources/application.properties
```

Make sure your database URL, username, and password are configured correctly.

### 4. Run the Application

Run the main Spring Boot application class from your IDE.

Or use Maven:

```bash
mvn spring-boot:run
```

The application will run on:

```text
http://localhost:8080
```

## Testing

The REST API endpoints can be tested using Postman.

## Future Improvements

* Add input validation
* Add global exception handling
* Add pagination and sorting
* Add Swagger/OpenAPI documentation
* Add authentication and authorization
