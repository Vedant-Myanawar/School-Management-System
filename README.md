🎓 School Management System

A full-stack School Management System built using Spring Boot, Thymeleaf, and MySQL to manage core school operations efficiently. The system provides role-based access for admins, teachers, and students, along with secure authentication and dynamic data management. It follows MVC architecture with clean separation of concerns.

🔧 Tech Stack
Backend

Java

Spring Boot

Spring MVC

Spring Security (Basic / Role-based)

Spring Data JPA + Hibernate

MySQL / H2 Database

RESTful APIs

MVC Architecture

Frontend

Thymeleaf

HTML5

CSS3

Bootstrap

JavaScript

Tools

IntelliJ IDEA / Eclipse

Git & GitHub

Maven

Postman

H2 Console

✨ Features
🔐 Authentication & Authorization

Secure login system

Role-based access control (Admin / Teacher / Student)

Protected pages based on user roles

🏫 School Management

Admin:

Manage students and teachers

Add and update holidays

Publish notices and announcements

View school-related data

Teacher:

View assigned information

Access notices and holidays

Student:

View holidays and notices

Access school-related information

🛡️ Security

Spring Security for authentication

Role-based page access

Secure form validation

📁 Project Structure
Backend (Spring Boot)
src/
 ├── controller/
 ├── model/
 ├── repository/
 ├── service/
 ├── config/
 └── util/

Frontend (Thymeleaf)
src/
 └── templates/
     ├── fragments/
     ├── pages/
     └── index.html
