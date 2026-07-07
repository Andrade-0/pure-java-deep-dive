package ao.morgado.features.paymentmethod;

public interface PaymentMethod {

    boolean processPayment (double amount);

    String getProof();
}
