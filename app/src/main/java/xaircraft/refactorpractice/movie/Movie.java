package xaircraft.refactorpractice.movie;

public class Movie {
    public static final int TYPE_REGULAR = 0;
    public static final int TYPE_NEW = 1;
    public static final int TYPE_CHILDREN = 2;

    private int mType ;
    private String title;

    public Movie(int type, String title) {
        this.mType = type;
        this.title = title;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        mType = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
