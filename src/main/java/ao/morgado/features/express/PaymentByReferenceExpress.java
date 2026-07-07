package ao.morgado.features.express;

import ao.morgado.features.paymentmethod.PaymentMethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class PaymentByReferenceExpress implements PaymentMethod {

    Random random = new Random();

    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public boolean processPayment(double amount) {
        String paymentReference = String.format("%06d", random.nextInt(100));
        String expirationDate = LocalDateTime.now().plusDays(1).plusHours(1).format(dateFormatter);
        System.out.println("Payment Reference: " + paymentReference + " expires in " + expirationDate);
        return false;
    }

    @Override
    public String getProof(){
        return "Proof-" + random.nextInt(1_000_000);
    }
}