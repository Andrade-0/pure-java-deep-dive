package ao.morgado;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Formatting Numbers

        NumberFormat currency = NumberFormat.getCurrencyInstance(); // NumberFormat is the abstract base class for all number formats || Returns a currency format for the current default FORMAT locale
        currency.setCurrency(Currency.getInstance("AOA")); // defines currencyCode

        String result = currency.format(new BigDecimal("999.45"));

        System.out.println("\nPrice: " + result);

        NumberFormat percent = NumberFormat.getPercentInstance(); // Returns a percentage format for the current default FORMAT locale
        System.out.println("Percent: "+percent.format(0.25)); // calculation:  value * 100 + "%"

        double amount = 400000;
        double percentage = 35;
        double paymentToSettlement = (amount * percentage) / 100;
        System.out.println("PaymentToSettlement: "+currency.format(paymentToSettlement));

    }
}