package TravelOffice;

import java.util.HashMap;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        // TODO code application logic here

        TravelOffice travelOffice=new TravelOffice(new HashSet<Customer>(), new HashMap<String, Trip>());
        //C1
        Address address = new Address("Krakowska 4", "Katowice", "41-400");
        Trip abroadTrip = new AbroadTrip("Rzym", new Date(2019, 8, 5), new Date(2020, 1, 2),1000,200);
        Customer customer = new Customer("Janek");
        customer.setAddress(address);
        customer.setTrip(abroadTrip);

        //C2
        Address address2 = new Address("Katowicka 4", "Wrocław", "50-400");
        Trip abroadTrip2 = new AbroadTrip("Wiedeń", new Date(2019, 8, 5), new Date(2020, 4, 2),900,100);
        Customer customer2 = new Customer("Kuba");
        customer2.setAddress(address2);
        customer2.setTrip(abroadTrip2);

        //C3

        Address address3 = new Address("Bronowicka 4", "Warszawa", "00-400");
        Trip domesticTrip = new DomesticTrip("Kraków", new Date(2019, 7, 5), new Date(2020, 1, 2),500,50);
        Customer customer3 = new Customer("Marek");
        customer3.setAddress(address3);
        customer3.setTrip(domesticTrip);

        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(customer2);
        travelOffice.addCustomer(customer3);
        travelOffice.addTrip("Rzym",abroadTrip);
        travelOffice.addTrip("Wiedeń",abroadTrip2);
        travelOffice.addTrip("Kraków",domesticTrip);
        System.out.println(travelOffice.getCustomerSet().toString());
        System.out.println(travelOffice.getTripMap().toString());
        travelOffice.removeCustomer(customer);
        travelOffice.removeTrip("Kraków");
        System.out.println(travelOffice.getCustomerSet().toString());
        System.out.println(travelOffice.getTripMap().toString());
        travelOffice.removeCustomer(customer);
       travelOffice.removeTrip("Kraków");
        System.out.println(travelOffice.findCustomerByName("Marek"));






    }
}
