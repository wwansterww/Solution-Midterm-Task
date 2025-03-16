public class CoffeeFactory {
    public static Beverage createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "americano":
                return new Americano();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            case "dalgona":
                return new Dalgona();
            default:
                throw new IllegalArgumentException("Unknown type of coffee- " + type);
        }
    }
}
