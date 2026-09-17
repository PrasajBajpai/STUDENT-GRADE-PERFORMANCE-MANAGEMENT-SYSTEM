# Student Grade & Performance Management System

## 1. Project Overview

The Student Grade & Performance Management System is a Java-based application designed to manage student academic information, marks, grades, and performance reports.

The system provides a simple and structured way to add student records, store marks, calculate percentage and grades, search students, and generate overall class performance reports.

The project demonstrates the practical implementation of Object-Oriented Programming concepts, collections, input validation, methods, and modular Java programming.

---

## 2. Problem Statement

Managing student academic records manually can be time-consuming and may lead to calculation errors. Teachers and students need a simple system that can store student information, calculate marks and grades automatically, and provide performance statistics.

This project provides a Java-based solution for managing student records and generating academic performance reports efficiently.

---

## 3. Objectives

* To create a simple student record management system.
* To store student details and academic marks.
* To automatically calculate total marks and percentage.
* To automatically assign grades based on percentage.
* To determine student pass/fail status.
* To provide student search functionality.
* To generate class performance statistics.
* To demonstrate Java Object-Oriented Programming concepts.

---

## 4. Features

### Student Management

* Add new student
* View all students
* Search student using Student ID

### Marks Management

* Enter marks for multiple subjects
* Calculate total marks
* Calculate percentage
* Validate marks between 0 and 100

### Grade Management

* Automatic grade calculation
* Automatic Pass/Fail calculation

### Performance Reporting

* Total number of students
* Number of students who passed
* Number of students who failed
* Class average
* Highest percentage
* Lowest percentage

---

## 5. Functional Modules

### Module 1: Student Management

This module manages student information such as Student ID, name, and course.

### Module 2: Marks and Grade Management

This module accepts subject marks and calculates total marks, percentage, grade, and result.

### Module 3: Performance Reporting

This module analyzes student records and generates overall class performance statistics.

---

## 6. Non-Functional Requirements

### Performance

The system should process student information and calculate results quickly.

### Usability

The application should provide a simple menu-driven interface that is easy to understand.

### Reliability

The system should produce consistent calculations for marks, percentage, and grades.

### Maintainability

The application is divided into multiple classes so that individual components can be modified easily.

### Error Handling

The system validates marks and prevents invalid values outside the range of 0 to 100.

### Scalability

The system uses an ArrayList structure, allowing additional student records to be added during program execution.

---

## 7. Technologies Used

* Java
* Object-Oriented Programming
* Java Collections Framework
* ArrayList
* Exception/Input Validation
* IntelliJ IDEA

---

## 8. Java Concepts Used

* Classes and Objects
* Encapsulation
* Constructors
* Methods
* Inheritance-related modular design
* Static methods
* ArrayList
* Conditional Statements
* Loops
* Input Validation
* Modular Programming

---

## 9. Project Structure

```text
StudentPerformanceSystem/
│
├── src/
│   ├── Main.java
│   ├── Student.java
│   ├── Marks.java
│   ├── GradeCalculator.java
│   ├── StudentManager.java
│   ├── ReportGenerator.java
│   └── InputValidator.java
│
├── README.md
└── statement.md
```

---

## 10. System Workflow

```text
Start
  ↓
Display Main Menu
  ↓
Add Student
  ↓
Enter Student Details
  ↓
Enter Subject Marks
  ↓
Validate Marks
  ↓
Calculate Total & Percentage
  ↓
Calculate Grade & Result
  ↓
Store Student Record
  ↓
Generate Performance Report
  ↓
Display Output
  ↓
Exit
```

---

## 11. How to Run the Project

### Requirements

* Java JDK 8 or above
* IntelliJ IDEA / Eclipse / VS Code

### Steps

1. Open the project in a Java-supported IDE.
2. Open the `src` folder.
3. Open `Main.java`.
4. Run the `Main` class.
5. Select an option from the menu.
6. Enter the required student details and marks.
7. View the generated result or performance report.

---

## 12. Sample Operations

The user can select:

```text
1. Add Student
2. View All Students
3. Search Student
4. Generate Student Result
5. Performance Report
6. Exit
```

---

## 13. Testing

The following test cases can be performed:

| Test Case          | Input                       | Expected Result            |
| ------------------ | --------------------------- | -------------------------- |
| Add Student        | Valid student details       | Student added successfully |
| Invalid Marks      | Marks greater than 100      | Invalid marks message      |
| Search Student     | Existing ID                 | Student details displayed  |
| Search Student     | Non-existing ID             | Student not found          |
| Generate Result    | Existing student with marks | Result generated           |
| Performance Report | Multiple students           | Statistics displayed       |

---

## 14. Future Enhancements

* Database integration using JDBC and MySQL.
* Graphical User Interface using Java Swing or JavaFX.
* User authentication.
* Export reports to PDF.
* Attendance management.
* Subject-wise performance analysis.
* Persistent storage of student records.

---

## 15. Conclusion

The Student Grade & Performance Management System demonstrates how Java programming concepts can be applied to solve a practical academic record management problem.

The system simplifies student record management, reduces manual calculation effort, and provides automatic grade and performance analysis through a modular Java application.
