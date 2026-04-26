# 🌾 Agrimate – Smart Agriculture Desktop Application

Agrimate is a Java Swing-based desktop application that helps farmers access real-time weather updates, agricultural news, and commodity market prices across India.

---

## 🚀 Core Features

### 🔐 1. Authentication System

* Implemented in: `Login.java`, `Registration.java`
* Uses **JDBC (MySQL)** for validation and storage
* Stores:

  * Name, Email, Mobile
  * Age, Gender
  * Location (State, District, City)
  * Username & Password

---

### 🏠 2. Home Dashboard

* Implemented in: `Home.java`, `homenew.java`
* Acts as central navigation
* Buttons:

  * Weather / News
  * Market Price Dashboard

---

### 🌤️ 3. Weather + News Module

* Implemented in: `services.java`
* Uses **HTTP API calls + JSON parsing**
* Displays:

  * Current time
  * Temperature
  * Humidity
  * Weather description
* News:

  * Title/description
  * URL
  * Published timestamp

---

### 📊 4. Market Price Dashboard

* Implemented in: `price.java`
* User selects:

  * State
  * District
  * Market
  * Commodity
* Fetches real-time price data using API
* Displays results dynamically in UI panel
---
## System Screenshot:

 ### 🔹 Login
<img width="1600" height="900" alt="WhatsApp Image 2026-04-26 at 2 21 23 PM" src="https://github.com/user-attachments/assets/62b3ad15-421c-43d7-a8da-5e40e3044266" />


 ### 🔹 Homepage
<img width="1600" height="900" alt="WhatsApp Image 2026-04-26 at 5 30 39 PM" src="https://github.com/user-attachments/assets/a63b471b-c325-420a-b7ac-78d402080f99" />


 ### 🔹 Weather
<img width="1600" height="862" alt="WhatsApp Image 2026-04-26 at 6 41 21 PM" src="https://github.com/user-attachments/assets/01a3d31e-a895-4c42-a0cb-d92e13a9ab48" />


 ### 🔹 Commodity Price
 <img width="1600" height="862" alt="WhatsApp Image 2026-04-26 at 6 43 36 PM" src="https://github.com/user-attachments/assets/56767853-dc0a-4213-b88b-45311a969290" />



---

## 🏗️ Tech Stack

| Layer     | Tech                  |
| --------- | --------------------- |
| UI        | Java Swing            |
| Backend   | Core Java             |
| Database  | MySQL (JDBC)          |
| APIs      | HTTP + JSON           |
| Libraries | json-simple, org.json |

---

## 📁 Project Structure

```
AGRIMATE/
│
├── Agrimate/src/
│   ├── agrimate/
│   │   ├── Agrimate.java        # Entry point
│   │   ├── Login.java          # Login logic (JDBC)
│   │   ├── Registration.java   # User registration
│   │   ├── homenew.java        # Alternate home UI
│   │   ├── services.java       # Weather + News APIs
│   │   ├── price.java          # Market price API
│   │
│   ├── Data/
│   │   └── DataStore.java      
│
├── json-simple-1.1.1.jar
├── org.json.jar
```

---

## 🔄 Application Workflow

```
Start (Agrimate.java)
   ↓
Login / Registration
   ↓
Home Screen
   ↓
Choose:
   ├── Weather & News → services.java
   └── Market Prices → price.java
```

---

## 🔌 Database Integration

* JDBC connection used:

```java
DriverManager.getConnection("jdbc:mysql://localhost:3306/agrimate", "root", "password");
```

* Tables used:

  * `farmers`
  * `users` (optional depending on flow)

---

## 🌐 API Usage (from code)

### Weather + News (`services.java`)

* Uses HTTP requests
* Parses JSON response
* Displays structured UI data

### Market Prices (`price.java`)

* Dynamic API based on dropdown selection
* Filters:

  * State → District → Market → Commodity

---

## ⚙️ Setup Instructions

### 1. Requirements

* JDK 8+
* NetBeans IDE
* MySQL Server
* Internet connection

---

### 2. Setup Steps

#### Clone / Extract

```bash
unzip AGRIMATE.zip
```

#### Open Project

* Open NetBeans → Open Project → Select `AGRIMATE`

#### Database Setup

```sql
CREATE DATABASE agrimate;
```

Create table :

* `farmers` with fields:
CREATE TABLE farmers (
    name VARCHAR(100),
    email VARCHAR(100),
    mobile VARCHAR(15),
    age VARCHAR(3),
    gender VARCHAR(10),
    state VARCHAR(50),
    district VARCHAR(50),
    city VARCHAR(50),
    username VARCHAR(50),
    password VARCHAR(255)
);
---

#### Update DB Credentials

Update in:

* `Login.java`
* `Registration.java`

---

#### Add Libraries

* `json-simple-1.1.1.jar`
* `org.json.jar`

---

#### Run

* Run `Agrimate.java`

---

---

## 🔮 Future Scope

* Use MVC architecture
* Add password hashing (bcrypt)
* Create API service layer
* Centralize configuration (DB + API keys)
* Add exception handling (try-catch with logs)
* Convert to web/mobile app (Spring Boot / Android)

