package ao.morgado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // ternary operator

        int income = 400_000;
        String className = income > 100_000
                ? "First"
                : "Economy";
        System.out.println("Income: " + income);
        System.out.println("Class: " + className);
    }
}