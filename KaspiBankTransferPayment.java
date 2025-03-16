import java.util.Scanner;

public class KaspiBankTransferPayment implements PaymentMethod {
    private String status;

    @Override
    public boolean processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("| Enter Kaspi Bank number for transfer | ");
        String kaspiNumber = scanner.nextLine();

        if (!kaspiNumber.matches("\\d{11}")) {
            status = "Failed";
            System.out.println("Error | Incorrect Kaspi Bank number |");
            return false;
        }

        status = "Completed";
        System.out.println("Payment via Kaspi Bank was successful " + amount + " tg");
        return true;
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }
}
