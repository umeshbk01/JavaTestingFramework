# Java Unit Testing Framework

## Overview
This project implements a **simple unit testing framework** in Java. 

## Project Structure
The project is divided into three main components:

### 1. **TestFramework (Custom Testing Framework)**
Located at: `JavaTestingFramework/src/TestFramework`
- Implements a minimalistic unit testing framework with various assertion methods.
- Supports basic assertions like equality checks, boolean conditions, and exception validation.

### 2. **Core Logic (Logic to be Tested)**
Located at: `JavaTestingFramework/src/core`
- Implements the actual logic that needs to be tested.
- Includes implementations for:
  - **Binary Search**: Searches for an element in an array of `int`, `char`, or `float`.
  - **Prefix Count**: Finds the index where two strings first mismatch.
  - **Palindrome Check**: checks whether a string is Palindrome or not and return boolean value.

### 3. **Tests (Unit Tests using the Framework)**
Located at: `JavaTestingFramework/src/tests`
- Contains test cases written using the custom testing framework.
- Validates the core logic for correctness and expected behavior.

## Features of the Testing Framework
### **Assertions Implemented**
The framework provides various assertion methods:

1. **Equality Assertion**
   ```java
   Assertions.assertEquals(actual, expected);
   ```
   Checks if two values are equal.

2. **Boolean Assertions**
   ```java
   Assertions.assertTrue(condition);
   Assertions.assertFalse(condition);
   ```
   Validates boolean conditions.

3. **Not Null Assertion**
   ```java
   Assertions.assertNotNull(object);
   ```
   Ensures an object is not null.

4. **Exception Assertion**
   ```java
   Assertions.assertException(() -> methodThatThrowsException(), ExpectedException.class);
   ```

## How to Run Tests
### **1. go to src/**
```sh
cd src
```
### **2. Compile the Project**
Run the following command from the root directory to compile all source files:
```sh
javac */*.java Main.java
```
to recompile
```sh
javac -Xlint:unchecked */*.java Main.java
```

### **3. Run the Main Script**
```sh
java Main
```
This will execute all test cases and print the number of **passed** and **failed** tests.
