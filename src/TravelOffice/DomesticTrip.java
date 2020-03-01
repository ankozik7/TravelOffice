package TravelOffice;

public class DomesticTrip extends Trip {
private double ownArrivalDiscount;


    public DomesticTrip(String destination, Date start, Date end, double price, double ownArrivalDiscount) {
        super(destination, start, end, price);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    public double getOwnArrivalDiscount() {
        return ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice()-getOwnArrivalDiscount(); }
}
