package ao.morgado.features.employee;

public class Employee {

    private String name;
    private String employeeId;
    private Integer salary;

    public Employee(String name, String employeeId, Integer salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() { return name; }

    public String getEmployeeId() { return employeeId; }

    public Integer getSalary() { return salary; }

    @Override
    public String toString() {
        return name + "(ID: " + employeeId + ", Salary: " + salary + ")";
    }
}
