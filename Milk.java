public class Milk extends BeverageDecorator {
    private static final double MILK_PRICE = 200;

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + MILK_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}

