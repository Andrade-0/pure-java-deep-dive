# What Is an Object?

Objects are the foundation of **Object-Oriented Programming (OOP)**. They represent real-world entities and are defined by two main characteristics:

- **State** – the data or attributes an object has.
- **Behavior** – the actions an object can perform.

## Real-World Objects

Look around you. Almost everything you see can be considered an object:

- 🐶 Dog
- 🪑 Desk
- 📺 Television
- 🚲 Bicycle

Every real-world object has both **state** and **behavior**.

### Example: Dog

**State**
- Name
- Color
- Breed
- Hunger level

**Behavior**
- Barking
- Fetching
- Wagging its tail

### Example: Bicycle

**State**
- Current gear
- Current pedal cadence
- Current speed

**Behavior**
- Change gear
- Change pedal cadence
- Apply brakes

---

## Thinking in Objects

When learning OOP, it's useful to observe everyday objects and ask yourself:

1. **What states can this object have?**
2. **What behaviors can this object perform?**

### Example: Lamp

**State**
- On
- Off

**Behavior**
- Turn on
- Turn off

### Example: Radio

**State**
- On/Off
- Current volume
- Current station

**Behavior**
- Turn on
- Turn off
- Increase volume
- Decrease volume
- Seek stations
- Scan stations
- Tune stations

You'll also notice that some objects contain other objects. These observations translate directly into object-oriented programming.

---

# Software Objects

Software objects are conceptually similar to real-world objects.

They also consist of:

- **State**, stored in **fields** (variables).
- **Behavior**, exposed through **methods** (functions).

Methods operate on an object's internal state and serve as the primary mechanism for communication between objects.

> **Encapsulation** is the practice of hiding an object's internal state and allowing interaction only through its public methods. It is one of the fundamental principles of Object-Oriented Programming.

---

## Bicycle as a Software Object

Imagine modeling a bicycle in software.

### Fields (State)

- Current speed
- Current pedal cadence
- Current gear

### Methods (Behavior)

- Change gear
- Increase speed
- Apply brakes
- Change pedal cadence

The object controls how its data is modified.

For example, if the bicycle has only **6 gears**, the `changeGear()` method can reject invalid values such as:

- Less than **1**
- Greater than **6**

This protects the object from entering an invalid state.

---

# Benefits of Software Objects

## 1. Modularity

Each object has its own source code and can be developed, tested, and maintained independently.

**Benefits**
- Easier maintenance
- Better organization
- Independent development

---

## 2. Information Hiding (Encapsulation)

Users interact only with an object's public methods.

The internal implementation remains hidden, making the code:

- Safer
- Easier to modify
- Less prone to misuse

---

## 3. Code Reuse

Once an object has been created, it can be reused in multiple programs.

This allows developers to:

- Reuse existing solutions
- Avoid rewriting code
- Trust well-tested components

---

## 4. Pluggability and Easier Debugging

If one object becomes problematic, it can often be replaced without affecting the rest of the application.

Think of it like replacing a broken bolt in a bicycle:

- ❌ You don't replace the entire bicycle.
- ✅ You replace only the broken part.

This modular design makes applications easier to maintain and debug.