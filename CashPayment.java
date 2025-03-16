public class CashPayment implements PaymentMethod {
    private String status;

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Cash payment selected");
        System.out.println("Amount to pay |" + amount + " tg");
        System.out.println("Please deposit the money into the cash register ");

        status = "Paid";
        return true;
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }
}
