# Rest Assured API Automation Framework

## Overview

This project demonstrates a simple and scalable API Automation Framework using Rest Assured with Java, following good design practices like service layer separation, reusable utilities, and POJO-based request/response handling.

## Tech Stack
- Java
- Rest Assured
- TestNG
- Maven

## Project Structure

src
└─ test
├─ java
│   ├─ api
│   ├─ base
│   ├─ models
│   ├─ tests
│   └─ utils
│
└─ resources
└─ requestBody
createPost.json

## Features
- CRUD API Testing
- Service Layer Design
- JSON Request Handling
- POJO Serialization & Deserialization
- Reusable Utilities
- Clean Framework Structure

## API Tested
https://jsonplaceholder.typicode.com

## Test Scenarios
- GET /posts
- POST /posts
- PUT /posts/{id}
- DELETE /posts/{id}

## How to Run Tests

mvn clean test
