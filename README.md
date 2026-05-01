# 🚀 Student Management API (Spring Boot)

A RESTful backend application built using Spring Boot that demonstrates core backend development concepts including CRUD operations, database integration, exception handling, security, pagination, logging.

---

## 🧠 Project Overview

This project simulates a real-world backend system for managing student data. It evolves from a basic API to a production-like system with proper architecture and best practices.

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Spring Security (Basic Auth)
* PostgreSQL
* Maven
* SLF4J Logging

---

## 🧱 Features

### ✅ Core Features

* Create, Read, Update, Delete (CRUD) operations
* Database persistence using PostgreSQL
* Layered architecture (Controller → Service → Repository)

### ✅ Advanced Features

* Global Exception Handling
* Custom Error Responses
* DTO-based response shaping
* Pagination & Sorting
* Logging (Console + File)
* Basic Authentication (Spring Security)

---

## 📁 Project Structure

```
src/main/java/com/example/demo
│
├── controller      # API endpoints
├── service         # Business logic
├── repository      # Data access layer
├── model           # Entity classes
├── dto             # Data Transfer Objects
├── exception       # Custom exceptions + global handler
├── config          # Security configuration
```

---

## 🔗 API Endpoints

### 🔹 Student APIs

| Method | Endpoint           | Description                  |
| ------ | ------------------ | ---------------------------- |
| GET    | /api/students      | Get all students (paginated) |
| GET    | /api/students/{id} | Get student by ID            |
| POST   | /api/students      | Create student               |
| PUT    | /api/students/{id} | Update student               |
| DELETE | /api/students/{id} | Delete student               |

---

## 📦 Pagination & Sorting

Example:

```
GET /api/students?page=0&size=5&sort=name,asc
```

---

## 🔐 Authentication

* Basic Authentication enabled
* Default credentials:

  * Username: user
  * Password: (generated in console)

---

## ⚠️ Error Handling

All errors are handled globally using `@RestControllerAdvice`.

Example Response:

```
{
  "error": "Student Not Found 1",
  "status": 404
}
```

---

## 📊 Logging

* Console logging enabled
* File logging: `app.log`

Log levels:

* INFO → Normal operations
* WARN → Suspicious operations
* ERROR → Exceptions

---

## 🚀 How to Run

1. Clone the repository
2. Configure PostgreSQL in `application.properties`
3. Run the application
4. Access API at:

```
http://localhost:8080/api/students
```

---

## 🧠 Key Learnings

* Building REST APIs using Spring Boot
* Structuring backend applications properly
* Handling exceptions globally
* Securing endpoints
* Scaling APIs with pagination
* Managing real-world data (files, logs)

---

## 🔮 Future Improvements

* JWT Authentication
* Role-based access control
* Cloud file storage (AWS S3)
* Docker deployment
* API documentation (Swagger)

---

## 👨‍💻 Author

Mickey

---

## ⭐ Final Note

This project represents a transition from learning backend concepts to building real-world backend systems with production-level thinking.
