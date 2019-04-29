package xaircraft.refactorpractice.movie.useCompose;

import xaircraft.refactorpractice.movie.Movie;

public class ChildrenPrice extends IPrice {
    @Override
    public int getType() {
        return Movie.TYPE_CHILDREN;
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
}
