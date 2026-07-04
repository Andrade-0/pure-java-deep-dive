package ao.morgado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        String[][][] students = new String[2][3][1];
        students[0][0][0] = "14100";

        String[][] citizens = {
                {"Morgado", "M", "Luanda"},
                {"Joice", "F", "Huambo"},
                {"Alexandra", "F", "Huambo"}
        };
        System.out.println(Arrays.deepToString(citizens)); // deepToString is used to multi-dimensional arrays

        String[] animals = {"Mouse", "Rooster", "Bird", "Lion"};
        String[] backupAnimals = Arrays.copyOf(animals, animals.length+1); // Copies the specified array
        System.out.println("Animals: " + Arrays.toString(backupAnimals));

        System.out.println("HashCode Animals: " + Arrays.hashCode(backupAnimals)); // Returns a hash code based on the contents of the specified array

        int[] ages = new int[3];
        Arrays.setAll(ages, index -> index); // Set all elements of the specified array, using the provided generator function to compute each element
        // -> lambda - this is equivalent to the code below
        // for(int index = 0; index < index.lenght; index ++) {
        //      ages[index] = index;
        // }
        System.out.println("Ages: " + Arrays.toString(ages));

        List<String> cities = List.of("Kilamba", "Marcone", "Sequele", "Kalawenda"); // List.of is immutable list
        cities.stream() // stream: allows processing elements of a list
                .map(String::toUpperCase) // transform each element of the stream || old: .map(city -> city.toUpperCase()) || Method Reference "::"  its a lambda too
                .forEach(System.out::println);

        List<String> towns = new ArrayList<>(); // mutable list and we can to add items
        towns.add("Karlsson");
        towns.add("Berlin");
        towns.add("Hawaii");
        towns.add("London");
        System.out.println("Towns: " + towns);
    }
}