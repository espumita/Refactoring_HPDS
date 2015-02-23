package invoice;

import org.junit.Test;
import static org.junit.Assert.*;
import invoice.Invoice;
import org.junit.Assert;

public class InvoiceTest {

    @Test
    public void invoiceWithDiscount() {
        Invoice invoice = new Invoice(10, 2.5);
        assertEquals(22.5, invoice.getTotal(), 0.01);
    }

    @Test
    public void invoiceWithoutDiscount() {
        Invoice invoice = new Invoice(2, 2.5);
        assertEquals(5, invoice.getTotal(), 0.01);
    }

}