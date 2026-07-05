package ao.morgado;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Math Class

        double price = 12.4;
        System.out.println("The weight is " + Math.round(price)); // Returns the closest long to the argument, with ties rounding to positive infinity

        System.out.println("The price is " + Math.floor(price)); // Double value that is less than or equal to the argument and is equal to a mathematical integer

        System.out.println("Math Ceil: " + (int) Math.ceil(price)); // Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer

        System.out.println("Math Max: " + Math.max(14, (int) Math.floor(price))); // Returns the greater of two int values

        var random = Math.random();
        System.out.println("Random Number: " + random);
    }
}