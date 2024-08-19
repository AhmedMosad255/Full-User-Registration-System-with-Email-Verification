# Full User Registration System with Email Verification

## Overview
This project implements a secure and robust user registration system with email verification, complete with backend authentication. Built using Spring Boot, this system provides a comprehensive solution for managing user accounts, including registration, login, and role-based access control.

## Features
- **User Registration**: New users can register by providing their details such as email and password.
- **Email Verification**: After registration, users receive a verification email to confirm their identity.
- **User Login**: Registered users can log in with their credentials to receive a JWT for secure session management.
- **JWT Token Generation**: Secure token generation for managing user sessions without server-side storage.
- **Role-Based Authorization**: Different access levels are granted based on user roles (e.g., Admin, User).
- **Secure Endpoints**: All sensitive endpoints require a valid JWT for access.

## Technologies Used
- **Spring Boot**: A powerful, easy-to-use framework for building Java applications.
- **Spring Security**: Provides authentication, authorization, and protection against common security threats.
- **JWT (JSON Web Tokens)**: Used for securely transmitting information between client and server.
- **Hibernate/JPA**: For interacting with the database and managing user entities.
- **PostgreSQL**: An open-source relational database system used for storing user data.
- **JavaMail**: For sending email verification links to users.

## Project Structure
The project follows a layered architecture:

- **Model**: Defines the data structure (e.g., User, Role).
- **Repository**: Handles data access logic and interactions with the database.
- **Service**: Contains business logic for handling user authentication, registration, and JWT management.
- **Controller**: Manages HTTP requests and responses, exposing endpoints for user actions.
- **Security**: Configures Spring Security and JWT integration for managing authentication and authorization.

## Setup and Installation
To run this project locally, follow these steps:

### Clone the Repository:
```bash
git clone (https://github.com/AhmedMosad255/Full-User-Registration-System-with-Email-Verification.git)
cd YourRepositoryName
