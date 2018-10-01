package Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class BMITest {

    @Test
    public void BIMresult1() {
        String bmiResult1 = "Binh thuong";
        String bmiJunit1 = BMI.BIMresult((double) 43,  1.52);
        assertEquals(bmiResult1, bmiJunit1);
    }

    @Test
    public void BIMresult2() {
        String bmiResult2 = "Thieu can";
        String bmiJunit2 = BMI.BIMresult((double) 38, 1.57);
        assertEquals(bmiResult2, bmiJunit2);
    }

    @Test
    public void BIMresult3() {
        String bmiResult3 = "Thieu can";
        String bmiJunit3 = BMI.BIMresult((double) 30, 1.52);
        assertEquals(bmiResult3, bmiJunit3);
    }

    @Test
    public void BIMresult4() {
        String bmiResult4 = "Beo phi";
        String bmiJunit4 = BMI.BIMresult((double) 100, 1.67);
        assertEquals(bmiResult4, bmiJunit4);
    }

    @Test
    public void BIMresult() {
        String bmiResult5 = "Thua can";
        String bmiJunit5 = BMI.BIMresult((double)96, (double)2);
        assertEquals(bmiResult5, bmiJunit5);
    }
}