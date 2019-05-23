package xaircraft.refactorpractice.function.replace_parameter_with_methods;

public class TestAfter {
    private int count = 20;
    private int itemPrice = 23;


    public double getPrice() {
        if (getDiscountLevel() == 2) return getBasePrice() * 0.1;
        else return getBasePrice() * 0.2;
    }

    public int getDiscountLevel() {
        int discountLevel;
        if (count > 100) discountLevel = 2;
        else discountLevel = 1;
        return discountLevel;
    }

    public int getBasePrice() {
        return count * itemPrice;
    }
}
