# Web-Billing-Software
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/RafaelVnc/Web-Billing-Software/blob/main/LICENSE) 
## About the project
Web-Billing-Software is a POS (Point Of Sale) fullstack Java/React project.
## Objectives
- Create a REST API using Spring
- Develop a fully functional, real-world POS platform
- Learn good development practices
- Gain experience with popular frameworks like Bootstrap, React, and Spring
## Features
- **Category & Product Management**: Add, update, and manage product categories and their respective items.
- **File Upload (Image) Support**: Upload product images and store them in AWS S3.
- **REST APIs with Spring Boot**: Backend services for handling various billing and product operations.
- **Image Handling from AWS**: Manage images through AWS S3 storage for better scalability and accessibility.
- **Dynamic UI Built with React + Bootstrap**: A modern, responsive interface with real-time updates and smooth interactions.
- **Search and Delete Features**: Easily search for products and delete records when necessary.
- **Responsive Design**: A fully responsive design to ensure smooth operation across devices (mobile, tablet, desktop).
## Covered Concepts:
- Java, Spring & JPA
- Layered Architecture
- DTO pattern
- AWS - S3
- CORS/Spring Security
- HTML, CSS & Bootstrap
- JavaScript, React Native, Vite
- AAA (Authentication, authorization, and accounting)
- MYSQL
- JSON Web Token (JWT)

## Roles
### Admin
Permissions:

![AdminPermissions](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/AdminRoleView.png)
### User
Permissions:

![UserPermissions](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/UserRoleView.png)


## Screenshots
### Login
![Login](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/Login.png)

### Dashboard
![Dashboard](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/Dashboard.png)

### Explore
![Explore](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/Explore.png)

### Manage Items
![Manage Items](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/ManageItems.png)

### Manage Categories
![Manage Categories](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/ManageCategories.png)

### Manage Users
![Manage Users](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/ManageUsers.png)

### Order History
![Order Hisotry](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/OrderHistory.png)

### Receipt
![Receipt](https://github.com/RafaelVnc/assets/blob/main/web-billing-software/Receipt.png)

## Installation
### Clone the Repository
```
git clone https://github.com/RafaelVnc/Web-Billing-Software.git
cd Web-Billing-Software
```
### Backend Setup 

Navigate to **billingsoftware/src/main/resources** and create a file **"application.properties"** following the example provided(**application.properties.example**)

**Make sure you have a working AWS account with S3 configured for image storage.**

**Build and run the backend:**

```
cd billingsoftware
mvn clean install
mvn spring-boot:run
```
**Frontend Setup (React)**
**Navigate to the frontend directory:**
```
cd client
```
**Install the required dependencies:**
```
npm install
```
**Start the React development server:**
```
npm run dev
```
Your application should now be running locally. Visit **http://localhost:5371** in your browser to access the frontend.

## Usage
**Admin Panel:** The admin panel allows the management of product categories, products, and image uploads.

**Product Listings:** View products with their details, including images, prices, and availability.

**Order Management:** Add, update, and track orders in real-time.

**Search and Filter:** Efficient search and filtering capabilities to find products and manage orders quickly.
## AWS Configuration
For image storage, the application uses AWS S3. Ensure that you have your AWS credentials set up correctly and your S3 bucket is configured.

**Update the following fields in application.properties:**
```
aws.access.key.id=<Your-AWS-Access-Key>
aws.secret.access.key=<Your-AWS-Secret-Key>
aws.bucket.name=<Your-S3-Bucket-Name>
```

## Author
Rafael Oliveira Venancio

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rafael-oliveira-venancio-6904122a6/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/RafaelVnc)