package ao.morgado.features.checkout;

import ao.morgado.features.paymentmethod.PaymentMethod;

public class Checkout {

    public void buy(PaymentMethod paymentMethod, double amount){
        boolean success = paymentMethod.processPayment(amount);

        if (success)
            System.out.println("Success! " + paymentMethod.getProof());
        else
            System.out.println("Failed or waiting for confirmation! " + paymentMethod.getProof());
    }
}
