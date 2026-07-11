package ao.morgado.feature.employee.service;

import ao.morgado.feature.employee.util.EmployeeUtil;

import java.text.NumberFormat;
import java.util.Currency;

public class Employee extends EmployeeUtil {

    String name;
    String department;
    String uuid;
    double salary;

    NumberFormat paymentFormat = NumberFormat.getCurrencyInstance();

    public Employee(String name, String department, String uuid, double salary) {
        this.uuid = uuid;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getUuid() { return uuid; }

    public String getName() { return name; }

    public String getDepartment() { return department; }

    public double  getSalary() { return salary; }

    @Override
    public double calculateBonus() { return salary * 0.0; }

    @Override
    public void printStates() {
        paymentFormat.setCurrency(Currency.getInstance("AOA"));
        System.out.println(
            "Name: " +  name + " || " +
                "Department: " + department + " || " +
                    "Salary: " + paymentFormat.format(salary) + " || " +
                        "Bonus: " + paymentFormat.format(calculateBonus()) +  " || " +
                            "Total: " + paymentFormat.format(salary+calculateBonus())
        );
    }
}
