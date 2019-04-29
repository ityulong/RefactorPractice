package xaircraft.refactorpractice.movie.useCompose;

import xaircraft.refactorpractice.movie.Movie;

public class NewPrice extends IPrice {
    @Override
    public int getType() {
        return Movie.TYPE_NEW;
    }

    @Override
    public double getCharge(int dayRental) {
        double result = 0;
        result += dayRental * 3;
        return result;
    }
}
