
package TravelOffice;

import java.util.Objects;

public class Customer {


    private String name;
    private Address address;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }


    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Trip getTrip() {
        return trip;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address.toString() + ", trip=" + trip.toString() + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getName().equals(customer.getName()) &&
                getAddress().equals(customer.getAddress()) &&
                getTrip().equals(customer.getTrip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getTrip());
    }
}
