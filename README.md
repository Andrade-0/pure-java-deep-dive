## What Is Inheritance?

Different kinds of objects often have a certain amount in common with each other. Mountain bikes, road bikes, and tandem bikes, for example, all share the characteristics of bicycles (current speed, current pedal cadence, current gear). Yet each also defines additional features that make them different: tandem bicycles have two seats and two sets of handlebars; road bikes have drop handlebars; some mountain bikes have an additional chain ring, giving them a lower gear ratio.

Object-oriented programming allows classes to inherit commonly used state and behavior from other classes.

In this example, `Bicycle` becomes the superclass of `MountainBicycle`. The subclass inherits all the fields and methods from the superclass, while adding its own features.

The syntax for creating a subclass is simple:

```java
class MountainBicycle extends Bicycle {

    // New fields and methods defining
    // a mountain bike would go here

}
```

This gives `MountainBicycle` all the same fields and methods as `Bicycle`, while allowing its code to focus exclusively on the features that make it unique.

> In Java, a class can extend only **one** direct superclass.

---

## Example

### `Main.java`

```java
package ao.morgado;

import ao.morgado.features.bicycle.MountainBicycle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World, I'm doing a review of Java fundamentals!");

        // OOP - Inheritance

        MountainBicycle mountainBicycle = new MountainBicycle();

        mountainBicycle.setSpeed(10);
        mountainBicycle.setGear(1);
        mountainBicycle.setSeatHeight(25);

        mountainBicycle.printStates();
    }
}
```

### `Bicycle.java`

```java
package ao.morgado.features.bicycle;

public class Bicycle {

    int gear;
    int cadence;
    int speed;

    public void setSpeed(int newValue) {
        this.speed = newValue;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void printStates() {
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }
}
```

### `MountainBicycle.java`

```java
package ao.morgado.features.bicycle;

public class MountainBicycle extends Bicycle {

    int seatHeight;

    public void setSeatHeight(int newValue) {
        this.seatHeight = newValue;
    }

    @Override
    public void printStates() {
        super.printStates();
        System.out.println("Seat Height: " + seatHeight);
    }
}
```

### Output

```text
Speed: 10
Gear: 1
Seat Height: 25
```

---

## Understanding the Example

- `MountainBicycle` **extends** `Bicycle`, inheriting all of its fields and methods.
- `setSpeed()` and `setGear()` are inherited from `Bicycle`.
- `seatHeight` and `setSeatHeight()` are defined only in `MountainBicycle`.
- `printStates()` is **overridden** in `MountainBicycle` to include the new `seatHeight` field.
- `super.printStates()` calls the implementation from the superclass (`Bicycle`), avoiding duplicated code.

---

## `@Override`

The `@Override` annotation tells the compiler that the method is intended to override a method from the superclass.

```java
@Override
public void printStates() {
    super.printStates();
    System.out.println("Seat Height: " + seatHeight);
}
```

Using `@Override` is considered a best practice because it helps the compiler detect mistakes, such as misspelled method names or incorrect method signatures.