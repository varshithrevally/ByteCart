```
# 🛒 SuperMarket Store

A modular Java application for managing retail operations like inventory, billing, and receipt generation. Integrated with SQL via JDBC, it features robust CRUD functionality and follows an MVC architecture for clean separation of concerns.

---

## 📁 Project Structure

```
src/
├── Controller/         # Handles logic and flow
├── Model/              # Manages data and business rules
├── View/               # Console-based UI
├── Supermarket/        # Domain-specific features
└── module-info.java    # Java module system
```

##  Features
- SQL-based CRUD operations for inventory and transactions
- Real-time billing with printable receipts
- Object-oriented modular architecture
- Clean separation using MVC pattern

## 🛠️ Tech Stack
- Java 17+
- SQL (e.g., MySQL or SQLite)
- JDBC for database connectivity
- Console-based interface (upgrade-ready to GUI)

## ▶️ How to Run
1. Configure your SQL database (e.g., `supermarketdb`)
2. Update JDBC connection in classes
3. Compile and run `Main.java`



## 🧭 Future Enhancements
- GUI with JavaFX or React
- Persistent data storage with enhanced DB schema

---
