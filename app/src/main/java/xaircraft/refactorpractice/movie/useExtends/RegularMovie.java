package xaircraft.refactorpractice.movie.useExtends;

public class RegularMovie extends IMovie {

    public RegularMovie(String name) {
        super(name);
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

    @Override
    public int getRentalPoint(int dayRental) {
        return 1;
    }
}
