# Java Wildcards (`?`, `? extends`, `? super`)

## The Problem Wildcards Solve

Imagine you have a list of `Integer` values (`List<Integer>`) and a method that accepts a list of `Number` (`List<Number>`).

```java
List<Integer> numbers = List.of(1, 2, 3);

void print(List<Number> list) {
    // ...
}

print(numbers); // ❌ Compilation error!
```

Even though `Integer` is a subclass of `Number`, this does **not** compile.

That's because Java treats `List<Integer>` and `List<Number>` as **completely different types**. Generics in Java are **invariant**, meaning there is no inheritance relationship between `List<Integer>` and `List<Number>`.

This restriction prevents many useful programming patterns.

**Wildcards** were introduced to solve this problem by allowing methods to work with a **family of related types** instead of a single fixed type.

---

# The Three Types of Wildcards

## `?` — Any Type

Use `?` when you don't care about the element type.

```java
void printSize(List<?> list) {
    System.out.println(list.size());
}
```

This method accepts:

- `List<Integer>`
- `List<String>`
- `List<Double>`
- `List<Anything>`

Use `?` when you only need to work with the collection itself (for example, checking its size or iterating over it as `Object`s).

---

## `? extends Number` — Number or Any Subtype

```java
void printNumbers(List<? extends Number> list) {
    // ...
}
```

This method accepts:

- `List<Integer>`
- `List<Double>`
- `List<Float>`
- `List<Long>`
- `List<Number>`

Use `? extends T` when you only need to **read** values from the collection.

The compiler guarantees that every element is at least a `Number`.

---

## `? super Integer` — Integer or Any Supertype

```java
void addNumber(List<? super Integer> list) {
    list.add(5);
}
```

This method accepts:

- `List<Integer>`
- `List<Number>`
- `List<Object>`

Use `? super T` when you need to **write** (add) values to the collection.

The compiler guarantees that it is safe to insert `Integer` objects.

---

# Quick Summary

| Wildcard | Accepts | Best Use |
|----------|----------|----------|
| `<?>` | Any type | When the element type doesn't matter |
| `<? extends T>` | `T` and its subclasses | Reading values (Producer) |
| `<? super T>` | `T` and its supertypes | Writing values (Consumer) |

---

# Easy Rule to Remember (PECS)

A common Java rule is **PECS**:

- **Producer Extends** → `? extends T`
- **Consumer Super** → `? super T`

Think of it this way:

- If the collection **produces** values for you to read → use `extends`.
- If the collection **consumes** values that you add → use `super`.
