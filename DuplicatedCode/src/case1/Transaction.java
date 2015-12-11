package case1;

import java.util.Date;

public class Transaction {

    private final Date date;
    private final double amount;

    public Transaction(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Date date() {
        return date;
    }

    public double amount() {
        return amount;
    }
}
