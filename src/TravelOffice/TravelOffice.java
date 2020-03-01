
package TravelOffice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class TravelOffice {

    private Set<Customer> customerSet;
    private Map <String, Trip> tripMap;
    private int customerCount = 0;

    public TravelOffice(Set<Customer> customerSet, Map <String, Trip> tripMap ) {
        this.customerSet = new HashSet<Customer>();
        this.tripMap= new HashMap<String, Trip>();
    }


    public void setCustomerCount(int customerCount) { this.customerCount = customerCount; }

    public int getCustomerCount() {
        return customerCount;
    }




    public void addCustomer(Customer customer) {
      this.customerSet.add(customer);
      this.customerCount++;
        }

        public void addTrip (String name, Trip trip){
        this.tripMap.put(name,trip);
        }



   public  boolean removeTrip(String name){
        boolean removed=true;
       if( this.tripMap.containsKey(name)) {
           tripMap.remove(name);
       } else {removed=false;}
       return removed;
   }

   public boolean removeCustomer(Customer customer){
       boolean removed=true;
       if( this.customerSet.contains(customer)){
           customerSet.remove(customer);
       }
       else {removed=false;}
       return removed;
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









}
