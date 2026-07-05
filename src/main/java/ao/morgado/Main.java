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

        System.out.print("Principal: ");
        double amountPrincipal = in.nextDouble();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = in.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int periodYears = in.nextInt();
        int numberOfPayments = periodYears * MONTHS_IN_YEAR;

        double mortgage = amountPrincipal
                * (monthlyInterestRate * Math.pow(1 +  monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 +  monthlyInterestRate, numberOfPayments) - 1);

        System.out.println("Mortgage: " + numberFormat.format(mortgage));
    }
}