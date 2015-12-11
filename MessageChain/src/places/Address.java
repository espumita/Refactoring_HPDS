package places;

public class Address {
    
    private String street;
    private String postalCode;
    private City city;

    public String street() {
        return street;
    }

    public Address street(String street){
        this.street = street;
        return this;
    }

    public String postalCode() {
        return postalCode;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public City city() {
        return city;
    }

    public Address city(City city) {
        this.city = city;
        return this;
    }

    public boolean isInEurope() {
        return city().isEuropean();
    }


}
