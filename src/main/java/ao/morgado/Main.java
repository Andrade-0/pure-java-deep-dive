package ao.morgado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Reading Inputs

        Scanner sc = new Scanner(System.in); // A simple text scanner which can parse primitive types and strings using regular expressions

        System.out.print("Please enter with your name: ");
        String name = sc.nextLine().trim(); // .next() get only first word
        System.out.print("Please enter with your age: ");
        int age = sc.nextInt();
        System.out.println("Your name: {"+name+"}"+" and your age: {"+age+"}");
    }
}