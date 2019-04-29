package xaircraft.refactorpractice.movie.useExtends;

public abstract class IMovie {
    private String mTitle;

    public IMovie(String name) {
        this.mTitle = name;
    }

    public String getTitle() {
        return mTitle;
    }

    public abstract double getCharge(int dayRental);
    public abstract int getRentalPoint(int dayRental);
}
