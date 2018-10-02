package Tuan4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BMITest {


    @Test
    public void TestBMI1() {
        bmi b = new bmi();
        assertEquals( "Bình thường", b.BMI( 55, 1.7));

    }
    @Test
    public void TestBMI2() {
        bmi b = new bmi();
        assertEquals( "Thiếu cân", b.BMI( 49, 1.7));

    }
    @Test
    public void TestBMI3() {
        bmi b = new bmi();
        assertEquals( "Bình thường", b.BMI( 65, 1.7));

    }
    @Test
    public void TestBMI4() {
        bmi b = new bmi();
        assertEquals( "Thừa cân", b.BMI( 64, 1.6));

    }
    @Test
    public void TestBMI5() {
        bmi b = new bmi();
        assertEquals( "Béo phì", b.BMI( 65, 1.5));
    }

}
