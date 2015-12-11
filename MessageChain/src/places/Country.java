package places;

public class Country {

    private final String name;
    private final Continent continent;

    public Country(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
    }

    public String name() {
        return name;
    }
    
    public Continent continent() {
        return continent;
    }

    public boolean isEuropean() {
        return continent() == Continent.EUROPE;
    }
}
