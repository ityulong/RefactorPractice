package xaircraft.refactorpractice.movie;

public class MovieMain {
    public static void main(String []args){

        Movie movie1 = new Movie( Movie.TYPE_NEW,"复仇者联盟4");
        Movie movie2 = new Movie(Movie.TYPE_CHILDREN,"小猪佩奇");
        Movie movie3 = new Movie( Movie.TYPE_REGULAR,"相对论之伟大的爱因斯坦");
        Movie movie4 = new Movie( Movie.TYPE_NEW,"盗梦空间");
        Movie movie5 = new Movie( Movie.TYPE_REGULAR,"我们的师傅");

        Customer mCustomer = new Customer("北极之北");
        mCustomer.add(new Rental(movie1, 20));
        mCustomer.add(new Rental(movie2, 10));
        mCustomer.add(new Rental(movie3, 1));
        mCustomer.add(new Rental(movie4, 80));
        mCustomer.add(new Rental(movie5, 60));

        System.out.println(mCustomer.statement());
    }

}
