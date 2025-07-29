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

## Project Structure

src
├── main
│ ├── java
│ │ └── com.pauls.SpringWebPractice
│ │ ├── controller
│ │ │ └── ProductController.java
│ │ ├── model
│ │ │ └── Product.java
│ │ ├── repository
│ │ │ └── ProductRepo.java
│ │ ├── service
│ │ │ └── ProductService.java
│ │ ├── config
│ │ │ └── WebConfig.java
│ │ └── SpringWebPracticeApplication.java
│ └── resources
│ ├── static
│ │ └── index.html
│ └── application.properties



## How to Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-username/Product-CRUD-App.git
Open the project in IntelliJ or any Java IDE

Run the Spring Boot Application
Execute SpringWebPracticeApplication.java from your IDE

Access H2 Console (optional DB view)

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:ProdAPIDB

Username: sa

Password: (leave blank)

Open Frontend UI
Open src/main/resources/static/index.html in your browser
or visit http://localhost:8080/index.html directly

API Endpoints
Method	Endpoint	Description
GET	/products	Get all products
GET	/products/{prodID}	Get product by ID
POST	/products	Add a new product
PUT	/products	Update existing product
DELETE	/products/{prodID}	Delete product by ID

application.properties

spring.application.name=SpringWebPractice
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:ProdAPIDB
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.show-sql=true


Sample JSON for POST/PUT

{
  "prodId": 103,
  "prodName": "Samsung TV",
  "price": 45000
}

Notes
Frontend fetches data via fetch() and updates UI using DOM

No build tools like React or Angular used — simple static HTML and JS

CORS enabled for local HTML access using WebConfig.java

HTML is placed in src/main/resources/static for auto-serving


Future Enhancements
Add validations and exception handling

Add pagination and filtering

Replace H2 with MySQL/PostgreSQL

Deploy backend to cloud (e.g., Render/Heroku)

Make UI responsive and user-friendly

Use DTOs and model mappers for better architecture

Add Swagger for API documentation


Author
Samadrita Paul
Created this project to demonstrate full-stack fundamentals using Spring Boot and vanilla frontend tools.

License
MIT — free to use, improve, and share.
