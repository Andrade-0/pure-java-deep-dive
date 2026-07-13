# Java Exceptions Cheat Sheet

## What is an Exception?

An **exception** is an event that interrupts the normal flow of a program during execution. Exceptions are used to represent errors or unexpected situations that can occur while a program is running.

Examples:

* Dividing by zero
* Reading a file that doesn't exist
* Accessing an invalid array index
* Passing an invalid argument to a method

---

# Exception Hierarchy

```text
                 Throwable
                /         \
            Error       Exception
                           |
                    RuntimeException
```

* **Error**: Serious problems that applications should not try to handle (e.g., `OutOfMemoryError`).
* **Exception**: Conditions that an application can handle.
* **RuntimeException**: Programming errors that are not checked by the compiler.

---

# Checked vs Unchecked Exceptions

## Checked Exceptions

Checked exceptions are verified by the compiler. You **must** either catch them or declare them using `throws`.

Examples:

* `IOException`
* `SQLException`
* `FileNotFoundException`
* `InterruptedException`
* `ClassNotFoundException`

```java
public void readFile() throws IOException {
    Files.readString(Path.of("users.txt"));
}
```

---

## Unchecked Exceptions

Unchecked exceptions extend `RuntimeException`. They usually indicate bugs or invalid program logic.

Examples:

* `NullPointerException`
* `IllegalArgumentException`
* `IllegalStateException`
* `ArithmeticException`
* `IndexOutOfBoundsException`

These exceptions are **not** required to be caught.

---

# try, catch and finally

## try

The `try` block contains code that may throw an exception.

```java
try {
    int result = 10 / 0;
}
```

---

## catch

A `catch` block handles an exception thrown from the `try` block.

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
```

You can have multiple `catch` blocks.

```java
try {
    // code
} catch (IOException e) {
    // handle file error
} catch (SQLException e) {
    // handle database error
}
```

---

## finally

The `finally` block always executes, whether an exception occurs or not. It is commonly used to release resources.

```java
try {
    // code
} catch (Exception e) {
    // handle exception
} finally {
    System.out.println("Always executed");
}
```

Typical use cases:

* Closing files
* Closing database connections
* Releasing resources

---

# throw vs throws

## throw

Used to explicitly throw an exception.

```java
if (age < 0) {
    throw new IllegalArgumentException("Age cannot be negative");
}
```

---

## throws

Declares that a method may throw one or more exceptions.

```java
public void loadFile() throws IOException {
    Files.readString(Path.of("users.txt"));
}
```

---

# Common Exception Classes

| Exception                         | When to use                                                   |
| --------------------------------- | ------------------------------------------------------------- |
| `NullPointerException`            | A required object reference is `null`.                        |
| `IllegalArgumentException`        | A method receives an invalid argument.                        |
| `IllegalStateException`           | An object is in an invalid state for the requested operation. |
| `ArithmeticException`             | Invalid arithmetic operation (e.g., division by zero).        |
| `NumberFormatException`           | A string cannot be converted into a number.                   |
| `IndexOutOfBoundsException`       | Invalid index in a collection.                                |
| `ArrayIndexOutOfBoundsException`  | Invalid array index.                                          |
| `StringIndexOutOfBoundsException` | Invalid string index.                                         |
| `ClassCastException`              | Invalid object cast.                                          |
| `NoSuchElementException`          | Expected element does not exist.                              |
| `ConcurrentModificationException` | A collection is modified during iteration.                    |
| `UnsupportedOperationException`   | The operation is not supported.                               |
| `IOException`                     | General input/output error.                                   |
| `FileNotFoundException`           | File cannot be found.                                         |
| `SQLException`                    | Database operation failed.                                    |
| `InterruptedException`            | A thread is interrupted while waiting or sleeping.            |

---

# Best Practices

* Use exceptions for **exceptional situations**, not for normal program flow.
* Throw `IllegalArgumentException` for invalid method arguments.
* Throw `IllegalStateException` when an object's current state prevents an operation.
* Prefer `Objects.requireNonNull()` for required parameters.
* Catch the **most specific exception** possible.
* Avoid catching `Exception` unless you have a good reason.
* Never ignore exceptions with an empty `catch` block.
* Use `finally` (or **try-with-resources**) to release resources.
* Include meaningful exception messages.

---

# Quick Summary

| Keyword             | Purpose                                                              |
| ------------------- | -------------------------------------------------------------------- |
| `try`               | Wraps code that may throw exceptions.                                |
| `catch`             | Handles exceptions.                                                  |
| `finally`           | Executes regardless of whether an exception occurs.                  |
| `throw`             | Explicitly throws an exception.                                      |
| `throws`            | Declares exceptions that a method may throw.                         |
| Checked Exception   | Must be handled or declared.                                         |
| Unchecked Exception | Extends `RuntimeException`; handling is optional.                    |
| `Error`             | Represents serious JVM problems that should not normally be handled. |
