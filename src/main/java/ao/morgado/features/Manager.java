package ao.morgado.features;

public class Manager extends Employee {

    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getName() { return department; }
}