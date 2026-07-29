# 🚀 CRM Management System

A modern Customer Relationship Management (CRM) web application built using **Spring Boot**, **Spring MVC**, **Spring Data JPA**, **Hibernate**, **Thymeleaf**, and **MySQL**.

This project demonstrates a complete CRUD application with a responsive user interface and follows the MVC architecture.

---

## 📌 Features

- ➕ Add Customer
- 📋 View All Customers
- ✏️ Update Customer Details
- 🗑️ Delete Customer
- 💾 MySQL Database Integration
- 🔄 Spring Data JPA (Hibernate)
- 🎨 Responsive UI using HTML & CSS
- ⚡ Server-side rendering with Thymeleaf
- 📂 Layered Architecture (Controller → Service → Repository)

---

## 🛠️ Technologies Used

- Java 25
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- MySQL
- Maven
- IntelliJ IDEA Community Edition

---

## 📁 Project Structure

```
CRM-App
│
├── controller
│   └── CustomerController.java
│
├── entity
│   └── Customer.java
│
├── repository
│   └── CustomerRepository.java
│
├── service
│   ├── CustomerService.java
│   └── CustomerServiceImpl.java
│
├── templates
│   ├── viewCustomers.html
│   ├── addCustomer.html
│   └── updateCustomer.html
│
├── application.properties
│
└── CRMApplication.java
```

---

## 🗄️ Database Configuration

Update the `application.properties` file with your MySQL credentials.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/crm_app
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Keshavsharma65/CRM-App.git
```

### 2. Open in IntelliJ IDEA

Import the project as a Maven project.

### 3. Create Database

```sql
CREATE DATABASE crm_app;
```

### 4. Configure MySQL Credentials

Edit `application.properties`.

### 5. Run the Application

Run:

```
CRMApplication.java
```

### 6. Open Browser

```
http://localhost:8080/view
```

## 📚 Concepts Covered

- Spring Boot
- MVC Architecture
- RESTful Controller Mapping
- Dependency Injection
- Spring Data JPA
- Hibernate ORM
- CRUD Operations
- Thymeleaf Templating
- Form Binding
- Model Attributes
- Path Variables
- MySQL Integration

---

## 🚀 Future Enhancements

- 🔍 Customer Search
- 📄 Pagination & Sorting
- 🔐 Spring Security Authentication
- 👤 User Roles (Admin/User)
- 📊 Dashboard Analytics
- 📧 Email Notifications
- 📱 Responsive Bootstrap UI
- ☁️ Cloud Deployment
- 🐳 Docker Support

---

## 👨‍💻 Author

**Keshav Sharma**

GitHub: https://github.com/Keshavsharma65

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
