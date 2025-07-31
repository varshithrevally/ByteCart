
# 🛒 ByteCart

ByteCart is a modular Java application designed to streamline retail operations, offering robust inventory management, real-time billing, and receipt generation. Built with SQL integration via JDBC and structured around the MVC architecture, it enables clean separation of concerns and scalable CRUD functionality for enterprise-grade retail systems.

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
