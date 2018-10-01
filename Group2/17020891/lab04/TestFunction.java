package com.company;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.Arrays;

public class TestFunction extends TestCase {
    @Test
    public void testMax1() {
        assertEquals(Function.max(2, 3), 3);
    }
    @Test
    public void testMax2() {
        assertEquals(Function.max(6, 5), 6);
    }
    @Test
    public void testMax3() {
        assertEquals(Function.max(2, 2), 2);
    }
    @Test
    public void testMax4() {
        assertEquals(Function.max(4, 2), 4);
    }
    @Test
    public void testMax5() {
        assertEquals(Function.max(15, -4), 15);
    }
    @Test
    public void testMinOfArray1() {
        int[] a = {1, 3, 4, 6, 2, 9, 11, 12};
        assertEquals(Function.minOfArray(a), 1);
        assertEquals(Function.minOfArray(Arrays.copyOfRange(a,0, 5)), 1);
    }
    @Test
    public void testMinOfArray2() {
        int[] a = {1, 3, 4, 6, 2, 9, 11, 12};
        assertEquals(Function.minOfArray(a), 1);
    }
    @Test
    public void testMinOfArray3() {
        int[] a = {1, 3, 4, 6, 2, 9, 11, 12};
        assertEquals(Function.minOfArray(Arrays.copyOfRange(a,5, 7)), 9);
    }
    @Test
    public void testMinOfArray4() {
        int[] a = {1, 3, 4, 6, 2, 9, 11, 12};
        assertEquals(Function.minOfArray(Arrays.copyOfRange(a,3, 7)), 2);
    }
    @Test
    public void testMinOfArray5() {
        int[] a = {1, 3, 4, 6, 2, 9, 11, 12};
        assertEquals(Function.minOfArray(Arrays.copyOfRange(a,0, 5)), 1);
    }
    @Test
    public void testBMI1() {
        assertEquals(Function.BMI(80, 1.6), "Béo phì");
    }
    @Test
    public void testBMI2() {
        assertEquals(Function.BMI(80, 1.6), "Béo phì");
    }
    @Test
    public void testBMI3() {

        assertEquals(Function.BMI(60, 1.6), "Thừa cân");
    }
    @Test
    public void testBMI4() {
        assertEquals(Function.BMI(50, 1.75), "Thiếu cân");
    }
    @Test
    public void testBMI5() {
        assertEquals(Function.BMI(90, 1.7), "Béo phì");
    }
    @Test
    public void testBMI() {
        assertEquals(Function.BMI(60, 1.7), "Bình thường");
    }

}
