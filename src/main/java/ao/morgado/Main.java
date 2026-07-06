package ao.morgado;

import ao.morgado.features.radio.Radio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // OOP - Class and Objects

        Radio ford_radio = new Radio(); // instance of a class == object created from a class

        ford_radio.setPower(true);
        ford_radio.increaseVolume(1);
        ford_radio.nextStation();

        ford_radio.printStates("Ford Raptor");
    }
}