package ao.morgado;

import ao.morgado.features.Bicycle.MountainBicycle;
import ao.morgado.features.Company.Programmer;
import ao.morgado.features.School.ExternalStudent;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Abstract Methods and Classes

        MountainBicycle  mountainBicycle = new MountainBicycle();
        mountainBicycle.brake();

        Programmer programmerMorgan = new Programmer("tmm0153", 180000.00);
        programmerMorgan.printData();
        programmerMorgan.calculateBonus();

        System.out.println("\n =============================================== \n");

        ExternalStudent andrade = new ExternalStudent(141400, 12, 17);
        andrade.printStudentData();
        andrade.setMedia();
    }
}