package ao.morgado.feature;

public class Programmer extends Employee {

    private int hoursPerMonth;

    public Programmer(String name, double baseSalary, int hours) {
        super(name, baseSalary);
        this.hoursPerMonth = hours;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (hoursPerMonth * 0.5);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Programming");
    }
}