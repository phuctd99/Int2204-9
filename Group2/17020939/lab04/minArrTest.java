package Tuan4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class minArrTest {

    //Test hàm minOfArr
    @Test
    public void testMinOfArr1() {
        minArr ju = new minArr();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(1, ju.minArr(arr));
    }
    @Test
	public void testMinOfArr2() {
        minArr ju = new minArr();
        int[] arr = {-2, -7, 3, -9, 8};
		assertEquals( -9, ju.minArr( arr));
    }
    @Test
	public void testMinOfArr3() {
        minArr ju = new minArr();
        int[] arr = {0, 0, 0, 0};
        assertEquals( 0, ju.minArr( arr));
    }
    @Test
	public void testMinOfArr4() {
        minArr ju = new minArr();
        int[] arr = {20, 2, 10, -5, 16};
        assertEquals( -5, ju.minArr( arr));
    }
    @Test
	public void testMinOfArr5() {
        minArr ju = new minArr();
        int[] arr = {-1, -5, -7, -9, -0};
        assertEquals( -9, ju.minArr( arr));

    }

}
