package xaircraft.refactorpractice.movie.useExtends;

public class NewMovie extends IMovie {

    public NewMovie(String name) {
        super(name);
    }

    @Override
    public double getCharge(int dayRental) {
        double result = 0;
        result += dayRental * 3;
        return result;
    }

    @Override
    public int getRentalPoint(int dayRental) {
        if (dayRental > 1) {
            return 2;
        } else {
            return 0;
        }
    }
}
