package xaircraft.refactorpractice.method.introduce_explaining_variable;

public class TestAfter {

    private int count = 10;
    private int itemPrice = 20;

    //use 'introduce explaining variable'
    double priceByVaraible() {
        final int basePrice = count * itemPrice;
        final double quantityDiscount = Math.max(0, count - 500) * itemPrice * 0.05;
        final double shipping = Math.min(count * itemPrice * 0.1, 100);
        return basePrice - quantityDiscount + shipping;
    }

    // use 'extract method'
    double priceByExtrcatMethod() {
        return getBasePrice() - getQuantityDiscount() + getShipping();
    }

    int getBasePrice(){
        return count * itemPrice;
    }

    double getQuantityDiscount(){
        return Math.max(0, count - 500) * itemPrice * 0.05;
    }

    double getShipping(){
        return Math.min(getBasePrice() * 0.1, 100);
    }

}
