package ao.morgado;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // if statements

        int temp = 23;

        if (temp > 30){
            System.out.println("Its a hot day!");
            System.out.println("Drink Water");
        } else if (temp > 20 && temp < 30)
            System.out.println("Beautiful day!");
        else
            System.out.println("Cold day!");

        double income = 400_000;
        boolean goodIncome = (income > 350_000);
        System.out.println(income + " " + goodIncome);

    }
}