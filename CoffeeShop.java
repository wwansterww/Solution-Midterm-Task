import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Beverage coffee = null;
        while (coffee == null) {
            System.out.println("Select coffee |Espresso, Americano, Cappuccino, Latte, Dalgona|");
            String coffeeType = scanner.nextLine().toLowerCase();
            try {
                coffee = CoffeeFactory.createCoffee(coffeeType);
            } catch (IllegalArgumentException e) {
                System.out.println("Error |This coffee is not on the menu!| Try again");
            }
        }

        boolean addingIngredients = true;
        while (addingIngredients) {
            System.out.println("Add an ingredient? (milk, caramel, chocolate, whipped cream) or enter 'done' ");
            String ingredient = scanner.nextLine().toLowerCase();

            switch (ingredient) {
                case "milk":
                    coffee = new Milk(coffee);
                    break;
                case "caramel":
                    coffee = new Caramel(coffee);
                    break;
                case "chocolate":
                    coffee = new ChocolateSyrup(coffee);
                    break;
                case "whipped cream":
                    coffee = new WhippedCream(coffee);
                    break;
                case "done":
                    addingIngredients = false;
                    break;
                default:
                    System.out.println("Incorrect ingredient. Try again.");
            }
        }

        double finalPrice = coffee.getPrice();
        System.out.println("|Your order|" + coffee.getDescription());
        System.out.printf("|Total cost| %.2f tg.%n", finalPrice);

        PaymentMethod payment = null;
        while (payment == null) {
            System.out.println("Select payment method |Credit Card, Cash, Kaspi|");
            String paymentType = scanner.nextLine().toLowerCase();
            try {
                payment = PaymentFactory.createPaymentMethod(paymentType);
            } catch (IllegalArgumentException e) {
                System.out.println("Error |There is no such payment method!| Try again");
            }
        }

        boolean paymentSuccess = payment.processPayment(finalPrice);
        if (paymentSuccess) {
            System.out.println("The order has been successfully paid. |Status| " + payment.getPaymentStatus());
        } else {
            System.out.println("|Payment error! Order not processed|");
        }

        scanner.close();
    }
}
