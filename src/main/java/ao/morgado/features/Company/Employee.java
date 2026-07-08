package ao.morgado.features.Company;

public abstract class Employee {

    String typeWritten;
    double baseSalary;

    public Employee(String typewritten, double salary){
        this.typeWritten = typewritten;
        this.baseSalary = salary;
    }

    public void printData() {
        System.out.println("TypeWritten: " + typeWritten);
        System.out.println("Employee Salary: " + baseSalary);
    }

    abstract double calculateBonus();
}
