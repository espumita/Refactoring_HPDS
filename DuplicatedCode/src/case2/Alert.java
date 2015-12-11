package case2;

import java.util.Date;

public class Alert {
    public final static int HIGH = 1;
    public final static int NORMAL = 0;
    public final static int LOW = -1;

    private double average;
    private final int rating;
    private final Date expiry;
    private final Date maturity;
    private final int level;

    public Alert(double average, int rating, Date expiry) {
        this(average,rating,expiry,null,NORMAL);
    }

    public Alert(double average, int rating, Date expiry, Date maturity) {
        this(average,rating,expiry,maturity,NORMAL);
    }

    public Alert(double average, int rating, Date expiry, Date maturity, int level) {
        this.average = average;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = maturity;
        this.level = level;
    }

    public double average() {
        return average;
    }

    public int rating() {
        return rating;
    }

    public Date expiry() {
        return expiry;
    }

    public Date maturity() {
        return maturity;
    }

    public boolean isHighLevel() {
        return level == HIGH;
    }

    public boolean isNormalLevel() {
        return level == NORMAL;
    }

    public boolean isLowLevel() {
        return level == LOW;
    }
    
    
}
