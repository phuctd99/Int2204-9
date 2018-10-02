import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test {

    @Test
    public void maxi() {
        lab04 test = new lab04();
        assertEquals(3, test.maxi(2, 3));
    }

    @Test
    public void mini() {
        lab04 test = new lab04();
        int[] arr = {1, 2, 3, 4};
        assertEquals(1, test.mini(arr));
    }

    @Test
    public void resultBMI() {
        lab04 test = new lab04();
        assertEquals("Thừa cân", test.resultBMI(69, 1.67));
    }

    @Test
    public void maxi1() {
        lab04 test = new lab04();
        assertEquals(17, test.maxi(-2, 17));
    }

    @Test
    public void mini1() {
        lab04 test = new lab04();
        int[] arr = {1, 2, 2, 2, 2, 2, -2, 3, 4};
        assertEquals(-2, test.mini(arr));
    }

    @Test
    public void resultBMI1() {
        lab04 test = new lab04();
        assertEquals("Bình thường", test.resultBMI(65, 1.7));
    }

    @Test
    public void maxi2() {
        lab04 test = new lab04();
        assertEquals(9, test.maxi(2, 9));
    }

    @Test
    public void mini2() {
        lab04 test = new lab04();
        int[] arr = {-1111, -2902, 3, 4, 5, 6, 7, 8, 9, 13, 12, 13, 15, 16};
        assertEquals(-2902, test.mini(arr));
    }

    @Test
    public void resultBMI2() {
        lab04 test = new lab04();
        assertEquals("Bình thường", test.resultBMI(51, 1.65));
    }

    @Test
    public void maxi3() {
        lab04 test = new lab04();
        assertEquals(10000000, test.maxi(10000000, 3));
    }

    @Test
    public void mini3() {
        lab04 test = new lab04();
        int[] arr = {101, -212, 3, 4, 6, 9, 0};
        assertEquals(-212, test.mini(arr));
    }

    @Test
    public void resultBMI3() {
        lab04 test = new lab04();
        assertEquals("Thiếu cân", test.resultBMI(43, 1.67));
    }

    @Test
    public void maxi4() {
        lab04 test = new lab04();
        assertEquals(1999, test.maxi(-1999, 1999));
    }

    @Test
    public void mini4() {
        lab04 test = new lab04();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, -9};
        assertEquals(-9, test.mini(arr));
    }

    @Test
    public void resultBMI4() {
        lab04 test = new lab04();
        assertEquals("Thiếu cân", test.resultBMI(48, 1.65));

    }
}