package xaircraft.refactorpractice.movie;

public class Rental {
    private Movie mMovie;
    private int mDayRental;


    public Rental(Movie movie, int dayRental) {
        mMovie = movie;
        mDayRental = dayRental;
    }

    public Movie getMovie() {
        return mMovie;
    }

    public void setMovie(Movie movie) {
        mMovie = movie;
    }

    public int getDayRental() {
        return mDayRental;
    }

    public void setDayRental(int dayRental) {
        mDayRental = dayRental;
    }

    public double getCharge() {
        return mMovie.getCharge(mDayRental);
    }

    public int getRentalPoint(){
        return mMovie.getRentalPoint(mDayRental);
    }
}
