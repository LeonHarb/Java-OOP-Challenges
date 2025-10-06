# Java OOP Challenges

This repository contains a collection of **Object-Oriented Programming (OOP)** assignments written in Java.  
Each program demonstrates principles such as **encapsulation, constructors, methods, object interaction, and class testing** through real-world inspired problems.

---

## 📘 Overview
These challenges were completed as part of a Java OOP course.  
Each exercise introduces core concepts of class design — defining attributes, writing accessor and mutator methods, applying constructors, and testing behaviors using companion driver classes.

---

## 🧩 Included Challenges

### 🏦 1. Account.java & TestAccount.java
Implements a simple banking account system with:
- Fields: `id`, `balance`, `annualInterestRate`, and `dateCreated`
- Constructors: default and full (id, balance, rate, date)
- Methods:  
  - `getMonthlyInterestRate()` to compute interest  
  - `withdraw(amount)` and `deposit(amount)` for balance updates  
- **Demo:** Creates an account (id=123, balance=$10,000, rate=2.5%), performs withdrawals/deposits, and prints the updated balance, monthly interest, and creation date.

---

### 🌬️ 2. Fan.java & TestFan.java
Represents a customizable fan object with:
- Fields: `speed`, `fanStatus`, `radius`, and `color`
- Constructors: no-arg (default) and full (speed, status, radius, color)
- Method: `toString()` returns a formatted description of the fan’s properties.
- **Demo:** Prompts the user for fan details, creates a fan object, and displays its status and attributes.

---

### 🪙 3. Coin.java & TestCoin.java
Simulates a coin-flipping program that:
- Randomly flips a coin multiple times
- Displays each result (`heads` or `tails`)
- Tracks and prints the total count of heads/tails after all flips  
- **Demo:** Outputs each flip result and tallies the totals.

---

### 📏 4. Rectangle.java & TestRectangle.java
Models a geometric rectangle with:
- Fields for `width` and `height`
- Methods to calculate `area` and `perimeter`
- Constructors for default and user-defined values
- **Demo:** Creates rectangles and prints area and perimeter results.

---

### 🌡️ 5. TemperatureAnalysis.java
Performs temperature data analysis using arrays:
- Stores a week’s worth of temperatures
- Computes average, minimum, and maximum values
- Displays formatted output with clear labeling
- Demonstrates use of loops, arrays, and conditionals.

---

## 🧠 Concepts Demonstrated
- Encapsulation (`private` fields with getters/setters)  
- Constructors and object initialization  
- Accessor and mutator methods  
- Class interaction and test drivers  
- Conditional logic and iterative structures  
- Randomization and mathematical computation  
- Output formatting and modular program design  

---

## ⚙️ Tools & Technologies
- **Language:** Java  
- **IDE:** Eclipse / IntelliJ IDEA / VS Code  
- **Libraries:** `java.util.Date`, `java.util.Scanner`, `java.util.Random`  
- **Concepts:** OOP, class testing, encapsulation, simulation, data modeling  

---

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/LeonHarb/Java-OOP-Challenges.git
