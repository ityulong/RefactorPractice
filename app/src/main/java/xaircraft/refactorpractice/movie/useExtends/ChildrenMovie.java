package xaircraft.refactorpractice.movie.useExtends;

public class ChildrenMovie extends IMovie {

    public ChildrenMovie(String name) {
        super(name);
    }

    @Override
    public double getCharge(int dayRental) {
        double result = 0;
        result += 1.5;
        if (dayRental > 3) {
            result += (dayRental - 3) * 1.5;
        }
        return result;
    }

    @Override
    public int getRentalPoint(int dayRental) {
        return 1;
    }
}
