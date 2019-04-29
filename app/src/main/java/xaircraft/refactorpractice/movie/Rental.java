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
        double result = 0;
        switch (getMovie().getType()) {
            case Movie.TYPE_REGULAR:
                result += 2;
                if (getDayRental() > 2) {
                    result += (getDayRental() - 2) * 1.5;
                }
                break;
            case Movie.TYPE_NEW:
                result += getDayRental() * 3;
                break;
            case Movie.TYPE_CHILDREN:
                result += 1.5;
                if (getDayRental() > 3) {
                    result += (getDayRental() - 3) * 1.5;
                }
                break;
        }
        return result;
    }
}
