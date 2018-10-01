import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testGTLN1() {
        assertEquals(3, LN.GTLN(3, 1));
    }

    @Test
    public void testGTLN2() {
        assertEquals(4,LN.GTLN(4,3));
    }
    @Test
    public void testGTLN3() {
        assertEquals(5,LN.GTLN(2,5));
    }
    @Test
    public void testGTLN4() {
        assertEquals(6,LN.GTLN(6,4));
    }
    @Test
    public void testGTLN5() {
        assertEquals(7,LN.GTLN(5,7));
    }
}