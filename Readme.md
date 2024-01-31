# Vite App with Spring Boot Backend

This repository contains a Vite app connected to a Spring Boot backend. It demonstrates basic CRUD operations for managing tasks.

## Prerequisites

Before running the application, ensure you have the following installed:

- Node.js (v20 or higher)
- npm (v10 or higher)
- Java Development Kit (JDK) (v21 or higher)
- PostgreSQL 

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/dawoodtrumboo/SpringBoot_Todo.git
cd your-repo
```


### 2. Set Up Spring Boot Backend
```bash
Navigate to the backend directory.

cd server

Update the PostgreSQL database configuration in src/main/resources/application.properties.

spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabasename
spring.datasource.username=yourusername
spring.datasource.password=yourpassword

Run the Spring Boot application.

./mvnw spring-boot:run or java -jar target/todo-crud.jar
```

### 3. Set Up Vite Frontend
```bash
Open a new terminal and navigate to the root directory.

cd client

Install dependencies.

npm install

Update the API base URL in .env to match your Spring Boot backend URL.

Run the Vite app.

npm run dev
```