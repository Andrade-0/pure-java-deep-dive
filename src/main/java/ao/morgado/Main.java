package ao.morgado;

import ao.morgado.feature.employee.service.Employee;
import ao.morgado.feature.programmer.Programmer;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // praticing-oop-abstract

        Pattern uuidPattern = Pattern.compile("^[0-9]{4}[A-Z]{2}");

        String programmerUUID = "1234LA";

        System.out.println();

        if(!uuidPattern.matcher(programmerUUID).matches()) {
            System.out.println("Invalid UUID! Correct UUID format: 0000AB!");
        }

        Employee programmer = new Programmer("Morgan", "DESO", programmerUUID, 220_000, "Angular, Java, PHP");
        // Programmer.calculateBonus(programmer.getSalary());
        programmer.calculateBonus();
        programmer.printStates();
    }
}