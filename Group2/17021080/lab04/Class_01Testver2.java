package Bai_tap_tuan_04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Class_01Testver2 {

    @Test // lan 1
    public void maxValue() {
        assertEquals(5, Class_01.maxValue(4,5));
    }
    @Test // lan 2
    public void maxValue2() {
        assertEquals(26, Class_01.maxValue(26,5));

    }
    @Test // lan 3
    public void maxValue3() {
        assertEquals(62, Class_01.maxValue(4,62));
    }

    @Test // lan 4
    public void maxValue4() {
        assertEquals(6, Class_01.maxValue(-9,6));

    }

    @Test // lan 5
    public void maxValue5() {
        assertEquals(1999, Class_01.maxValue(1999,1997));

    }

    @Test // lan 1
    public void minValueOfArray() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        assertEquals(1, Class_01.minValueOfArray(arr));
    }

    @Test // lan 2
    public void minValueOfArray2() {
        int[] arr = {9,8,1,3,4,26,266,1997,1999};
        assertEquals(1, Class_01.minValueOfArray(arr));
    }

    @Test // lan 3
    public void minValueOfArray3() {
        int[] arr = {1999,2000,2018,1001,266890,1000, 2020};
        assertEquals(1000, Class_01.minValueOfArray(arr));
    }

    @Test // lan 4
    public void minValueOfArray4() {
        int[] arr = {-266890, 1010,1997,-1990,-1993};
        assertEquals(-266890, Class_01.minValueOfArray(arr));
    }
    @Test // lan 5
    public void minValueOfArray5() {
        int[] arr = {1, 8,03,1993};
        assertEquals(1, Class_01.minValueOfArray(arr));
    }
    @Test // lan 1
    public void bmi() {
        assertEquals("BEO PHI", Class_01.bmi(100,1.71));
    }

    @Test // lan 2
    public void bmi_02() {
        assertEquals("thieu can", Class_01.bmi(40,1.71));
    }

    @Test // lan 3
    public void bmi_03() {
        assertEquals("binh thuong", Class_01.bmi(60,1.71));
    }

    @Test // lan 4
    public void bmi_04() {
        assertEquals("thua can", Class_01.bmi(70,1.71));
    }

    @Test // lan 5
    public void bmi_05() {
        assertEquals("BEO PHI", Class_01.bmi(90,1.65));
    }
}