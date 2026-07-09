package ao.morgado.features;

public class Programmer extends Employee {

    public Programmer(String typeWritten) {
       super(typeWritten);
    }

    @Override
    public void printDepartment() {
        System.out.println(super.department);
    }
}