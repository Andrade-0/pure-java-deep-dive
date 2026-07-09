package ao.morgado.features;

public abstract class Employee {

    String typeWritten;
    String department = "Backend - Software Engineering";

    public Employee(String typeWritten) {
        this.typeWritten = typeWritten;
    }

    public abstract void printDepartment();
}