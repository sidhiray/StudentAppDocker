# StudentAppDocker

A Dockerized Spring Boot application for managing student information with MySQL.

##  Table of Contents
- [About](#about)
- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Setup & Run](#setup--run)

---

##  About
This project is a simple Spring Boot application demonstrating CRUD operations for student entities. It’s containerized using Docker and composed with MySQL for ease of deployment and local development.

##  Features
- RESTful API for student data (Create, Read, Update, Delete)
- Pre-populated data using `data.sql`
- Fully containerized using Docker and Docker Compose

##  Technologies
- Java 21 & Spring Boot  
- Maven  
- MySQL (via Docker)  
- Docker & Docker Compose  
- IntelliJ IDEA (development environment)

##  Getting Started

### Prerequisites
Make sure you have the following installed:
- [Docker](https://www.docker.com/)  
- [Docker Compose](https://docs.docker.com/compose/)  

### Setup & Run
Clone the repository and launch the application using Docker:

```bash
git clone https://github.com/sidhiray/StudentAppDocker.git



cd StudentAppDocker
docker-compose up --build
