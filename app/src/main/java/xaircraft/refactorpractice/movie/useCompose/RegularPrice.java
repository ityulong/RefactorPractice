package xaircraft.refactorpractice.movie.useCompose;

import xaircraft.refactorpractice.movie.Movie;

public class RegularPrice extends IPrice {
    @Override
    public int getType() {
        return Movie.TYPE_REGULAR;
    }

    @Override
    public double getCharge(int dayRental) {
        double result = 0;
        result += 2;
        if (dayRental > 2) {
            result += (dayRental - 2) * 1.5;
        }
        return result;
    }
}
