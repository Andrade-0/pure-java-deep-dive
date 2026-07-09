package ao.morgado.features;

import java.util.List;

public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }

    public double getSalary() { return salary; }

    public static double totSalaries (List<? extends Employee> list) { // this means: "I accept a list of employees or any subtype, such as Manager"
        double total = 0;
        for (Employee employee : list) {
            total += employee.getSalary();
        }
        return total;
    }
}