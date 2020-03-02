
package TravelOffice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class TravelOffice {

    private Set<Customer> customerSet;
    private Map <String, Trip> tripMap;
    private int customerCount = 0;

    public TravelOffice(Set<Customer> customerSet, Map <String, Trip> tripMap ) {
        this.customerSet = new HashSet<Customer>();
        this.tripMap= new HashMap<String, Trip>();
    }



    public void removeCustomer( String name) {
        Predicate<Customer> customerPredicate
                = customer -> customer.getName().equals(name);
        this.customerSet.removeIf(customerPredicate);
    }


    public  boolean removeTrip(String name){
        boolean removed=true;
        if( this.tripMap.containsKey(name)) {
            tripMap.remove(name);
        } else {removed=false;}
        return removed;
    }

    public void addCustomer(Customer customer) {
      this.customerSet.add(customer);
      this.customerCount++;
        }

        public void addTrip (String name, Trip trip){
        this.tripMap.put(name,trip);
        }


public void showCustomers(){
    Consumer<Customer> printer = customer -> System.out.println(customer);
    customerSet.forEach(printer);
    }

    public void showTrips(){
        BiConsumer<String, Trip> print = (name,trip) -> System.out.println(trip);
        tripMap.forEach(print);
    }

    Customer findCustomerByName(String name){
        for ( Customer c:customerSet
             ) { if( c.getName().equals(name)){return c;}
        }

        return null;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }


    public Map<String, Trip> getTripMap() {
        return tripMap;
    }

    public void setTripMap(Map<String, Trip> tripMap) {
        this.tripMap = tripMap;
    }


    public void setCustomerCount(int customerCount) { this.customerCount = customerCount; }

    public int getCustomerCount() {
        return customerCount;
    }







}
