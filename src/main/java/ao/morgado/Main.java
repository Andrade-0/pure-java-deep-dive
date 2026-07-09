package ao.morgado;

import ao.morgado.bootstrapper.Repository;
import ao.morgado.features.box.BoxGeneric;
import ao.morgado.features.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // ==== Generics

        List<String> list = new ArrayList<>();
        list.add("A");
        String firstItem = list.getFirst();
        System.out.println(firstItem);

        //

        BoxGeneric<Integer> box = new BoxGeneric<>();
        box.set(12);
        System.out.println(box.get());

        //

        Repository<Employee> employeeRepository = new Repository<>();
        employeeRepository.add(
                new Employee(
                    "Morgan",
                    "21345678",
                    180_000
                )
        );

        for(Employee empl : employeeRepository.getItems()) {
            System.out.println(empl);
        }

        //

        Employee empl1 = employeeRepository.getItems().getFirst();
        System.out.println(empl1.getEmployeeId());
    }
}