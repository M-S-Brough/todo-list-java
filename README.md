# ✅ Java To-Do List App (Custom ArrayList ADT)

This project is a Java-based to-do list application developed for the *Data Structures & Algorithms* module. It implements a custom-built **ArrayList** as an Abstract Data Type (ADT), avoiding the use of Java’s built-in data structures (e.g., `java.util.ArrayList`).

---

## 🎯 Objective

To create a lightweight, student-focused to-do app that enables users to:
- Add tasks
- View all tasks
- Search by index or name
- Remove tasks by name or index
- Count items in the list

---

## 🧰 Technologies Used

- Java SE
- Custom-built ArrayList (interface + concrete class)
- Console-based UI

---

## 🗂️ Key Classes

### `List` (Interface)
Defines the structure of basic list operations.

### `ArrayList` (Implements `List`)
Custom implementation of a dynamic array, with methods for:
- `add`, `remove`, `find`, `isIn`, `isEmpty`, etc.
- `increaseArraySize()` for resizing

### `Item`
Encapsulates task details: `itemName` and `itemDescription`

### `ItemList`
Uses the custom `ArrayList` to store `Item` objects and offers:
- `add(Item)`
- `printDetails()`
- `search()`, `remove()`, `searchByName()`

### `TODOApp`
Main class with `main()` method to drive the application

---

## 📐 UML Diagram

![UML class](https://github.com/user-attachments/assets/8b6c65d5-7a18-4ea0-b0f3-f3044296e4dd)


---

## 💻 How to Run

1. Compile the program:
```bash
javac *.java
```

2. Run the main app:
```bash
java TODOApp
```

---

## 🧪 Features Demonstrated

- Dynamic array implementation without built-in Java collections
- Interface-based design
- Object-oriented programming with encapsulation
- CLI-based interaction
- Full unit-tested methods (add, remove, search, count, etc.)

---

## 👨‍🎓 Author

**Mark Brough**   
University of Salford
