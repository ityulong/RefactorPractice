package xaircraft.refactorpractice.method.introduce_explaining_variable;

public class TestBefore {
    private int count = 10;
    private int itemPrice = 20;

    double price() {
        return count * itemPrice -
                Math.max(0, count - 500) * itemPrice * 0.05 +
                Math.min(count * itemPrice * 0.1, 100);
    }
}
