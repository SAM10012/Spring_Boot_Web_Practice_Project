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

## How to Run

1. Clone the repository:
git clone https://github.com/your-username/spring-product-crud.git

2. Open in IntelliJ or VS Code.

3. Run SpringWebPracticeApplication.java.

4. Test the endpoints using Postman or any API testing tool.

## Future Enhancements

1. Integrate with a real database (e.g., MySQL)

2. Add validation and exception handling

3. Implement Swagger documentation


Author: Samadrita Paul
License: MIT
