package invoice;

public class Invoice {

    private int quantity;
    private double unitPrice;

    public Invoice(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return price() - discount();
    }

    private double discount() {
        return (price() >= 10) ? price() * 0.1 : 0;
    }

    private double price() {
        return quantity * unitPrice;
    }

}
