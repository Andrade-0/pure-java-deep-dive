# What Is a Class?

A **class** is a **blueprint** used to create objects.

Think about bicycles in the real world. There may be thousands of bicycles with the same make and model. Although they are different physical bicycles, they were all built from the same blueprint.

In Object-Oriented Programming:

- **Class** → Blueprint
- **Object** → Instance created from that blueprint

Your bicycle is an **instance** of the `Bicycle` class.

---

# Example: Bicycle Class

```java
class Bicycle {

  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int newValue) {
    cadence = newValue;
  }

  void changeGear(int newValue) {
    gear = newValue;
  }

  void speedUp(int increment) {
    speed = speed + increment;
  }

  void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  void printStates() {
    System.out.println(
            "cadence:" + cadence +
                    " speed:" + speed +
                    " gear:" + gear
    );
  }
}
```

---

# Understanding the Class

The `Bicycle` class contains two main parts:

## Fields (State)

These variables store the object's data.

| Field | Description |
|--------|-------------|
| `cadence` | Current pedal cadence |
| `speed` | Current speed |
| `gear` | Current gear |

These fields represent the **state** of the bicycle.

---

## Methods (Behavior)

Methods define what the object can do.

| Method | Purpose |
|---------|---------|
| `changeCadence()` | Changes the pedal cadence |
| `changeGear()` | Changes the current gear |
| `speedUp()` | Increases the speed |
| `applyBrakes()` | Decreases the speed |
| `printStates()` | Displays the bicycle's current state |

These methods represent the **behavior** of the bicycle.

---

# Why Doesn't This Class Have a `main()` Method?

The `Bicycle` class is **not a complete application**.

Its only purpose is to describe what a bicycle is and what it can do.

Creating and using `Bicycle` objects is the responsibility of another class.

---

# Creating Objects

The following class creates and uses two different `Bicycle` objects.

```java
class BicycleDemo {

  public static void main(String[] args) {

    // Create two Bicycle objects
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    // Modify bike1
    bike1.changeCadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printStates();

    // Modify bike2
    bike2.changeCadence(50);
    bike2.speedUp(10);
    bike2.changeGear(2);

    bike2.changeCadence(40);
    bike2.speedUp(10);
    bike2.changeGear(3);

    bike2.printStates();
  }
}
```

---

# What's Happening?

### Step 1 — Create Two Objects

```java
Bicycle bike1 = new Bicycle();
Bicycle bike2 = new Bicycle();
```

Although both objects come from the same class, they are **independent**.

Changing one object does **not** affect the other.

---

### Step 2 — Change Their State

Methods modify each bicycle's internal data.

For example:

```java
bike1.speedUp(10);
```

changes only `bike1`.

It does **not** change `bike2`.

---

### Step 3 — Print Their State

```java
bike1.printStates();
bike2.printStates();
```

Output:

```text
cadence:50 speed:10 gear:2
cadence:40 speed:20 gear:3
```

Notice that each object stores its own values, even though they were created from the same class.

---

# Key Takeaways

- A **class** is a blueprint for creating objects.
- An **object** is an instance of a class.
- A class defines:
  - **Fields** (state)
  - **Methods** (behavior)
- Multiple objects created from the same class have their own independent state.
- A class doesn't need a `main()` method unless it is intended to be the application's entry point.
```