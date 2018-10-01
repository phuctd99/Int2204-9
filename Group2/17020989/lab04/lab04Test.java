import static org.junit.Assert.*;
import org.junit.Test;

public class lab04Test extends lab04{
    @Test
    public void test_Max1() {
        int x = max(3, 9);
        assertEquals(9, x);
    }
    @Test
    public void test_Max2() {
        int x = max(-7, 4);
        assertEquals(4, x);
    }
    @Test
    public void test_Max3() {
        int x = max(-15, -2);
        assertEquals(-2, x);
    }
    @Test
    public void test_Max4() {
        int x = max(-9, 0);
        assertEquals(0, x);
    }
    @Test
    public void test_Max5(){
        int x=max(0,11);
        assertEquals(11,x);
    }
    @Test
    public void test_MinOfArr1() {
        int arr1[] = {1, 2, 3, 4, 5,6};
        int min = minOfArr(arr1, 6);
        assertEquals(1, min);
    }
    @Test
    public void test_MinOfArr2() {
        int arr2[] = {-5, -4, -3, -6, -1};
        int min = minOfArr(arr2, 5);
        assertEquals(-6, min);
    }
    @Test
    public void test_MinOfArr3() {
        int arr3[] = {7, 8, 0, 5, 3};
        int min = minOfArr(arr3, 5);
        assertEquals(0, min);
    }
    @Test
    public void test_MinOfArr4() {
        int arr4[] = {-10, -20, 0, 2, 4};
        int min = minOfArr(arr4, 5);
        assertEquals(-20, min);
    }
    @Test
    public void test_MinOfArr5(){
        int arr5[] = {-9,4,10,0,-110};
        int min = minOfArr(arr5,5);
        assertEquals(-110, min);
    }

    @Test
    public void test_BMI1() {
        String kq = bmi(1.65, 40);
        assertEquals( "Thiếu cân", kq);
    }
    @Test
    public void test_BMI2() {
        String kq = bmi(1.70, 60);
        assertEquals("Bình thường", kq);
    }
    @Test
    public void test_BMI3() {
        String kq = bmi(1.85, 69);
        assertEquals("Bình thường", kq);
    }
    @Test
    public void test_BMI4() {
        String kq = bmi(1.85, 80);
        assertEquals("Thừa cân", kq);
    }
    @Test
    public void test_BMI5(){
        String kq = bmi(1.63, 88);
        assertEquals("Béo phì", kq);
    }
}