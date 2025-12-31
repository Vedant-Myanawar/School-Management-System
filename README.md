🏫 School Management System

A full-stack School Management System built using Spring Boot, Thymeleaf, and MySQL, designed to manage students, teachers, classes, holidays, and announcements with secure role-based access.

✨ Project Overview

The School Management System simplifies school administration by providing a centralized platform for managing academic and administrative activities.
It follows the MVC architecture, ensuring clean separation of concerns between Controller, Service, Repository, and View layers.

🧰 Tech Stack
🔙 Backend

Java

Spring Boot

Spring MVC

Spring Security

Spring Data JPA + Hibernate

MySQL / H2 Database

Maven

🎨 Frontend

Thymeleaf

HTML5

CSS3

Bootstrap

Thymeleaf Fragments (Header, Footer, Layouts)

🛠 Tools

IntelliJ IDEA

Git & GitHub

Postman

Maven

🔐 Authentication & Security

Secure Login & Registration

Role-Based Access Control

Admin

Student

Teacher

Protected URLs using Spring Security

Session-based authentication

🎓 Core Features
👨‍🎓 Student Management

Add, update, and delete students

View student profiles

Assign students to classes

Search students efficiently

👩‍🏫 Teacher Management

Manage teacher details

Assign teachers to subjects and classes

View assigned classes

🏫 Class & Holiday Management

Create and manage classes

Display holidays dynamically

Holiday data stored in database

Clean UI for holiday listing

📢 Announcements

Admin can post school notices

Notices visible to all users

Centralized announcement system

🛡️ Security Implementation

Spring Security configuration

Form-based authentication

Role-based authorization

Secured controllers and Thymeleaf views

📁 Project Structure
🔙 Backend (Spring Boot)
src/main/java
 ├── controller
 ├── model
 ├── repository
 ├── service
 ├── config
 └── util

🎨 Frontend (Thymeleaf)
src/main/resources/templates
 ├── fragments
 ├── layouts
 ├── pages
 └── index.html

📦 Key Endpoints
Endpoint	Method	Description
/login	GET / POST	User login
/register	POST	User registration
/students	GET	View students
/students/add	POST	Add student
/teachers	GET	View teachers
/holidays	GET	View holidays
/dashboard	GET	Role-based dashboard
🚀 Running the Project
✅ Prerequisites

Java 17+

MySQL / H2

Maven

Git

⚙️ Setup
git clone https://github.com/your-username/school-management-system.git
cd school-management-system

🗄️ application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/school_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

▶️ Run Application
./mvnw spring-boot:run

🔮 Future Enhancements

Attendance Management

Online Fee Payment

Student Marks & Report Cards

Email Notifications

Admin Analytics Dashboard
