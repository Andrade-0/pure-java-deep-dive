package ao.morgado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Collections: to store and process data in memory

        List<Integer> numbers = List.of(1,2,3); // is a collection to create a immutable list
        System.out.println(numbers);
        System.out.println("get(0) from immutable list: " + numbers.getFirst());

        List<String> letters = new ArrayList<>(); // is a collection that's allow creates a mutable list
        letters.add("A");
        letters.add("B");
        System.out.println(letters);


        // Set: A collection that contains no duplicate elements. More formally,
        // sets contain no pair of elements e1 and e2 such that e1.equals(e2)
        Set<String> names = new TreeSet<>();
        // HashSet<>() : organized list
        // LinkedHashSet<>() : preserves insertion order
        // TreeSet<>() : organized list

        names.add("A");
        names.add("C");
        names.add("B");
        if(names.contains("A")) {
            System.out.println("A already exists");
        }
        System.out.println("Set list: " + names);
    }
}