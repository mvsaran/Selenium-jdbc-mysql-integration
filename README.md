# Selenium JDBC MySQL Integration

This is a beginner-friendly Java project demonstrating how to connect to a MySQL database using JDBC. This integration can be extended with Selenium to validate frontend UI data against backend database records — useful for QA Automation Engineers.

---

## 📌 Project Overview

- ✅ Connect to MySQL using JDBC
- ✅ Retrieve and display student records
- ✅ Execute queries from Java
- ✅ Can be integrated with Selenium tests

---

## 🛠️ Technologies Used

- Java 8+
- JDBC (MySQL Connector)
- MySQL 8.x
- MySQL Workbench
- Optional: Selenium WebDriver (for automation)

---


---

## 🧪 SQL Script – Create Sample DB

Use this to create your `mydb` database and `student` table:

```sql
CREATE DATABASE mydb;

USE mydb;

CREATE TABLE student (
    SNO INT,
    SNAME VARCHAR(50),
    MARKS INT
);

INSERT INTO student (SNO, SNAME, MARKS) VALUES
(101, 'SARAN', 85),
(102, 'Asrith', 95),
(103, 'Kumar', 80),
(104, 'Kishore', 85),
(105, 'Sasi', 90);


