package ao.morgado;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Lambdas

        List<String> numbers = Arrays.asList("one", "two", "three");
        UnaryOperator<String> operator = String::toUpperCase;
        numbers.replaceAll(operator);
        System.out.println(numbers);
    }
}