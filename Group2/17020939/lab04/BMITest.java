package Tuan4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BMITest {


    @Test
    public void TestBMI1() {
        BMI b = new BMI();
        assertEquals("Bình thường", b.BMI(65, 1.65));
    }
    @Test
	public void TestBMI2() {
        BMI b = new BMI();
        assertEquals( "Béo phì", b.BMI(69, 1.5));
    }
    @Test
	public void TestBMI3() {
        BMI b = new BMI();
        assertEquals( "Thiếu cân", b.BMI(55, 1.75));
    }
    @Test
	public void TestBMI4() {
        BMI b = new BMI();
        assertEquals( "Bình thường", b.BMI(60, 1.7));
    }
    @Test
	public void TestBMI5() {
        BMI b = new BMI();
        assertEquals( "Bình thường", b.BMI(60, 1.6));
    }

}
