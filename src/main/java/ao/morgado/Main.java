package ao.morgado;

import ao.morgado.bootstrapper.AnywhereRestClient;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Access Modifiers

        AnywhereRestClient client = new AnywhereRestClient();

        client.requestExternalHost("");
    }
}