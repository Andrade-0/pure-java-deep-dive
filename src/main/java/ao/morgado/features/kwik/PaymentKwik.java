package ao.morgado.features.kwik;

import ao.morgado.features.paymentmethod.PaymentMethod;

import java.util.Random;

public class PaymentKwik implements PaymentMethod {

    Random random = new Random();

    String phoneNumber;

    public PaymentKwik(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean processPayment (double amount) {
        System.out.println("Charging AOA " + amount + " with the phone number " + phoneNumber);
        return true;
    }

    @Override
    public String getProof() {
        return "Proof-" + random.nextInt(1_000_000);
    }
}
