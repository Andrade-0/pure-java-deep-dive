package ao.morgado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Collections: to store and process data in memory //

        List<Integer> numbers = List.of(1,2,3); // is a collection to create a immutable list
        System.out.println(numbers);
        System.out.println("get(0) from immutable list: " + numbers.getFirst());

        List<String> letters = new ArrayList<>(); // is a collection that's allow creates a mutable list
        letters.add("A");
        letters.add("B");
        System.out.println(letters);

        // Set

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

        // Map : creates a data with key-value

        Map<String, String> mapCitizens = new HashMap<>(); // Map: dont accept duplicates elements
        // HashMap : Big O # O(1) - constant time - preserves insertion order
        // LinkedHashMap : preserves insertion order
        // TreeMap : organized list
        // Map.of : data key-value : immutable
        mapCitizens.put("name", "Augusto"); // put : to add item on list
        mapCitizens.put("street", "grafanil");
       // mapCitizens.clear(); // to clear list
        mapCitizens.putIfAbsent("country", "Cape Verde"); // putIfAbsent : If the specified key is not already associated with a value
        mapCitizens.merge("name", "Cabral", (oldValue, newValue) -> oldValue + " " + newValue); //
        System.out.println("containsKey: " + mapCitizens.containsKey("name"));
        System.out.println(mapCitizens);

        mapCitizens.forEach( (key, value) -> System.out.println(key + ": " + value)  );

//        for(Map.Entry<String, Integer> entry : mapCitizens.entrySet()) { // ??
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}