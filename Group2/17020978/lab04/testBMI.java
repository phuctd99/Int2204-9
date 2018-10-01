import org.junit.Test;

import static org.junit.Assert.*;

public class testBMI {
    @Test
    public void testBMI1()
    {
        assertEquals("Bình thường",LN.BMI(1.62,50));
    }
    @Test
    public void testBMI2()
    {
        assertEquals("Bình thường",LN.BMI(1.6,50));
    }
    @Test
    public void testBMI3()
    {
        assertEquals("Thiếu cân",LN.BMI(1.73,55));
    }
    @Test
    public void testBMI4()
    {
        assertEquals("Thừa cân",LN.BMI(1.8,75));
    }
    @Test
    public void testBMI5()
    {
        assertEquals("Béo phì",LN.BMI(1.6,70));
    }
}