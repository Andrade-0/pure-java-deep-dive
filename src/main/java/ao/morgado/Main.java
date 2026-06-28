package ao.morgado;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        int age = 21, temperature = 12;
        age = 20;
        BigDecimal amount = BigDecimal.valueOf(2000.00); // valueOf() -> utility tool to convert one data type into another
        String amountInString = String.valueOf(amount);

        System.out.println(age);
    }
}