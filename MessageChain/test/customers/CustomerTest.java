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
        Customer customer = new Customer("Carlos Acosta")
                .address(new Address()
                    .postalCode("35011")
                    .city(new City("Barcelona",new Country("España", Continent.EUROPE))));
        assertTrue(customer.isEuropean());
    }

}
