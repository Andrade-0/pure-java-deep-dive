package ao.morgado.features.card;

import ao.morgado.features.paymentmethod.PaymentMethod;

import java.util.Random;

public class PaymentCard implements PaymentMethod {

    Random random = new Random();

    private String cardNumber;

    public PaymentCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Charging AOA" + amount + " , IBAN: " + cardNumber);
        return true;
    }

    @Override
    public String getProof() {
        return "Proof-" + random.nextInt(1_000_000);
    }
}
