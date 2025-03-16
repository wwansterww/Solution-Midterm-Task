public class ChocolateSyrup extends BeverageDecorator {
    private static final double CHOCOLATE_PRICE = 500;

    public ChocolateSyrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + CHOCOLATE_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate syrup";
    }
}
