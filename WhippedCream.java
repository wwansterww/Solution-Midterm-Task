public class WhippedCream extends BeverageDecorator {
    private static final double WHIPPED_CREAM_PRICE = 400;

    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + WHIPPED_CREAM_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped cream";
    }
}
