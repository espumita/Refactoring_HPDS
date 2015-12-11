package case2;

import java.util.Calendar;
import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Test;

public class AlertTest {
    

    @Test
    public void testBasic() {
        Alert alert = new Alert(2.0, 1, createDate(2013, 2, 10, 8, 15, 30));
        assertEquals(2.0, alert.average(), 0);
        assertEquals(1, alert.rating());
        assertDateEquals(createDate(2013, 2, 10, 8, 15, 30), alert.expiry());
        assertEquals(null, alert.maturity());
        assertTrue(alert.isNormalLevel());
        assertFalse(alert.isHighLevel());
        assertFalse(alert.isLowLevel());
    }
    
    @Test
    public void testMaturity() {
        Alert alert = new Alert(2.0, 1, createDate(2013, 2, 10, 8, 15, 30), createDate(2013, 2, 12, 0, 0, 0));
        assertEquals(2.0, alert.average(), 0);
        assertEquals(1, alert.rating());
        assertDateEquals(createDate(2013, 2, 10, 8, 15, 30), alert.expiry());
        assertDateEquals(createDate(2013, 2, 12, 0, 0, 0), alert.maturity());
        assertTrue(alert.isNormalLevel());
        assertFalse(alert.isHighLevel());
        assertFalse(alert.isLowLevel());
    }
    
    @Test
    public void testHighLevel() {
        Alert alert = new Alert(2.0, 1, createDate(2013, 2, 10, 8, 15, 30), createDate(2013, 2, 12, 0, 0, 0), Alert.HIGH);
        assertEquals(2.0, alert.average(), 0);
        assertEquals(1, alert.rating());
        assertDateEquals(createDate(2013, 2, 10, 8, 15, 30), alert.expiry());
        assertDateEquals(createDate(2013, 2, 12, 0, 0, 0), alert.maturity());
        assertFalse(alert.isNormalLevel());
        assertTrue(alert.isHighLevel());
        assertFalse(alert.isLowLevel());
    }
	
    @Test
    public void testNormalLevel() {
        Alert alert = new Alert(2.0, 1, createDate(2013, 2, 10, 8, 15, 30), createDate(2013, 2, 12, 0, 0, 0), Alert.NORMAL);
        assertEquals(2.0, alert.average(), 0);
        assertEquals(1, alert.rating());
        assertDateEquals(createDate(2013, 2, 10, 8, 15, 30), alert.expiry());
        assertDateEquals(createDate(2013, 2, 12, 0, 0, 0), alert.maturity());
        assertTrue(alert.isNormalLevel());
        assertFalse(alert.isHighLevel());
        assertFalse(alert.isLowLevel());
    }		
	
    @Test
    public void testLowLevel() {
        Alert alert = new Alert(2.0, 1, createDate(2013, 2, 10, 8, 15, 30), createDate(2013, 2, 12, 0, 0, 0), Alert.LOW);
        assertEquals(2.0, alert.average(), 0);
        assertEquals(1, alert.rating());
        assertDateEquals(createDate(2013, 2, 10, 8, 15, 30), alert.expiry());
        assertDateEquals(createDate(2013, 2, 12, 0, 0, 0), alert.maturity());
        assertFalse(alert.isNormalLevel());
        assertFalse(alert.isHighLevel());
        assertTrue(alert.isLowLevel());
    }	
    
    private Date createDate(int year, int month, int day, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute, second);
		calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

	private void assertDateEquals(Date expected, Date result) {
		assertEquals(expected.getTime(), result.getTime());
	}
}
