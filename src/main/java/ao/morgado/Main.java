package ao.morgado;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        String number = "10";
        System.out.println(Integer.parseInt(number)); // Integer.parseInt: Only do casting from String to Int
        System.out.println(Short.parseShort(number));
        System.out.printf("%.2f\n", Double.parseDouble(number)); // printf allows manipulations/format the text that will show
        // % means: I want to format the next values || . means: after || .2 - decimal quantities || f: float or double, anyway
        System.out.println(Float.parseFloat(number));

        // Double: the value cannot exist || Double isnt primitive type, is a reference type (Object)
        // double: cannot be null, it always must have a value
        // we can to use cast only in primitives types
        double number1 = 99.2;
        int number1Casted = (int) number1; // (int) is a casting
        System.out.println("Number1: " + number1Casted);

        String numberOne = "1";
        double numberTwo = 2.5;
        int result = Integer.parseInt(numberOne) + (int) numberTwo;

        BigDecimal amount =  new BigDecimal("99.99");

        double random = 12.3;
        System.out.println("randomInt: " + (int) random);

        int test = 12;
        String stringDecimal = String.valueOf(test); // valueOf: returns the string representation of the number argument

        String weight = "89.5";
        System.out.println("Weight: " + Double.parseDouble(weight));

    }
}