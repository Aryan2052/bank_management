
```markdown
# 🏧 ATM Simulator System

## 📌 Overview

The **ATM Simulator System** is a comprehensive **Java-based desktop application** that mimics the core functionalities of an Automated Teller Machine (ATM). Designed using **Java Swing** for the graphical user interface and **MySQL** for backend data storage, this simulator offers a realistic banking experience.

---

## 🛠️ Technology Stack

- **Programming Language:** Java  
- **GUI Framework:** Java Swing  
- **Database:** MySQL  
- **Build Tool:** Apache Ant (`build.xml`)  
- **IDE:** NetBeans (nbproject structure)  
- **External Libraries:** [JCalendar](https://toedter.com/jcalendar/) (for date selection)

---

## 🚀 Core Features

### 🔐 1. User Authentication & Registration
- **Login System:** Card number and PIN-based secure authentication
- **Multi-Step Registration:** Three-step sign-up process
- **Personal Information Collected:**
  - Full name, father’s name
  - Date of birth (via JCalendar), gender, email, marital status
- **Address Information:**
  - Address, city, pin code, state
- **Card Number Generation:** Auto-generated unique card number on registration

### 💳 2. Banking Operations
- **Deposit:** Add funds and log transactions
- **Withdrawal:** Withdraw funds with balance checks (max ₹10,000)
- **Fast Cash:** Quick access to predefined withdrawal amounts
- **Balance Enquiry:** Check real-time account balance
- **Mini Statement:** View recent transaction history
- **PIN Change:** Modify PIN securely

### 📊 3. Transaction Management
- **Real-time Balance Calculation:** Based on past transactions
- **Transaction Logging:** Includes timestamps and details
- **Withdrawal Limits:** Enforced per transaction
- **Overdraft Prevention:** Disallows withdrawals beyond available balance

### 💡 4. User Interface
- **Professional Look:** ATM-style background and layout
- **User-Friendly Navigation:** Clearly labeled buttons and intuitive flow
- **Form Validation:** Input checks with proper error messaging
- **Responsive UI:** Adaptive window sizing and positioning

---

## 📁 Project Structure

### 🔸 Source Organization
- `Apply` – Registration and login UI
- `Conn` – Database connection and pooling
- `Transaction`, `BalanceEnquiry`, etc. – Individual feature implementations

### 🔸 Database Schema

| Table Name | Purpose |
|------------|---------|
| `login`    | Stores card number and PIN |
| `signup`   | Stores user registration data |
| `bank`     | Stores transaction records (date, mode, amount) |

---

## 🔒 Key Technical Aspects

### 🛡️ Security Features
- PIN-based login authentication
- Input validation & sanitization
- Secure MySQL connections using JDBC
- Complete transaction logging for traceability

### 🗃️ Database Integration
- Uses MySQL JDBC Connector
- Managed connections via `Conn` class
- SQL-based CRUD operations for transactions

### 🧑‍💻 User Experience
- Multi-step guided registration
- Helpful error prompts and messages
- Professional and intuitive layout for real-world familiarity

---

## 🧰 Development & Deployment

- **Build Tool:** Apache Ant (`build.xml`) for compile and package
- **IDE Support:** NetBeans project structure
- **Dependencies:** MySQL Connector/J, JCalendar
- **Output:** JAR file for distribution

---

## 🎯 Target Audience

- Students learning banking software systems
- Java developers exploring Swing and MySQL integration
- Educational institutions demonstrating core banking concepts
- Beginners looking to build real-world Java projects

---

## 📚 Conclusion

The **ATM Simulator System** serves as a robust educational tool for understanding:

- Core banking workflows  
- Java Swing GUI development  
- MySQL database integration  
- Software architecture principles

```
