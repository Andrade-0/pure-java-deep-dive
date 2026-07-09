package ao.morgado;

import ao.morgado.features.Animal;
import ao.morgado.features.Cat;
import ao.morgado.features.Employee;
import ao.morgado.features.Programmer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // KeyWord Super

        Animal cat = new Cat();
        cat.makeNoise();

        Employee morgan = new Programmer("Andrade");
        morgan.printDepartment();
    }
}