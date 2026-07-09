package ao.morgado;

import ao.morgado.features.Weekday;
import ao.morgado.features.Weekend;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Enum

        // Enums are classes where all instances are known to the compiler.
        // They are used for creating types that can only have few possible values.

        LocalDate localDate = LocalDate.now();
        Weekday weekday = Weekday.THURSDAY;

        System.out.println(Weekday.THURSDAY.ordinal()); // Returns the ordinal of this enumeration constant (its position in its enum declaration

        String today = localDate.getDayOfWeek().toString().equals(weekday.toString())
                ? "Correct"
                : "Incorrect";

        System.out.println(today);

        System.out.println(Weekend.SATURDAY.getAbbreviation());
    }
}