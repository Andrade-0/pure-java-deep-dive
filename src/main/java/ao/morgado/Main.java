package ao.morgado;

import ao.morgado.features.Bicycle.MountainBicycle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Abstract Methods and Classes

        MountainBicycle  mountainBicycle = new MountainBicycle();

        mountainBicycle.brake();
    }
}