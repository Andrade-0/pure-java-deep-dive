package ao.morgado.feature.programmer;

import ao.morgado.feature.employee.service.Employee;

public class Programmer extends Employee {

    String coreLanguage;

    public Programmer(String name, String department, String uuid, double salary, String coreLanguage) {
        super(name, department, uuid,  salary);
        this.coreLanguage = coreLanguage;
    }

    @Override
    public double calculateBonus() {
        return super.getSalary() * 0.17;
    }
}