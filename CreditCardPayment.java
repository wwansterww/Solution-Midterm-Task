import java.util.Scanner;

public class CreditCardPayment implements PaymentMethod {
    private String status;

    @Override
    public boolean processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card number (16 digits) ");
        String cardNumber = scanner.nextLine();

        if (!CreditCardValidatorAdapter.validate(cardNumber)) {
            status = "Failed";
            System.out.println("Error | Invalid card number! |");
            return false;
        }

        status = "Completed";
        System.out.println("Card payment successful " + amount + " tg.");
        return true;
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }
}
