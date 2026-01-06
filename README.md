# Order & Inventory Backend API

A Spring Boot backend project that manages **products**, **orders**, and **inventory** with real business rules and correct JPA behavior.

This project focuses on **backend fundamentals** such as entity relationships, service-layer orchestration, update/delete correctness, and data consistency — not just basic CRUD.

---

## 🧠 Core Concepts Practiced

- REST API design (Controller → Service → Repository)
- JPA entity lifecycle and managed entities
- Many-to-One relationships with an association entity
- Business rule enforcement
- Correct update logic (`find → change → save`)
- Delete constraints and consistency
- Service-to-service orchestration
- Testing endpoints with Postman

---

## 📦 Domain Model

### Entities
- **Product**
  - name
  - price
  - stock

- **Order**
  - creation date

- **OrderItem**
  - product
  - quantity
  - order

`OrderItem` acts as the association entity between `Order` and `Product`.

---

## 🔁 Main Features

### Product Management
- Create, update, delete, and list products
- Prevent deletion of products that are part of existing orders

### Order Creation
- Create an order using product IDs and quantities
- Check stock availability before creating an order
- Reduce product stock on successful order creation

### Order Retrieval
- Get all orders
- Get an order by ID
- View products and quantities within an order

### Deletion Rules
- Deleting an order restores product stock
- Deleting a product is forbidden if referenced by an order

---

## 🛠️ Technology Stack

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman (API testing)

---

## 🧪 How to Run

1. Clone the repository
2. Run the Spring Boot application
3. Access H2 Console:
