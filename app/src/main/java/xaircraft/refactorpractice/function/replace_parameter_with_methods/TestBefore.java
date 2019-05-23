package xaircraft.refactorpractice.function.replace_parameter_with_methods;

public class TestBefore {
    private int count = 20;
    private int itemPrice = 23;

    public double getPrice(){
        int basePrice = count * itemPrice;
        int discountLevel;
        if(count >100) discountLevel = 2;
        else discountLevel = 1;
        double finalPrice = discountPrice(basePrice,discountLevel);
        return finalPrice;
    }

    public double discountPrice(int basePrice,int discountLevel){
        if(discountLevel == 2) return basePrice * 0.1;
        else return basePrice * 0.2;
    }
}
