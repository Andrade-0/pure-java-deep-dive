
    ██████╗ ███████╗███████╗██████╗     ██████╗ ██╗██╗   ██╗███████╗
    ██╔══██╗██╔════╝██╔════╝██╔══██╗    ██╔══██╗██║██║   ██║██╔════╝
    ██║  ██║█████╗  █████╗  ██████╔╝    ██║  ██║██║██║   ██║█████╗  
    ██║  ██║██╔══╝  ██╔══╝  ██╔         ██║  ██║██║╚██╗ ██╔╝██╔══╝  
    ██████╔╝███████╗███████╗██║         ██████╔╝██║ ╚████╔╝ ███████╗
    ╚═════╝ ╚══════╝╚══════╝╚═╝         ╚═════╝ ╚═╝  ╚═══╝  ╚══════╝

                        ██╗ █████╗ ██╗   ██╗ █████╗  
                        ██║██╔══██╗██║   ██║██╔══██╗   
                        ██║███████║██║   ██║███████║   
                    ██╗ ██║██╔══██║╚██╗ ██╔╝██╔══██║   
                    ╚████╔╝██║  ██║ ╚████╔╝ ██║  ██║
                    ╚═══╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝      


# Java History and Fundamentals

## Before Java

In the early 1990s, most software was written using languages such as:

- C
- C++

Although these languages were extremely fast, they had several drawbacks:

- Programs had to be compiled separately for each operating system.
- An application compiled for Windows would not run on Linux or macOS.
- Developers had to manually manage memory, which often led to issues such as:
    - Memory leaks
    - Buffer overflows
    - Invalid pointers
- Building and maintaining large software systems was difficult.

At the same time, smart electronic devices such as TVs, set-top boxes, and household appliances were becoming more common. Each device had different hardware, making software development even more challenging.

Sun Microsystems recognized the need for a programming language capable of running on different types of devices without requiring major changes.

---

# The Birth of Java

In **1991**, **Sun Microsystems** launched a research initiative called the **Green Project**.

The project was led by **James Gosling**.

Initially, the goal was **not** to build a language for the Internet.

Instead, the team wanted to create software for intelligent consumer devices such as:

- Televisions
- Remote controls
- Home appliances

The team designed a new programming language called **Oak**, named after an oak tree outside Gosling's office.

Later, they discovered that the name **Oak** had already been trademarked.

The language was then renamed **Java**, inspired by the Java coffee consumed by the development team.

---

# The Rise of the Internet

A few years later, the Internet began expanding rapidly.

The Green Project team realized that their language was perfectly suited for networked and distributed applications.

In **1995**, Java was officially released.

Its famous slogan became:

> **Write Once, Run Anywhere (WORA)**

Meaning:

> Write your program once and run it on any platform.

This became Java's greatest advantage.

---

# What Problem Did Java Solve?

Before Java, software had to be compiled separately for every operating system.

### Example

```
C++ Program
      │
      ▼
Compile for Windows
      │
      ▼
Runs only on Windows
```

To run the same application elsewhere:

```
Compile again for Linux
        ▼
Linux Executable
```

```
Compile again for macOS
        ▼
macOS Executable
```

Developers had to maintain multiple versions of the same software.

---

Java introduced a different approach.

```
Java Source Code
        │
        ▼
Compile Once
        │
        ▼
Bytecode (.class)
        │
        ▼
Runs on any computer with a JVM
```

This concept is known as **platform independence** or **portability**.

---

# How Java Works

Java execution happens in several stages.

## 1. Write the Source Code

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

}
```

---

## 2. Compile the Code

The Java compiler (`javac`) converts the source code into **Bytecode**.

```
Main.java
     │
     ▼
 javac
     │
     ▼
Main.class
```

The `.class` file **does not contain machine code**.

Instead, it contains **Bytecode**.

---

# What is Bytecode?

Bytecode is an intermediate language.

It is **not** specific to:

- Windows
- Linux
- macOS

Instead, it is a standardized instruction set understood by the **Java Virtual Machine (JVM)**.

---

# What is the JVM?

**JVM** stands for:

> **Java Virtual Machine**

The JVM is software installed on the operating system.

Each platform has its own implementation.

```
Windows
    │
    ▼
Windows JVM
```

```
Linux
   │
   ▼
Linux JVM
```

```
macOS
   │
   ▼
macOS JVM
```

The JVM translates Java Bytecode into native machine code that the processor understands.

Because each operating system has its own JVM, the **same `.class` file** can run on multiple platforms.

---

# Complete Execution Flow

```
Java Source Code (.java)
          │
          ▼
      javac Compiler
          │
          ▼
   Bytecode (.class)
          │
          ▼
          JVM
          │
          ▼
   Machine Code
          │
          ▼
        CPU
```

---

# What is the JDK?

**JDK** stands for:

> **Java Development Kit**

It is the complete toolkit used to develop Java applications.

It includes:

- Java Compiler (`javac`)
- JVM
- Java Standard Library
- Development tools
    - `jar`
    - `javadoc`
    - `jdb`
    - and many others

Without the JDK, you cannot create Java applications.

---

# What is the JRE?

**JRE** stands for:

> **Java Runtime Environment**

The JRE contains only what is needed to **run** Java applications:

- JVM
- Java libraries

It **does not** include the Java compiler (`javac`).

Modern Java releases package everything inside the JDK, and standalone JRE distributions are no longer commonly provided.

---

# JDK vs JRE vs JVM

```
JDK
│
├── javac
├── Development Tools
└── JRE
     │
     ├── Java Libraries
     └── JVM
```

Or simply:

```
JDK
 │
 ▼
JRE
 │
 ▼
JVM
```

---

# Why Did Java Become So Popular?

Java introduced many features that made software development easier and safer.

- Object-Oriented Programming (OOP)
- Automatic memory management (Garbage Collector)
- Strong static typing
- Platform independence
- Built-in security checks
- Large standard library
- Native multithreading support
- High performance through **Just-In-Time (JIT)** compilation

---

# The JVM Does More Than Ensure Portability

Besides executing Bytecode, the JVM is responsible for:

- Memory management
- Garbage Collection
- Dynamic class loading (Class Loader)
- Bytecode verification
- Runtime optimization using the JIT compiler
- Abstracting differences between operating systems and hardware architectures

---

# Summary

| Concept | Description |
|----------|-------------|
| **Java** | A programming language designed to be portable, secure, and object-oriented. |
| **Source Code (.java)** | Code written by the programmer. |
| **Compiler (`javac`)** | Converts Java source code into Bytecode. |
| **Bytecode (.class)** | Platform-independent intermediate code. |
| **JVM** | Executes Bytecode by translating it into machine code. |
| **JRE** | Runtime environment required to execute Java applications. |
| **JDK** | Complete development kit containing the compiler, tools, libraries, and JVM. |

---

# Key Takeaways

- Java was created in **1991** by **Sun Microsystems**.
- It was originally designed for smart electronic devices.
- It became popular with the growth of the Internet.
- Java's biggest innovation was **platform independence**.
- Programs are compiled into **Bytecode**, not machine code.
- The **JVM** enables the same application to run on different operating systems.
- The **JDK** is used to develop Java applications.
- The **JRE** provides the environment needed to run Java applications.
- The JVM also manages memory, performs security checks, and optimizes execution using the **Just-In-Time (JIT)** compiler.