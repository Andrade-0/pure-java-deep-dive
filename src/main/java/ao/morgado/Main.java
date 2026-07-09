package ao.morgado;

import ao.morgado.feature.Employee;
import ao.morgado.feature.Manager;
import ao.morgado.feature.Programmer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Polymorphism

        List<Employee> team = List.of(
                new Programmer("Morgan",100_000,8),
                new Manager("Melo",16)
        );

        for(Employee e: team) {
            e.work();
            System.out.println();
            System.out.println("Bonus: "+e.calculateSalary());
        }

        System.out.println("TotEmployees: " + Employee.getTotEmployees());
    }
}