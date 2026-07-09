package ao.morgado.feature;

public class Employee {

    private String name;
    private double baseSalary;
    private static int totEmployees = 0;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        totEmployees++;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void work() {
        System.out.println("Employee " + name + " is working...");
    }

    public static int getTotEmployees() {
        return totEmployees;
    }

    public static double calculateStandardTax(double baseSalary) {
        return baseSalary * 0.15;
    }
}