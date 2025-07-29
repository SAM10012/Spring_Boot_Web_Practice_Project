Product CRUD App (Spring Boot + H2 + Vanilla JS)
A simple full-stack Product CRUD application using Spring Boot, H2 in-memory database, and vanilla HTML/CSS/JavaScript frontend to demonstrate core backend and API integration concepts.

✅ Features
Add, view, update, and delete products.

RESTful API with endpoints for all CRUD operations.

Frontend built with vanilla HTML/CSS/JS using fetch() API.

Integrated in-memory H2 database (no setup required).

CORS enabled for frontend-backend communication.

Clean architecture using Controller, Service, Repository layers.

⚙️ Tech Stack
Backend: Spring Boot (REST APIs)

Database: H2 (in-memory, no installation required)

Frontend: HTML + CSS + JavaScript (no frameworks)

Build Tool: Maven

📁 Project Structure
css
Copy
Edit
SpringWebPractice/
├── controller/         → REST endpoints
├── model/              → Product entity
├── repository/         → Spring Data JPA repository
├── service/            → Business logic layer
├── config/             → CORS configuration
├── static/index.html   → Frontend interface (HTML)
├── application.properties
└── main class          → Spring Boot starter
🔗 API Endpoints
Method	Endpoint	Description
GET	/products	Get all products
GET	/products/{id}	Get product by ID
POST	/products	Add a new product
PUT	/products/{id}	Update existing product
DELETE	/products/{id}	Delete product

🧪 H2 Console
H2 Console: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:ProdAPIDB

Username: sa (default)

Password: (leave blank unless changed)

🌐 Running the App
Clone the repo or import the project in IntelliJ.

Place the HTML file in src/main/resources/static/.

Run the SpringWebPracticeApplication.java class.

Visit http://localhost:8080/index.html to use the app.

Use the buttons to interact with the product database.

