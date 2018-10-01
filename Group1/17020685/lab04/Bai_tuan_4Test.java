/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tuan_4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
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

    /**
     * Test of SLN method, of class Bai_tuan_4.
     */
    @Test
    public void testSLN1() {
        System.out.println("SLN");
        int a = 9;
        int b = 5;
        int expResult = 9;
        int result = Bai_tuan_4.SLN(a, b);
        assertEquals(expResult, result);
     }
    @Test
    public void testSLN2() {
        System.out.println("SLN");
        int a = 4;
        int b = 5;
        int expResult = 5;
        int result = Bai_tuan_4.SLN(a, b);
        assertEquals(expResult, result);
     }
    @Test
    public void testSLN3() {
        System.out.println("SLN");
        int a = 9;
        int b = 6;
        int expResult = 9;
        int result = Bai_tuan_4.SLN(a, b);
        assertEquals(expResult, result);
     }
    @Test
    public void testSLN4() {
        System.out.println("SLN");
        int a = 90;
        int b = 58;
        int expResult = 90;
        int result = Bai_tuan_4.SLN(a, b);
        assertEquals(expResult, result);
     }
    @Test
    public void testSLN5() {
        System.out.println("SLN");
        int a = 19;
        int b = 50;
        int expResult = 50;
        int result = Bai_tuan_4.SLN(a, b);
        assertEquals(expResult, result);
     }



    
    /**
     * Test of GTNN method, of class Bai_tuan_4.
     */
    @Test
    public void testGTNN1() {
        System.out.println("GTNN");
        int[] arr = {1, 5, 6, 8, 9};
        int expResult = 1;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testGTNN2() {
        System.out.println("GTNN");
        int[] arr = {10, 53, 65, 8, 59};
        int expResult = 8;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testGTNN3() {
        System.out.println("GTNN");
        int[] arr = {31, 25, 16, 58, 79};
        int expResult = 16;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testGTNN4() {
        System.out.println("GTNN");
        int[] arr = {21, 55, 66, 88, 99};
        int expResult = 21;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testGTNN5() {
        System.out.println("GTNN");
        int[] arr = {11, 85, 16, 38, 9};
        int expResult = 9;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
    }

    /**
     * Test of BMI method, of class Bai_tuan_4.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double ccao = 1.7;
        double cnang = 53.0;
        String expResult = "Thieu can";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double ccao = 1.7;
        double cnang = 53.0;
        String expResult = "Thieu can";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double ccao = 1.7;
        double cnang = 53.5;
        String expResult = "Binh thuong";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double ccao = 1.7;
        double cnang = 70.5;
        String expResult = "Thua can";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI5() {
        System.out.println("BMI");
        double ccao = 1.7;
        double cnang = 83.0;
        String expResult = "Beo phi";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
    }
    
    
}
