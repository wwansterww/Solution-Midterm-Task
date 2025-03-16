public class CreditCardValidatorAdapter {
    public static boolean validate(String cardNumber) {
        return cardNumber.matches("\\d{16}");
    }
}
