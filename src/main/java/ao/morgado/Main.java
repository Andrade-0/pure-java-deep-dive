package ao.morgado;

import ao.morgado.features.Employee;
import ao.morgado.features.Manager;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Wildcards "?"

        // ? -> used to read (access) the list data, not modify it

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat.setCurrency(Currency.getInstance("AOA"));

        List<Employee> employees = Arrays.asList(
                new Employee("Morgan", 180_000),
                new Employee("Paulo", 930_000)
        );

        List<Manager> managers = Arrays.asList(
                new Manager("Andrade", 305000, "DESO")
        );

        System.out.println(numberFormat.format(Employee.totSalaries(employees)));
    }
}