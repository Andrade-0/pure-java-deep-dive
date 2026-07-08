package ao.morgado.features.Company;

public class Manager extends Employee{

    public Manager(String  typewritten, double baseSalary){
        super(typewritten, baseSalary); // super is a keyword used to access members and populate superclasses
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.20;
    }
}
