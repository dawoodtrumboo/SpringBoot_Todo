# Vite App with Spring Boot Backend

This repository contains a Vite app connected to a Spring Boot backend. It demonstrates basic CRUD operations for managing tasks.

## Prerequisites

Before running the application, ensure you have the following installed:

- Node.js (v14 or higher)
- npm (v7 or higher)
- Java Development Kit (JDK) (v11 or higher)
- PostgreSQL (optional, for Spring Boot backend)

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/your-repo.git
cd your-repo
2. Set Up Spring Boot Backend
Navigate to the spring-boot-backend directory.

cd spring-boot-backend

Update the PostgreSQL database configuration in src/main/resources/application.properties.

spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabasename
spring.datasource.username=yourusername
spring.datasource.password=yourpassword

Run the Spring Boot application.

./mvnw spring-boot:run

3. Set Up Vite Frontend
Open a new terminal and navigate to the root directory.

cd your-repo

Install dependencies.

npm install

Update the API base URL in src/services/api.js to match your Spring Boot backend URL.

JavaScript

const BASE_URL = 'http://localhost:8080'; // Replace with your Spring Boot backend URL
AI-generated code. Review and use carefully. More info on FAQ.
Run the Vite app.

npm run dev