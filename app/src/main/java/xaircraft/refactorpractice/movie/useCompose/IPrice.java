package xaircraft.refactorpractice.movie.useCompose;

import xaircraft.refactorpractice.movie.Movie;

public abstract class IPrice {
    public abstract int getType();
    public abstract double getCharge(int dayRental);
    public int getRentalPoint(int dayRental){
        if(getType() == Movie.TYPE_NEW && dayRental > 1){
            return 2;
        }else{
            return 1;
        }
    }
}
