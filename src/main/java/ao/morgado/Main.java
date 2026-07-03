package ao.morgado;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // deep dive - arrays

        // old declaration form: int[] numbers;
        int[] numbers = {6,342,34,12,3}; // older syntax: int[] numbers = int int[]{1,2,3,4,5};
        Arrays.sort(numbers); // to organize the items

        String[] letters = new String[2];
        letters[0] = "A";
        letters[1] = "B";
        System.out.println(letters[0]);

        System.out.println("Array List: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("Arrays.toString "+ Arrays.toString(numbers)); // to convert a array in readable string - is used in simple arrays

        // == Multi dimensional Arrays ==

        String[][] students = new String[2][3];
        students[0][0] = "14100";

        String[][] citizens = {
                {"Morgado", "M"},
                {"Joice", "F"},
                {"Alexandra", "F"}
        };
        System.out.println(Arrays.deepToString(citizens)); // deepToString is used to multi-dimensional arrays
    }
}