import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class SoNguyenTest extends SoNguyen {
    @Test
    public void test1() {
        assertEquals(3, SoNguyen.max(2, 3));
    }
    @Test
    public void test2() {
        assertEquals(10, SoNguyen.max(10, -5));
    }
    @Test
    public void test3() {
        assertEquals(9, SoNguyen.max(-9, 9));
    }
    @Test
    public void test4() {
        assertEquals(1000, SoNguyen.max(1000, -256));
    }
    @Test
    public void test5(){
        assertEquals(1024,SoNguyen.max(256,1024));
    }
    @Test
    public void testmin1() {

        int arr[] = {1, 2, 3, 4, 5};
        assertEquals(1, SoNguyen.minArray(arr));
    }
    @Test
     public void testmin2() {
        int arr1[] = {-19, 2, 0, 99, 3, 8, 789, 2669};
        assertEquals(-19, SoNguyen.minArray(arr1));
    }
    @Test
    public void testmin3() {
        int arr2[] = {-99, 2, 0, 99, 3, 8};
        assertEquals(-99, SoNguyen.minArray(arr2));
    }
    @Test
    public void testmin4() {
        int arr4[] = {0,33,88,22,-8};
        assertEquals(-8, SoNguyen.minArray(arr4));
    }
    @Test
    public void testmin5() {
        int arr5[] = {0,1,3,4,5,9,-99,33,20};
        assertEquals(-99, SoNguyen.minArray(arr5));
    }

}