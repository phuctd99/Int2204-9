
package bai_tuan_4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Bai_tuan_4Test {
    
    public Bai_tuan_4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testSoMax() {
        System.out.println("SoMax");
        int a = 9;
        int b = 100;
        int expResult = 100;
        int result = Bai_tuan_4.SoMax(a, b);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testSoMax2() {
        System.out.println("SoMax");
        int a = 9;
        int b = -100;
        int expResult = 9;
        int result = Bai_tuan_4.SoMax(a, b);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testSoMax3() {
        System.out.println("SoMax");
        int a = 99;
        int b = 100;
        int expResult = 100;
        int result = Bai_tuan_4.SoMax(a, b);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testSoMax4() {
        System.out.println("SoMax");
        int a = 10;
        int b = 0;
        int expResult = 10;
        int result = Bai_tuan_4.SoMax(a, b);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testSoMax5() {
        System.out.println("SoMax");
        int a = 2;
        int b = 100;
        int expResult = 100;
        int result = Bai_tuan_4.SoMax(a, b);
        assertEquals(expResult, result);
       
    }

   
    @Test
    public void testGTNN() {
        System.out.println("GTNN");
        int[] arr = {1, 3, 0, 5, 9};
        int expResult = 0;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
        ;
    }
    @Test
    public void testGTNN2() {
        System.out.println("GTNN");
        int[] arr = {1, 99, 0, 5, 9};
        int expResult = 0;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
        ;
    }
    @Test
    public void testGTNN3() {
        System.out.println("GTNN");
        int[] arr = {1, 3, -99, 5, 9};
        int expResult = -99;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
        ;
    }
    @Test
    public void testGTNN4() {
        System.out.println("GTNN");
        int[] arr = {1, 9, 0, 5, 9};
        int expResult = 0;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
        ;
    }
    @Test
    public void testGTNN5() {
        System.out.println("GTNN");
        int[] arr = {1, 9, -5, 5, 9};
        int expResult = -5;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
        ;
    }
    

    
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double ccao = 2;
        double cnang = 100;
        String expResult = "Beo phi";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double ccao = 1.6;
        double cnang = 100;
        String expResult = "Beo phi";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double ccao = 1.8;
        double cnang = 60;
        String expResult = "Binh thuong";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double ccao = 1.6;
        double cnang = 63.98;
        String expResult = null;
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI5() {
        System.out.println("BMI");
        double ccao = 1.2;
        double cnang = 30;
        String expResult = "Binh thuong";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
        
    }
    
}
