package ao.morgado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

       //  Converting Simple loops using streams

        // old way:
          // for(int i = 0; i < 10; i++) { System.out.println(i); }

        // Streams: can only be used once

        // new way
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);

        IntStream numbers = IntStream.of(1,12,332,2);
       // int sum = numbers.sum();
        double average = numbers.average().orElse(0);
       // System.out.println(sum);
        System.out.println(average);

        List<Integer> fakeLetters = new ArrayList<>();
        fakeLetters.add(1);
        fakeLetters.add(1);
        fakeLetters.add(2);
        int lettersStream = fakeLetters.stream() // stream: creates a Stream<Integer>
                .mapToInt(Integer::intValue) // mapToInt: iterates and convert from Stream<Integer> to IntStream
                .sum(); // sums
        System.out.println(lettersStream);
    }
}