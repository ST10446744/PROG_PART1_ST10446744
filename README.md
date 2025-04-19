# OnlyGlobal 💬

**OnlyGlobal** is a Java-based desktop chat application designed as part of a BCAD first-year programming assignment. The app mimics the structure and UI inspiration of social platforms like **OnlyFans** and **Instagram**, combining clean aesthetics with a strong validation system and a WhatsApp-style chat interface.

---

## 📌 Purpose of the Application

The application is designed to simulate a secure user login system and a basic chat interface. It aims to introduce students to:

- GUI development in Java
- User authentication
- Input validation using Regex
- File-based data persistence
- Unit testing using JUnit
- Maven project structure

---

## 📁 Page Descriptions

### 🔵 WelcomePage.java
- The landing screen when the app starts.
- Displays two buttons: **"Sign Up"** and **"Login"**
- Navigates to the appropriate page based on user selection.

---

### 🟦 SignUpPage.java
- Form where **new users** can register by entering:
  - Name
  - Surname
  - Username
  - Password
  - Phone number (with country code)
- Includes a checkbox to show/hide password.
- Validates all user input before saving.
- On success, user is redirected to **LoginPage**.

---

### 🟩 LoginPage.java
- Existing users enter:
  - Username
  - Password
- Calls the `Login.java` logic to authenticate the user.
- On success, user is redirected to the **ChatPage**.

---

### 🟪 ChatPage.java
- Basic layout that mimics WhatsApp Desktop.
- Represents a logged-in user's personal messaging space.
- Currently acts as a placeholder for future messaging features.

---

### ⚙️ Login.java
- The **core logic** class containing:
  - `checkUserName()`: Validates username structure
  - `checkPasswordComplexity()`: Ensures secure passwords
  - `checkCellPhoneNumber()`: Validates international number format
  - `registerUser()`: Saves user details to a file (`users.txt`)
  - `loginUser()`: Reads from file and authenticates user
  - `returnLoginStatus()`: Returns true/false messages based on login outcome

---

## ✅ Input Validations (Using Regex)

| Field      | Rule                                                                 | Example          |
|------------|----------------------------------------------------------------------|------------------|
| **Username** | Must include `_` and be **≤ 5 characters**                             | `fa_1`           |
| **Password** | Must include a **capital letter**, **number**, and **special character**, and be **≥ 8 characters** | `Pass123!`       |
| **Phone**    | Must begin with a **+country code** (e.g. +27) and have **≤10 digits** | `+2783123456`    |

All validations are handled in the `Login.java` class using Java’s `Pattern` and `Matcher` classes.

---

## 🧪 Unit Testing – LoginTest.java

- JUnit 5 was used to validate:
  - Username format
  - Password strength
  - Phone number format
  - Registration and login logic
- Located under: `src/test/LoginTest.java`
- Tests are run via Maven using `mvn test`

---

## 🏗️ Technologies Used

- Java 17
- Maven
- Swing (Java GUI)
- JUnit 5
- NetBeans IDE
- File I/O for data persistence

---

## ▶️ How to Run the Project

1. Open the project in **NetBeans**
2. Right-click on the project → **Run**
3. Main class: `WelcomePage.java`
4. To run unit tests:
   - Open terminal
   - Run: `mvn test`

---

## 📚 References (Harvard Style)

- Oracle. (n.d.). *Java Documentation*. Retrieved April 2025, from https://docs.oracle.com/javase/
- Stack Overflow. (n.d.). *Various Java code snippets and regex discussions*. Retrieved from https://stackoverflow.com
- Baeldung. (2020). *JUnit 5 – Getting Started*. Retrieved from https://www.baeldung.com/junit-5
- GeeksforGeeks. (2022). *Regex in Java*. Retrieved from https://www.geeksforgeeks.org/regular-expressions-in-java/
- GitHub Copilot. (2023). *Auto-completion assistance for Java syntax and regex logic.*
- OpenAI ChatGPT. (2025). *Assistance in debugging, design, and writing validation logic.*

---

## 👨‍💻 Author

**Faizaan**  
Student Number: ST10446744  
Institution: Varsity College  
Module: Programming 1

---

## 📎 License

This project is for academic use only. All code and structure belong to the creator and should not be reused without permission.

