package Tuan4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class maxTest {

    //Test hàm max
    @Test
    public void testMax1() {
        max ju = new max();
        assertEquals( 1, ju.max( 0, 1));
    }
    @Test
	public void testMax2() {
        max ju = new max();
        assertEquals( 10, ju.max( 10, 6));
    }
    @Test
	public void testMax3() {
        max ju = new max();
        assertEquals( -1, ju.max( -1, -2));
    }
    @Test
	public void testMax4() {
        max ju = new max();
        assertEquals( 0, ju.max( 0, -0));
    }
    @Test
	public void testMax5() {
        max ju = new max();
        assertEquals( -7, ju.max( -7, -9));
    }
}
