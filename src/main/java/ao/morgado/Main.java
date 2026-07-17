package ao.morgado;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Processing data with Stream

        List<String> strings = List.of("one","two","three","four");
        var newList = strings.stream()
                .collect(Collectors
                        .groupingBy(
                                String::length, Collectors.counting()
                        )
                );
//        newList.forEach((key, value) -> System.out.println(key + " : " + value));
//
//        IntSummaryStatistics stats = strings.stream()
//                .mapToInt(String::length)
//                .summaryStatistics();
//        System.out.println(stats);
    }
}