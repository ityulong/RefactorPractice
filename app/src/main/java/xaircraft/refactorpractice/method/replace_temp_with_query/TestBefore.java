package xaircraft.refactorpractice.method.replace_temp_with_query;

public class TestBefore {
    private int count = 10;
    private int price = 20;

    double getPrice(){
        int basePrice = count * price;
        double discountFactor;
        if(basePrice > 9000) discountFactor = 0.9;
        else discountFactor = 0.95;
        return basePrice * discountFactor;
    }
}
