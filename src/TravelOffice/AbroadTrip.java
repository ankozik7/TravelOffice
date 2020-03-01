package TravelOffice;

public class AbroadTrip extends Trip {
 private double insurance;


    public AbroadTrip(String destination, Date start, Date end, double price, double insurance) {
        super(destination, start, end, price);
        this.insurance = insurance;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }


    @Override
    public double getPrice() {
        return super.getPrice()+getInsurance(); }
    }




