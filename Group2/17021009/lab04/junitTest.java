package Tuan4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class junitTest {

    //Test hàm max
    @Test
    public void testMax1() {
        maxMin mm = new maxMin();
        assertEquals( 2, mm.max( 1, 2));

    }
    @Test
    public void testMax2() {
        maxMin mm = new maxMin();
        assertEquals( 3, mm.max( 1, 3));
    }
    @Test
    public void testMax3() {
        maxMin mm = new maxMin();
        assertEquals( 1, mm.max( 1, -2));
    }
    @Test
    public void testMax4() {
        maxMin mm = new maxMin();
        assertEquals( 0, mm.max( 0, 0));
    }
    @Test
    public void testMax5() {
        maxMin mm = new maxMin();
        assertEquals( -5, mm.max( -5, -9));
    }

    //Test hàm minOfArr
    @Test
    public void testMinOfArr1() {
        maxMin mm = new maxMin();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        assertEquals( 1, mm.minOfArr( arr1));

    }
    @Test
    public void testMinOfArr2() {
        maxMin mm = new maxMin();
        int[] arr2 = {-1, -9, 3};
        assertEquals( -9, mm.minOfArr( arr2));

    }
    @Test
    public void testMinOfArr3() {
        maxMin mm = new maxMin();
        int[] arr3 = {0, 0, 0, 0};
        assertEquals( 0, mm.minOfArr( arr3));
    }
    @Test
    public void testMinOfArr4() {
        maxMin mm = new maxMin();
        int[] arr4 = {-100, 2, 100, -5, 6};
        assertEquals( -100, mm.minOfArr( arr4));
    }
    @Test
    public void testMinOfArr5() {
        maxMin mm = new maxMin();
        int[] arr5 = {1, 5, 6};
        assertEquals( 1, mm.minOfArr( arr5));

    }

}
