package customers;

import places.Address;

public class Customer {
    
    private final String name;
    private Address address;

    public Customer(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public Address address() {
        return address;
    }

    public Customer address(Address address) {
        this.address = address;
        return this;
    }

    public boolean isEuropean() {
        return address().isInEurope();
    }

}
