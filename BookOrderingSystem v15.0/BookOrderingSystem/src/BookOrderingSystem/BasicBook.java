package BookOrderingSystem;

public class BasicBook implements Book {

    private final double basicPrice = 15.00;

    @Override
    public double getPrice() {
        return basicPrice;
    }

    @Override
    public String getDesc() {
        return String.format("%20.2f\n", basicPrice);
    }

}
