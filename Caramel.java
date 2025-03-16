public class Caramel extends BeverageDecorator {
    private static final double CARAMEL_PRICE = 600;

    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + CARAMEL_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }
}
