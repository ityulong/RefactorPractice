package xaircraft.refactorpractice.movie;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void add(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        Enumeration datas = rentals.elements();
        String result = "Rental record for " + getName() + "\n";
        while (datas.hasMoreElements()) {
            Rental rental = (Rental) datas.nextElement();
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
        }

        result += "The all amount is " + getTotalCharge() + "\n";
        result += "You earn " + getTotalFrequentPoint() + " frequent rental points";
        return result;

    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration datas = rentals.elements();
        while (datas.hasMoreElements()) {
            Rental rental = (Rental) datas.nextElement();
            result += rental.getCharge();
        }
        return result;
    }


    private double getTotalFrequentPoint(){
        double result = 0;
        Enumeration datas = rentals.elements();
        while (datas.hasMoreElements()) {
            Rental rental = (Rental) datas.nextElement();
            result += rental.getRentalPoint();
        }
        return result;
    }
}
