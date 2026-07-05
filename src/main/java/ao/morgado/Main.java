package ao.morgado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // old school
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        // new way of doing things
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 1; i <= 100; i++) {

            if((i % 3 == 0) && (i % 5 == 0))
                System.out.println("FizzBuzz");
            else if(i % 3 == 0)
                System.out.println("Fizz");
            else if(i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}