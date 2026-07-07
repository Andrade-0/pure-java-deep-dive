# Controlling Access to Members of a Class

Access level modifiers determine whether other classes can use a particular field or invoke a particular method.

There are **two levels of access control**:

## Top-Level Access

- `public`
- **package-private** (no explicit modifier)

A class declared as `public` is visible to **all classes**.

If a class has **no modifier** (the default, also known as **package-private**), it is visible **only within its own package**.

> **Note:** A package is a named group of related classes.

---

## Member-Level Access

At the member level (fields, methods, constructors, and nested classes), you can use:

- `public`
- `protected`
- `private`
- **package-private** (no explicit modifier)

### `public`

The member can be accessed from **any class**.

### `private`

The member can only be accessed **inside its own class**.

### `protected`

The member can be accessed:

- Within its own package.
- By subclasses, even if they are in a different package.

### Package-Private (Default)

If no modifier is specified, the member is accessible **only within the same package**.

---

# Access Levels

| Modifier | Class | Package | Subclass | World |
|----------|:-----:|:-------:|:--------:|:-----:|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| *(no modifier)* | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

### Column Meaning

| Column | Description |
|---------|-------------|
| **Class** | The class itself can access the member. |
| **Package** | Any class in the same package can access the member. |
| **Subclass** | A subclass in another package can access the member. |
| **World** | Any class anywhere can access the member. |

A class always has access to its own members.

---

# Why Access Levels Matter

Access modifiers affect your code in two important ways.

## 1. Using Existing Classes

When using classes from external libraries (such as the Java Platform), access modifiers determine **which members your code can access**.

## 2. Designing Your Own Classes

When creating your own classes, you should decide the appropriate access level for every:

- Field
- Method
- Constructor
- Nested class

Choosing the correct access level helps protect your implementation and makes your API easier to use correctly.

---

# Visibility Example

Suppose we have the following classes:

- `Alpha`
- `Beta`
- `AlphaSub`
- `Gamma`

The visibility of `Alpha` members depends on the modifier used.

| Modifier | Alpha | Beta | AlphaSub | Gamma |
|----------|:-----:|:----:|:--------:|:-----:|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| *(no modifier)* | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

---

# Best Practices

✔ Use the **most restrictive access level** that still allows your code to work.

In general:

- Prefer `private` unless there is a good reason to expose a member.
- Avoid `public` fields (except for constants).
- Public fields tightly couple users of your class to its implementation, making future changes more difficult.
- Exposing behavior through methods instead of fields provides greater flexibility and better encapsulation.

> **Rule of thumb:** Start with `private` and only increase visibility when necessary.