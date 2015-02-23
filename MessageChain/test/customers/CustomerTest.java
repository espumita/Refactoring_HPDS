package customers;

import org.junit.Test;
import static org.junit.Assert.*;
import places.Address;
import places.City;
import places.Continent;
import places.Country;

public class CustomerTest {
    
    @Test
    public void isEuropean() {
        Address address = new Address();
        address.setCity(new City("Barcelona", new Country("España", Continent.EUROPE)));
        Customer customer = new Customer("Carlos Acosta");
        customer.setAddress(address);
            
        assertEquals(Continent.EUROPE, customer.getAddress().getCity().getCountry().getContinent());
    }
}
