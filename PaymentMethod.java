public interface PaymentMethod {
    boolean processPayment(double amount);
    String getPaymentStatus();
}
