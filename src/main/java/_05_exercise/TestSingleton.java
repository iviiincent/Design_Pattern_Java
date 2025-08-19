package _05_exercise;

import org.junit.Assert;
import org.junit.Test;

public class TestSingleton {

    @Test
    public void testTicketMaker() {
        TicketMaker tm1 = TicketMaker.getInstance();
        TicketMaker tm2 = TicketMaker.getInstance();

        Assert.assertEquals(tm1, tm2);
        Assert.assertEquals(1000, tm1.getNextTicketNumber());
        Assert.assertEquals(1001, tm2.getNextTicketNumber());
        for (int i = 1002; i <= 1100; i++) {
            Assert.assertEquals(i, TicketMaker.getInstance().getNextTicketNumber());
        }
        Assert.assertEquals(1101, tm1.getNextTicketNumber());
    }

    @Test
    public void testTriple() {
        for (int i = 0; i < 100; i++) {
            Assert.assertEquals(i % 3, Triple.getInstance(i % 3).getId());
        }

        Assert.assertThrows(Exception.class, () -> Triple.getInstance(3));
        Assert.assertThrows(Exception.class, () -> Triple.getInstance(-1));
    }

}
