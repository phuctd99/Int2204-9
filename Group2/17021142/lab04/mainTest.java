import org.junit.Test;

import static org.junit.Assert.*;

public class mainTest {
    @Test
    public void test_gtln1()
    {
        main test = new main();
        int a = test.gtln(7,2);
        assertEquals(7,a);
    }
    @Test
    public void test_gtln2()
    {
        main test = new main();
        int a = test.gtln(9,3);
        assertEquals(9,a);
    }
    @Test
    public void test_gtln3()
    {
        main test = new main();
        int a = test.gtln(11,21);
        assertEquals(21,a);
    }
    @Test
    public void test_gtln4()
    {
        main test = new main();
        int a = test.gtln(17,32);
        assertEquals(32,a);
    }
    @Test
    public void test_gtln5()
    {
        main test = new main();
        int a = test.gtln(9,19);
        assertEquals(19,a);
    }
    @Test
    public void test_gtnn1()
    {
        main test = new main();
        int[] n = {7,2};
        int a = test.gtnn(n);
        assertEquals(2, a);
    }
    @Test
    public void test_gtnn2()
    {
        main test = new main();
        int[] n = {73,42};
        int a = test.gtnn(n);
        assertEquals(42, a);
    }
    @Test
    public void test_gtnn3()
    {
        main test = new main();
        int[] n = {37,12};
        int a = test.gtnn(n);
        assertEquals(12, a);
    }
    @Test
    public void test_gtnn4()
    {
        main test = new main();
        int[] n = {19,1,1999};
        int a = test.gtnn(n);
        assertEquals(1, a);
    }
    @Test
    public void test_gtnn5()
    {
        main test = new main();
        int[] n = {5,4,1999};
        int a = test.gtnn(n);
        assertEquals(4, a);
    }
    @Test
    public void testBMI1()
    {
        main test = new main();
        double a = test.BMI(57,1.75);
        assertEquals(18.613, a,0);
    }
    @Test
    public void testBMI2()
    {
        main test = new main();
        double a = test.BMI(55,1.55);
        assertEquals(22.893, a,0);
    }
    @Test
    public void testBMI3()
    {
        main test = new main();
        double a = test.BMI(50,1.65);
        assertEquals(18.366, a,0);
    }
    @Test
    public void testBMI4()
    {
        main test = new main();
        double a = test.BMI(50,1.72);
        assertEquals(16.902, a,0);
    }
    @Test
    public void testBMI5()
    {
        main test = new main();
        double a = test.BMI(70,1.75);
        assertEquals(22.858, a,0);
    }
}