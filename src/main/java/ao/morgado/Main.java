package ao.morgado;

import ao.morgado.features.bicycle.MountainBicycle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // OOP - Inheritance

        MountainBicycle mountainBicycle = new MountainBicycle();

        mountainBicycle.setSpeed(10);
        mountainBicycle.setGear(1);

        mountainBicycle.printStates();
    }
}