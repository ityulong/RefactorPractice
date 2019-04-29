package xaircraft.refactorpractice.movie;

import xaircraft.refactorpractice.movie.useCompose.ChildrenPrice;
import xaircraft.refactorpractice.movie.useCompose.IPrice;
import xaircraft.refactorpractice.movie.useCompose.NewPrice;
import xaircraft.refactorpractice.movie.useCompose.RegularPrice;

public class Movie {
    public static final int TYPE_REGULAR = 0;
    public static final int TYPE_NEW = 1;
    public static final int TYPE_CHILDREN = 2;

    private IPrice mPrice ;
    private String title;

    public Movie(int type, String title) {
        setType(type);
        this.title = title;
    }

    public int getType() {
        return mPrice.getType();
    }

    public void setType(int type) {
        switch(type){
            case TYPE_NEW:
                mPrice = new NewPrice();
                break;
            case TYPE_CHILDREN:
                mPrice = new ChildrenPrice();
                break;
            case TYPE_REGULAR:
                mPrice = new RegularPrice();
                break;
        }
    }

    public String  getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCharge(int dayRental){
        return mPrice.getCharge(dayRental);
    }

    public int getRentalPoint(int dayRental){
        return mPrice.getRentalPoint(dayRental);
    }
}
