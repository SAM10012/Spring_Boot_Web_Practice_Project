# Spring Boot Product CRUD API

A simple Spring Boot-based RESTful API that manages a list of products using full CRUD operations (Create, Read, Update, Delete). This is a beginner-friendly project demonstrating clean controller-service-model architecture without database integration (uses in-memory data).

## Features

- Retrieve all products
- Retrieve a product by ID
- Add a new product
- Update an existing product
- Delete a product

## Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Lombok
- RESTful APIs
- Postman (for testing)

## Project Structure

com.pauls.SpringWebPractice
│
├── controller # REST controllers (ProductController)
├── service # Business logic (ProductService)
└── model # Data model (Product)

## Endpoints

| Method | Endpoint             | Description           |
|--------|----------------------|-----------------------|
| GET    | `/products`          | Get all products      |
| GET    | `/products/{prodID}` | Get product by ID     |
| POST   | `/products`          | Add a new product     |
| PUT    | `/products`          | Update product        |
| DELETE | `/products/{prodID}` | Delete product by ID  |

## Sample JSON (POST/PUT)

```json
{
  "prodId": 103,
  "prodName": "Samsung TV",
  "price": 45000
}

