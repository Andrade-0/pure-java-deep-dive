package ao.morgado.features.Company;

import java.text.NumberFormat;
import java.util.Currency;

public class Programmer extends Employee {

    NumberFormat amountFormat =  NumberFormat.getCurrencyInstance();


    public Programmer(String typeWritten, double salary) {
        super(typeWritten, salary);
        amountFormat.setCurrency(Currency.getInstance("AOA"));
    }

    @Override
    public double calculateBonus() {
        double bonus = baseSalary * 0.67;
        double tot = bonus + baseSalary;
        System.out.println("Bonus: " + bonus);
        System.out.println("Tot: " + amountFormat.format(tot));
        return bonus;
    }
}
