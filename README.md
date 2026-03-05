# 🛡️ Cybersecurity Log Analyzer

[![Java](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![Database](https://img.shields.io/badge/Database-MySQL-blue.svg)](https://www.mysql.com/)
[![Architecture](https://img.shields.io/badge/Architecture-Layered-green.svg)](#)

A robust, menu-driven command-line application designed to simulate a **Security Operations Center (SOC)** logging system. This tool records and analyzes security-related events to identify suspicious activities in real-time.

---

## 📖 Project Overview
The **Cybersecurity Log Analyzer** bridges the gap between core backend development and cybersecurity principles. It demonstrates how to handle sensitive security data using industry-standard practices.

### 🎯 Key Objectives
* **Database Integration**: Master JDBC and MySQL connectivity.
* **Data Management**: Implement full CRUD operations for security logs.
* **Structural Integrity**: Apply a layered software architecture for scalability.
* **Cyber Simulation**: Model real-world security event logging.

---

## 🛠️ Tech Stack
| Component | Technology | Role |
| :--- | :--- | :--- |
| **Language** | Core Java | Application logic |
| **Driver** | JDBC | Database connectivity |
| **Storage** | MySQL | Persistent data storage |
| **Interface** | CLI | User interaction |

---

## 📂 System Architecture & Design
The application follows a **Layered Architecture** to ensure a clean separation of concerns between the user interface, business logic, and data access.

### Database Schema
The system operates on a database named `cyberdb` with a dedicated table for event history.



---

## 🚀 Functional Modules
* ✅ **Add Security Log**: Register new security events manually.
* 🔍 **View Log by ID**: Targeted retrieval of specific log entries.
* 📋 **View All Logs**: Comprehensive audit of all recorded activities.
* ⚠️ **Failed Login Tracker**: Specialized view for monitoring unauthorized access attempts.
* 🗑️ **Log Management**: Securely delete obsolete records.

---

## 🔒 Security Best Practices
Security is baked into the development process:
* **SQLi Protection**: Implementation of `PreparedStatement` to neutralize SQL Injection threats.
* **Validation**: Robust input validation within the Service layer.
* **Layer Separation**: Strict boundaries between application layers to prevent data leaks[.

---

## 🔮 Future Roadmap
- [ ] **User Auth**: Add a secure login system for the analyzer.
- [ ] **Encryption**: Implement password hashing (e.g., BCrypt).
- [ ] **Heuristics**: Add Brute-force attack detection logic.
- [ ] **Reporting**: Automated generation of security audit reports.
- [ ] 
