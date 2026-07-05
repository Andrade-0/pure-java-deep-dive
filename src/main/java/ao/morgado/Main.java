package ao.morgado;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Mortgage Calculator

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner in = new Scanner(System.in);

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat.setCurrency(Currency.getInstance("AOA"));

        double amountPrincipal = 0;
        while (true) {
            System.out.print("Principal: ");
            amountPrincipal = in.nextDouble();
            if (amountPrincipal >= 10_000 &&  amountPrincipal <= 15_000000)
                break; // stop the loop
            System.out.println("Please enter a principal amount between 10000 and 15000");
        }

        float annualInterestRate = 0;
        float monthlyInterestRate = 0;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = in.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 35) {
                monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break; // stop the loop
            }
            System.out.println("Please enter a monthly interest rate between 1 and 35");
        }

        int periodYears = 0;
        int numberOfPayments = 0;
        while (true) {
            System.out.print("Period (Years): ");
            periodYears = in.nextInt();
            if (periodYears >= 1 && periodYears <= 4) {
                numberOfPayments = periodYears * MONTHS_IN_YEAR;
                break;
            }
        }

        double mortgage = amountPrincipal
                * (monthlyInterestRate * Math.pow(1 +  monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 +  monthlyInterestRate, numberOfPayments) - 1);

        System.out.println("Mortgage: " + numberFormat.format(mortgage));
    }
}