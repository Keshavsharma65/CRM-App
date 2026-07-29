# 🚀 CRM Management System

A modern **Customer Relationship Management (CRM)** web application built using **Spring Boot**, **Spring MVC**, **Spring Data JPA**, **Hibernate**, **Spring Security**, **Thymeleaf**, and **MySQL**.

The application demonstrates a complete customer management system following the **MVC architecture** with secure user authentication, password encryption using BCrypt, and a clean layered design.

---

# ✨ Features

* 🔐 Secure Authentication using Spring Security
* 🔒 BCrypt Password Encryption
* 👤 Database-based User Authentication
* ➕ Add Customer
* 📋 View All Customers
* ✏️ Update Customer Details
* 🗑️ Delete Customer
* 💾 MySQL Database Integration
* 🔄 Spring Data JPA (Hibernate)
* 🎨 Responsive UI using HTML & CSS
* ⚡ Server-side rendering with Thymeleaf
* 📂 Layered Architecture (Controller → Service → Repository)

---

# 🛠️ Technologies Used

* Java 25
* Spring Boot
* Spring MVC
* Spring Security
* Spring Data JPA
* Hibernate
* Thymeleaf
* MySQL
* Maven
* IntelliJ IDEA Community Edition

---

# 📁 Project Structure

```text
CRM-App
│
├── config
│   └── SecurityConfig.java
│
├── controller
│   ├── CustomerController.java
│   └── UserController.java
│
├── entity
│   ├── Customer.java
│   ├── User.java
│   └── UserPrincipal.java
│
├── repo
│   ├── CustomerRepository.java
│   └── UserRepository.java
│
├── service
│   ├── CustomerService.java
│   ├── CustomerServiceImpl.java
│   ├── UserService.java
│   └── UserDetailsServiceImpl.java
│
├── templates
│   ├── addCustomer.html
│   ├── updateCustomer.html
│   ├── viewCustomers.html
│   └── login.html (if applicable)
│
├── application.properties
│
└── CRMApplication.java
```

---

# 🔐 Spring Security Features

* Custom `UserDetailsService`
* Custom `UserPrincipal`
* DAO Authentication Provider
* BCrypt Password Encoding
* HTTP Basic Authentication
* Authentication using users stored in MySQL
* Stateless Session Management (if configured)
* Protected Endpoints

---

# 🗄️ Database Configuration

Update your `application.properties` file with your own MySQL credentials.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/crm_app
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

# ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Keshavsharma65/CRM-App.git
```

### 2. Open the Project

Import the project as a Maven project in IntelliJ IDEA.

### 3. Create the Database

```sql
CREATE DATABASE crm_app;
```

### 4. Configure MySQL

Update the database credentials inside `application.properties`.

### 5. Run the Application

Run:

```
CRMApplication.java
```

### 6. Access the Application

```
http://localhost:8080/
```

Use one of the users stored in your database to authenticate.

---

# 📚 Concepts Covered

* Spring Boot
* Spring MVC
* MVC Architecture
* Dependency Injection (IoC)
* Spring Data JPA
* Hibernate ORM
* CRUD Operations
* Thymeleaf
* Exception Handling
* REST APIs
* Spring Security
* Authentication & Authorization Basics
* BCrypt Password Hashing
* Custom UserDetailsService
* DAO Authentication Provider
* MySQL Integration

---

# 🚀 Future Enhancements

* Role-Based Authorization (Admin/User)
* Customer Search
* Pagination & Sorting
* JWT Authentication
* User Registration
* Password Reset
* Email Verification
* Dashboard Analytics
* REST API for Frontend Integration
* React Frontend
* Docker Support
* Cloud Deployment (AWS / Render)

---

# 👨‍💻 Author

**Keshav Sharma**

GitHub: https://github.com/Keshavsharma65

---

# ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub.
