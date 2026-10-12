# Java E-commerce Order Management System

A lightweight Java console application demonstrating object-oriented programming through a simplified e-commerce order management model.

![Java](https://img.shields.io/badge/Java-17%2B-007396?style=flat&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-Object--Oriented-blue?style=flat)
![Enums](https://img.shields.io/badge/Design-Type--Safe%20Enums-6A5ACD?style=flat)
![Status](https://img.shields.io/badge/Status-Learning%20Project-blue?style=flat)
![License](https://img.shields.io/badge/License-Not%20specified-lightgrey?style=flat)

## Overview

This project models the basic structure of an e-commerce order management system using core Java concepts. It represents customers, orders, payment methods, and order statuses through a small set of classes and enums.

The goal is to demonstrate clean object-oriented fundamentals, including encapsulation, composition, and type-safe business values, in a simple and easy-to-understand implementation.

**Project scope:** This is an educational console application. It does not implement a complete e-commerce workflow, database persistence, or payment processing.

## Features

- **Customer modeling:** A `Customer` class encapsulates customer information, including name and email.
- **Order representation:** An `Order` associates a customer with an order identifier, payment method, and current status.
- **Typed order statuses:** The `OrderStatus` enum defines `PENDING`, `SHIPPED`, `DELIVERED`, and `CANCELLED`, with human-readable descriptions.
- **Payment method modeling:** The `PaymentMethod` enum represents `CASH`, `CREDIT_CARD`, and `PAYPAL` as predefined values.
- **Status updates:** The `updateStatus()` method allows an order's status to be changed.
- **Console output:** The `printOrderDetails()` method displays order information in a readable format.
- **In-memory execution:** Sample customers and orders are created in `Main.java`, without requiring a database or external dependencies.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java 17+ | Core application language |
| Java classes | Customer and order domain modeling |
| Java enums | Order status and payment method representation |
| `javac` | Direct compilation |
| IntelliJ IDEA | Supported development environment |

No third-party libraries or build tools are required by the documented workflow.

## Project Structure

```text
E-commerce_System/
└── src/
    ├── Customer.java
    ├── Order.java
    ├── OrderStatus.java
    ├── PaymentMethod.java
    └── Main.java
```

### Main Components

| Component | Responsibility |
|---|---|
| `Customer.java` | Encapsulates customer information |
| `Order.java` | Represents an order and its relationship with a customer |
| `OrderStatus.java` | Defines available order statuses and their descriptions |
| `PaymentMethod.java` | Defines supported payment method values |
| `Main.java` | Application entry point and demonstration scenarios |

## Getting Started

### Prerequisites

- JDK 17 or later
- A terminal or an IDE such as IntelliJ IDEA

### Clone the Repository

```bash
git clone https://github.com/ELGHAD/E-commerce_System.git
cd E-commerce_System
```

### Compile and Run

```bash
cd src
javac *.java
java Main
```

The program creates sample objects and displays order details, including the customer, payment method, and current order status.

### Run with IntelliJ IDEA

Open the project in IntelliJ IDEA and run `Main.java`. A compatible JDK must be configured.

## Object-Oriented Design

### Encapsulation

Customer and order data are encapsulated in classes and exposed through getters where appropriate. This keeps the data representation separate from the code that uses these objects.

### Composition

An `Order` references a `Customer` object rather than duplicating customer information. This models the relationship between an order and the person who placed it.

### Type-Safe Enums

`OrderStatus` and `PaymentMethod` define a finite set of valid values. Using enums makes the model more expressive than representing these values with arbitrary strings or integers.

### Default State

New orders start with the `PENDING` status, providing a consistent initial state for the example workflow.

## Current Limitations

This project intentionally focuses on Java fundamentals. It does not currently provide:

- Product catalog or shopping cart management
- Product pricing, totals, taxes, or discounts
- Database persistence or order history
- Real payment processing
- Input validation and comprehensive business rules
- Automated unit or integration tests
- A web interface or REST API

Changing an order's status through `updateStatus()` should not be interpreted as a complete order lifecycle implementation with transition validation.

## Potential Improvements

Possible next steps include:

1. Add product and order-item classes with quantity and price calculations.
2. Validate customer information and order data.
3. Enforce valid order status transitions.
4. Add unit tests with JUnit.
5. Introduce Maven or Gradle for reproducible builds and dependency management.
6. Add persistence with PostgreSQL or MySQL.
7. Extend the model into a Spring Boot REST API.

These improvements would turn the current learning exercise into a more complete backend engineering project.

## Author

**Hamza Elrhadiouini**

- GitHub: [@ELGHAD](https://github.com/ELGHAD)
- Portfolio: [elghad.github.io/hamza-elrhadiouini-portfolio](https://elghad.github.io/hamza-elrhadiouini-portfolio)
