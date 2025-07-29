# Product CRUD App

This is a simple full-stack Product CRUD application using **Spring Boot**, **H2 in-memory database**, and **vanilla HTML/CSS/JavaScript** frontend. It demonstrates core backend API concepts, database integration, and basic frontend connectivity — ideal for beginners learning full-stack Java development.

---

## Features

- Add a product  
- Get a product by ID  
- Update a product  
- Delete a product  
- List all products  
- In-memory database with H2 console  
- HTML + JavaScript frontend that connects to REST APIs

---

## Tech Stack

- **Backend:** Spring Boot, Spring Web, Spring Data JPA  
- **Database:** H2 (in-memory)  
- **Frontend:** HTML, CSS, Vanilla JavaScript  
- **Build Tool:** Maven  
- **IDE Recommended:** IntelliJ IDEA / VS Code  
- **Testing:** Postman or browser frontend  

---

## How to Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-username/Product-CRUD-App.git
2. Open the project in IntelliJ or any Java IDE

3. Run the Spring Boot Application
   
4. Execute SpringWebPracticeApplication.java from your IDE

5. Access H2 Console (optional DB view)

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:ProdAPIDB

Username: sa

Password: (leave blank)

6. Open Frontend UI
7. Open src/main/resources/static/index.html in your browser
or visit http://localhost:8080/index.html directly

## API Endpoints

| Method | Endpoint             | Description                 |
|--------|----------------------|-----------------------------|
| GET    | /products            | Get all products            |
| GET    | /products/{prodID}   | Get product by ID           |
| POST   | /products            | Add a new product           |
| PUT    | /products            | Update existing product     |
| DELETE | /products/{prodID}   | Delete product by ID        |



Sample JSON for POST/PUT

{
  "prodId": 101,
  "prodName": "IPhone 15",
  "price": 80000
}

Notes

1. Frontend fetches data via fetch() and updates UI using DOM

2. No build tools like React or Angular used — simple static HTML and JS

3. CORS enabled for local HTML access using WebConfig.java

4. HTML is placed in src/main/resources/static for auto-serving


Future Enhancements

1. Add validations and exception handling

2. Add pagination and filtering

3. Replace H2 with MySQL/PostgreSQL

4. Deploy backend to cloud (e.g., Render/Heroku)

5. Make UI responsive and user-friendly

6. Use DTOs and model mappers for better architecture

7. Add Swagger for API documentation


Author
Samadrita Paul
Created this project to demonstrate full-stack fundamentals using Spring Boot and vanilla frontend tools.

License
MIT — free to use, improve, and share.
