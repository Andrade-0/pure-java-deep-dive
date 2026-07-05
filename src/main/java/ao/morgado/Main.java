package ao.morgado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // FizzBuzz

        Scanner in = new Scanner(System.in);

        System.out.println("Number: ");
        int number = in.nextInt();

        if((number % 3 == 0) && (number % 5 == 0))
            System.out.println("FizzBuzz");
        else if(number % 3 == 0)
            System.out.println("Fizz");
        else if(number % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        // _______________________________________________ //

        for (int i = 1; i <= 100; i++) {

            if((i % 3 == 0) && (i % 5 == 0))
                System.out.println("FizzBuzz");
            else if(i % 3 == 0)
                System.out.println("Fizz");
            else if(i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}