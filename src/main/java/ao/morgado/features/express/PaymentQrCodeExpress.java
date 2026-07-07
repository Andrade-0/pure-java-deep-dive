package ao.morgado.features.express;

import ao.morgado.features.paymentmethod.PaymentMethod;

import java.util.Random;

public class PaymentQrCodeExpress implements PaymentMethod {

    Random random = new Random();

    String phoneNumber;

    public PaymentQrCodeExpress(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Payment completed successfully, phone number: " + phoneNumber);
        return true;
    }

    @Override
    public String getProof(){
        return "Proof-" + random.nextInt(1_000_000);
    }
}