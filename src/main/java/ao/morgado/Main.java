package ao.morgado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Threads

        Thread thread1 = new Thread(new PlatformThread());
        Thread thread2 = new Thread(new PlatformThread());
        thread1.start();
        thread2.start();
    }
}