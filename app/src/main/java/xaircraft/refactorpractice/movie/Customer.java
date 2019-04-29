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
        double allAmount = 0;
        int frequentRentalPoint = 0;
        Enumeration datas = rentals.elements();
        String result = "Rental record for " + getName() + "\n";
        while (datas.hasMoreElements()) {
            Rental rental = (Rental) datas.nextElement();
            allAmount += rental.getCharge();
            frequentRentalPoint++;
            if (rental.getMovie().getType() == Movie.TYPE_NEW && rental.getDayRental() > 1) {
                frequentRentalPoint++;
            }
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
        }

        result += "The all amount is " + allAmount + "\n";
        result += "You earn " + frequentRentalPoint + " frequent rental points";
        return result;
    }

}
