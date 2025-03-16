abstract public class Beverage {
    protected String description = "Unknown drink";

    public String getDescription() {
        return description;
    }

    abstract public double getPrice();
}
