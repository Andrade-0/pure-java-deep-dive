# `super` in Java

The `super` keyword can be used in three main situations:

## 1. Call the parent class constructor (the most common use)

```java
public Manager(String name, double baseSalary) {
    super(name, baseSalary);
}
```

Here you are saying:

> "Before constructing the `Manager` object, execute the constructor of `Employee`."

---

## 2. Call a method from the parent class

```java
@Override
public double calculateSalary() {
    return super.calculateSalary() + 500;
}
```

Here you are saying:

> "Use the implementation from `Employee` and then add some extra behavior."

This pattern is very common when you want to **extend a behavior** instead of **completely replacing it**.

---

## 3. Access fields from the parent class

If the field is `protected` or `public` (not `private`):

```java
public class Employee {
    protected String name;
}
```

In the child class:

```java
System.out.println(super.name);
```

If the field is `private`, this is **not allowed**:

```java
private String name;

super.name; // ❌ Compilation error
```