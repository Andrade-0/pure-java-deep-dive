package ao.morgado;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Converting loops with steps


        // iterates : Returns a sequential ordered IntStream produced by iterative application of the given next
        IntStream.iterate(
                1,
                i -> i <= 15,
                i -> i + 2
                ).forEach(System.out::println);


        System.out.println("imperative style: ");
        for(int i = 1;; i++){ // double semicolon means with no exist condition for this loop
            if(i % 2 == 0){
                break;
            }
            System.out.println(i);
        }

        System.out.println("functional style: ");
        IntStream.iterate(1, i -> i + 3)
                .takeWhile(i -> i  <= 4)
                .forEach(System.out::println);
    }
}