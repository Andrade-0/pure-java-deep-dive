package ao.morgado;

import ao.morgado.features.card.PaymentCard;
import ao.morgado.features.checkout.Checkout;
import ao.morgado.features.express.PaymentByReferenceExpress;
import ao.morgado.features.kwik.PaymentKwik;
import ao.morgado.features.paymentmethod.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals! \n");

        // Interfaces

        // In the Java programming language, an interface is a reference type, similar to a class, that can contain only constants,
        // method signatures, default methods, static methods (private or public, not protected),
        // instance non-abstract methods (private, not public, not protected), and nested types.
        // Method bodies exist only for default methods, private methods and static methods.
        // Interfaces cannot be instantiated—they can only be implemented by classes or extended by other interfaces.
        // Extension is discussed later in this section.

        Checkout checkout = new Checkout();

        System.out.println("============== PaymentReference ==============");
        PaymentMethod paymentByRefenceExpress = new PaymentByReferenceExpress();
        checkout.buy(paymentByRefenceExpress, 999.99);

        System.out.println("\n============== PaymentKwik ==============");
        PaymentMethod paymentKwik = new PaymentKwik("951993448");
        checkout.buy(paymentKwik, 999.99);

        System.out.println("\n============== PaymentCard ==============");
        PaymentMethod paymentCard = new PaymentCard("AO064344304304040343");
        checkout.buy(paymentCard, 222.99);

    }
}