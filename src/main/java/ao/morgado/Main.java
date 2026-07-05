package ao.morgado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // break and continue (for loop example)
        for (int i = 1; i <= 5; i++) {

            if (i == 2)
                continue; // skip number 2

            if (i == 4)
                break; // stop the loop

            System.out.println(i);
        }

        // ==========================
        // REAL CASE: MENU SYSTEM
        // ==========================

        Scanner in = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Log out");
            System.out.print("Choose a option: ");

            option = in.nextInt();

            if (option == 3) {
                System.out.println("Logging out...");
                break; // log out of the system
            }

            if (option < 1 || option > 3) {
                System.out.println("Invalid option");
                continue; // return to the top of the menu
            }

            System.out.println("Proccessing option " + option);

            switch (option) {
                case 1:
                    System.out.println("Your balance is: 10.000 Kz");
                    break;
                case 2:
                    System.out.println("Deposit successfully completed!");
                    break;
            }
        }

        in.close(); // to close scanner
    }
}