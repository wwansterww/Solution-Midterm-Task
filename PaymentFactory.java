public class PaymentFactory {
    public static PaymentMethod createPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "credit card":
                return new CreditCardPayment();
            case "cash":
                return new CashPayment();
            case "kaspi":
                return new KaspiBankTransferPayment();
            default:
                throw new IllegalArgumentException("Unknown payment method " + type);
        }
    }
}
