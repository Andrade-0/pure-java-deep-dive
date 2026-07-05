package ao.morgado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // While Loops

        Scanner in = new Scanner(System.in);

        String voteCitizen = "";

        while (!voteCitizen.equals("MPLA")) {
            System.out.print("Please enter with your vote [MPLA / UNITA]: ");
            voteCitizen = in.next().toUpperCase();
        }
        System.out.print("Good vote, I'll see u after 5 years again to vote in MPLA.");

//        int value = 0;
//        while (value <= 7) {
//            System.out.println(value);
//            value++;
//        }


    }
}