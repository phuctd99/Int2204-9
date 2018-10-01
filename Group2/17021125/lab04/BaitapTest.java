import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by CCNE on 01/10/2018.
 */
public class BaitapTest extends Baitap {
    @Test
    public void testTimMax1(){
        int x = timMax(4,5);
        assertEquals(5,x);
    }
    @Test
    public void testTimMax2(){
        int x = timMax(0,-4);
        assertEquals(0,x);
    }
    @Test
    public void testTimMax3(){
        int x = timMax(-2,5);
        assertEquals(5,x);
    }
    @Test
    public void testTimMax4(){
        int x = timMax(-2,-5);
        assertEquals(-2,x);
    }
    @Test
    public void testTimMax5(){
        int x = timMax(0,4);
        assertEquals(4,x);
    }


    @Test
    public void testMinArray1(){
        int []arr1 = {1, 2, 3, 4, 5};
        int min = minArray(arr1, arr1.length);
        assertEquals(1, min);
    }
    @Test
    public void testMinArray2(){
        int []arr2 = {-1, -2, -3, -4, -5};
        int min = minArray(arr2, arr2.length);
        assertEquals(-5, min);
    }
    @Test
    public void testMinArra3y(){
        int []arr3 = {-2, 0 ,2 ,4};
        int min = minArray(arr3,arr3.length);
        assertEquals(-2, min);
    }
    @Test
    public void testMinArray4(){
        int []arr4 = {-9, 9, 4, 3};
        int min = minArray(arr4, arr4.length);
        assertEquals(-9, min);
    }
    @Test
    public void testMinArray5(){
        int []arr5 = {4, 5, -10, -20, 0};
        int min = minArray(arr5,arr5.length);
        assertEquals(-20, min);
    }


    @Test
    public void testBMI1(){
        String kq = BMI(55, 1.67);
        assertEquals("Binh thuong", kq);
    }

    @Test
    public void testBMI2(){
        String kq = BMI(45, 1.9);
        assertEquals("Thieu can", kq);
    }

    @Test
    public void testBMI3(){
        String kq = BMI(100, 1.5);
        assertEquals("Beo phi", kq);
    }
    @Test
    public void testBMI4(){
        String kq = BMI(55,1.5);
        assertEquals("Thua can", kq);
    }
    @Test
    public void testBMI5(){
        String kq = BMI(60, 1.67);
        assertEquals("Binh thuong", kq);
    }
}