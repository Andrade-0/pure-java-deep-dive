package ao.morgado;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Arithmetic Expressions: + , - , *, /

        BigDecimal amount = new BigDecimal("9999");

        double price = amount.doubleValue(); // doubleValue - casting to double
        System.out.println("Price is " + price);

        Object random = 10.6;
        double m = (double)random + 1.62;
        System.out.println("M is " + m);

        // Casting in Java is the conversion of one data type to another

        int x = 12;
        x++;
        System.out.println("x is " + x);

        int y = ++x; // it uses the new value of x after increment
        System.out.println("y is " + y);

        int w = 6;
        w *= w; // w /= 6; || w -= 6;
        System.out.println("w is " + w);
    }
}