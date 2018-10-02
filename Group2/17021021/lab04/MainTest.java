import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void max1() {
        assertEquals(19, Main.max(19, - 15));
    }

    @Test
    void max2() {
        assertEquals(-15, Main.max(-91, - 15));
    }

    @Test
    void max3() {
        assertEquals(0, Main.max(0, -41));
    }

    @Test
    void max4() {
        assertEquals(14, Main.max(14, 14));
    }

    @Test
    void max5() {
        assertEquals(19, Main.max(19, 0));
    }

    @Test
    void minArray1() {
        int[] arr1 = {1, 4, 6, 8};
        assertEquals(1, Main.minArray(arr1));
    }

    @Test
    void minArray2() {
        int[] arr2 = {-5, -6, 0, 10};
        assertEquals(-6, Main.minArray(arr2));
    }

    @Test
    void minArray3() {
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, -6, -5, -4, -3, -2, -1};
        assertEquals(-6, Main.minArray(arr3));
    }

    @Test
    void minArray4() {
        int[] arr4 = {0, 0, 0, 0, 1, 2, 3};
        assertEquals(0, Main.minArray(arr4));
    }

    @Test
    void minArray5() {
        int[] arr5 = {0, -1, -2, -3, -4, -5, -6, -7, -8, 1, 2, 3, 4};
        assertEquals(-8, Main.minArray(arr5));
    }

    @Test
    void BMI1() {
        assertEquals("Thiếu cân", Main.BMI(50, 1.65));
    }

    @Test
    void BMI2() {
        assertEquals("Bình thường", Main.BMI(66.441, 1.7));
    }

    @Test
    void BMI3() {
        assertEquals("Thừa cân", Main.BMI(65, 1.68));
    }

    @Test
    void BMI4() {
        assertEquals("Béo phì", Main.BMI(80, 1.6));
    }

    @Test
    void BMI5() {
        assertEquals("Bình thường", Main.BMI(62., 1.65));
    }
}