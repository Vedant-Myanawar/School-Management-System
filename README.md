# 🏫 School Management System (SMS)

A full-stack **School Management System** designed to manage and automate core school operations such as students, teachers, classes, attendance, holidays, and authentication. The system is built using **Spring Boot**, **Thymeleaf**, and **MySQL/H2**, following a clean MVC architecture with proper role-based access control.

---

## 🔧 Tech Stack

### Backend
- Java 23  
- Spring Boot  
- Spring MVC  
- Spring Security  
- Spring Data JPA + Hibernate  
- MySQL / H2 Database  
- RESTful APIs (GET, POST, PUT, DELETE)  
- MVC Architecture  

### Frontend
- HTML5  
- CSS3  
- Bootstrap  
- Thymeleaf (Server-Side Rendering)  

### Tools
- IntelliJ IDEA / Eclipse  
- Postman (API Testing)  
- Git & GitHub  
- Maven  

---

## ✨ Features

### 🔐 Authentication & Authorization
- Secure login using Spring Security  
- Role-based access control (Admin / Student / Teacher)  
- Protected endpoints and views  
- Session-based authentication  

---

### 👨‍🎓 Student Management
- Add, update, delete students  
- View student details  
- Assign students to classes  
- View attendance records  

---

### 👩‍🏫 Teacher Management
- Add and manage teachers  
- Assign teachers to subjects/classes  
- View teacher details  

---

### 📚 Class & Subject Management
- Create and manage classes  
- Assign subjects to classes  
- Map teachers to subjects  

---

### 📝 Attendance Management
- Mark daily attendance  
- View attendance history  
- Class-wise attendance tracking  

---

### 🎉 Holiday Management
- Add school holidays  
- Display holiday list dynamically  
- Date-based filtering of holidays  

---

## 🛡️ Security
- Spring Security configuration  
- Role-based authorization  
- Secured controllers and routes  
- CSRF protection enabled  

---

## 📁 Project Structure

### Backend (Spring Boot)
src/
├── controller/
├── model/
├── repository/
├── service/
├── config/
└── util/

shell
Copy code

### Frontend (Thymeleaf)
src/main/resources/
├── templates/
│ ├── fragments/
│ ├── pages/
│ └── layouts/
└── static/
├── css/
├── js/
└── images/

yaml
Copy code

---

## 📦 API Endpoints Overview

| Endpoint | Method | Description |
|--------|--------|------------|
| `/login` | POST | User login |
| `/students` | GET | View all students |
| `/students/add` | POST | Add new student |
| `/teachers` | GET | View all teachers |
| `/attendance` | POST | Mark attendance |
| `/holidays` | GET | View holidays |
| `/holidays/add` | POST | Add holiday |

---

## 🚀 Running the Project

### ✅ Prerequisites
- Java 23+  
- MySQL / H2 Database  
- Maven  
- Git  

---

### 🔙 Backend Setup (Spring Boot)

```bash
git clone https://github.com/your-username/school-management-system.git
cd school-management-system
Configure application.properties
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/school_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
