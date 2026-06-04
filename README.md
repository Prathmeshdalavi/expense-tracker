
# Expense Tracker (Spring Boot MVC)

## Project Overview

Expense Tracker is a Spring Boot-based web application designed to help users manage and track their daily expenses efficiently. It provides user authentication, session management, and a simple dashboard to manage financial records in a structured way using MVC architecture.

👉 **Live Demo:** [https://expense-tracker-nen5.onrender.com/login](https://expense-tracker-nen5.onrender.com/login)

---

## Technologies Used

* Java 17
* Spring Boot
* Spring MVC
* Spring Data JPA
* Thymeleaf
* MySQL
* Hibernate
* RESTful Web Concepts (basic)
* Maven
* Bootstrap (UI styling)

---

## Architecture

The application follows a layered MVC architecture:

Client (Browser) → Controller → Service → Repository → Database

* Controller: Handles HTTP requests and responses
* Service Layer: Contains business logic
* Repository Layer: Communicates with database
* View Layer (Thymeleaf): Renders UI pages (login, register, dashboard)

---

## Features

* User Registration and Login system
* Session-based authentication
* Login/logout functionality
* Protected dashboard access
* Expense tracking (add/view/update/delete - if implemented)
* Clean MVC architecture
* Form validation and error handling
* Simple and responsive UI using Thymeleaf

---

## Database

* MySQL database
* JPA/Hibernate for ORM mapping
* User entity for authentication
* Expense entity for tracking records
* Relational data handling using Spring Data JPA

---

## Security & Session Management

* Session-based login system using HttpSession
* Authentication check before accessing dashboard
* Logout invalidates session securely
* Redirect-based access control

---

## API / Web Flow

* `/login` → Login page
* `/register` → User registration
* `/` → Redirects to login or dashboard based on session
* `/dashboard` → Main expense management page
* `/logout` → Ends session

---

## Deployment

* Deployed on Render
* MySQL database connected via cloud configuration
* Spring Boot JAR deployed as web service
* Environment-based configuration support

---

## API Testing

Basic request testing done using browser and Postman (where applicable) for backend validation and debugging.

---

## Author

Prathmesh Dalavi
