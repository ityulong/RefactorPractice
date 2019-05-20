package xaircraft.refactorpractice.method.replace_temp_with_query;

public class TestAfter {
    private int count = 10;
    private int price = 20;

    double getPrice(){
        return getBasePrice() * getDiscountFactor();
    }

    private double getDiscountFactor() {
        if(getBasePrice() > 9000) return 0.9;
        else return 0.95;
    }

    int getBasePrice(){
        return count * price;
    }

}
