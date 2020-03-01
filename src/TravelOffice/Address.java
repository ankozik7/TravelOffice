
package TravelOffice;


public class Address {


    private String street;
    private String city;
    private String zip;


    public Address(String street, String city, String zip) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" + "street=" + street + ", city=" + city + ", zip=" + zip + '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


}
