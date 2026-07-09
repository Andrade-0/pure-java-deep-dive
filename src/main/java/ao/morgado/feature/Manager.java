package ao.morgado.feature;

public class Manager extends Employee {

    private int numberSubordinates;

    public Manager(String name, int numberSubordinates) {
        super(name, numberSubordinates);
        this.numberSubordinates = numberSubordinates;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (numberSubordinates * 0.5);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Supervising: "+ numberSubordinates +" subordinates");
    }
}