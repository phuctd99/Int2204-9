import static org.junit.Assert.*;
import org.junit.Test;

public class lab04Test extends lab04{
    @Test
    public void testMax1() {
        int x = max(6, 9);
        assertEquals(9, x);
    }
    @Test
    public void testMax2() {
        int x = max(-5, 4);
        assertEquals(4, x);
    }
    @Test
    public void testMax3() {
        int x = max(-3, -2);
        assertEquals(-2, x);
    }
    @Test
    public void testMax4() {
        int x = max(-9, 0);
        assertEquals(0, x);
    }
    @Test
    public void testMax5(){
        int x=max(0,9);
        assertEquals(9,x);
    }
    @Test
    public void testMinOfArr1() {
        int arr1[] = {1, 2, 3, 4, 5};
        int min = minOfArr(arr1, 5);
        assertEquals(1, min);
    }
    @Test
    public void testMinOfArr2() {
        int arr2[] = {-5, -4, -3, -44, -1};
        int min = minOfArr(arr2, 5);
        assertEquals(-44, min);
    }
    @Test
    public void testMinOfArr3() {
        int arr3[] = {6, 2, 0, 5, 3};
        int min = minOfArr(arr3, 5);
        assertEquals(0, min);
    }
    @Test
    public void testMinOfArr4() {
        int arr4[] = {-1, -2, 0, 5, 7};
        int min = minOfArr(arr4, 5);
        assertEquals(-2, min);
    }
    @Test
    public void testMinOfArr5(){
        int arr5[] = {-9,4,1,0,-11};
        int min = minOfArr(arr5,5);
        assertEquals(-11, min);
    }

    @Test
    public void testBMI1() {
        String kq = bmi(1.65, 55);
        assertEquals( "Bình thường", kq);
    }
    @Test
    public void testBMI2() {
        String kq = bmi(1.69, 123);
        assertEquals("Béo phì", kq);
    }
    @Test
    public void testBMI3() {
        String kq = bmi(1.59, 69);
        assertEquals("Thừa cân", kq);
    }
    @Test
    public void testBMI4() {
        String kq = bmi(1.59, 30);
        assertEquals("Thiếu cân", kq);
    }
    @Test
    public void testBMI5(){
        String kq = bmi(1.63, 88);
        assertEquals("Béo phì", kq);
    }
}