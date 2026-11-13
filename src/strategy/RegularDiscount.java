package strategy;

public class RegularDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double total) {
        return total;
    }
}
