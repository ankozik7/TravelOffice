
package TravelOffice;


import java.util.Objects;

public abstract class Trip {

    private String destination;
    private Date start;
    private Date end;
    private double price;

    public Trip(String destination, Date start, Date end, double price) {
        this.destination = destination;
        this.start = start;
        this.end = end;
        this.price=price;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }


    @Override
    public String toString() {
        return "Trip{" +
                "destination='" + this.getDestination() + '\'' +
                ", start=" + this.getStart() +
                ", end=" + this.getEnd() +
                ", price=" + this.getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;
        Trip trip = (Trip) o;
        return Double.compare(trip.getPrice(), getPrice()) == 0 &&
                getDestination().equals(trip.getDestination()) &&
                getStart().equals(trip.getStart()) &&
                getEnd().equals(trip.getEnd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestination(), getStart(), getEnd(), getPrice());
    }
}
