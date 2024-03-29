---
layout: default
title: EMS-docs
---

# Getting started


## Employee Management System

A simple implementation of CRUD operations using Spring Boot + React as front-end to make an user interface to manage employees. 




## API Reference

#### Post Employee

```https
  POST /humanresource/employees
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `employee` | `Employee` | **Required**. Employee object |

#### Get All Employees

```https
  GET /humanresource/employees
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| ``      | `` | no parameter needed |

#### Update Employee

```https
  PUT /humanresource/employees
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `employee` | `Employee` | **Required**. Employee object |

#### Delete Employee

```https
  DELETE /humanresource/employees/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` |  **Required**. Employee id |



## Run Locally

Clone the project

```bash
  git clone https://github.com/dipeshsingh253/Employee-Management-System
```

Go to the project directory

```bash
  cd Employee-Management-System
```

Install dependencies (Go to employee-ui)

```bash
  npm install
```

Start the server

```bash
  npm run start
```


Install dependencies (Go to Employee-Management-System)

```bash
  ./mvnw install (only if maven is not installed)
```

Start the server

```bash
  ./mvnw spring-boot:run
```

Visit the link

```bash
 http://localhost:3000/addemployee
```

## Screenshots

<img src="./screenshots/screenshot-ems-02.png" alt="screenshot-name" width="100%" height="auto">

<img src="./screenshots/screenshot-ems-01.png" alt="screenshot-name" width="100%" height="auto">


