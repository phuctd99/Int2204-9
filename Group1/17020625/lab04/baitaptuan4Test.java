/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class Baituan4Test {
    
    public Baituan4Test() {
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
     * Test of main method, of class Baituan4.
     */


    /**
     * Test of SLN method, of class Baituan4.
     */
    @Test
    public void testSLN1() {
        System.out.println("SLN");
        int a = 8;
        int b = 7;
        int expResult = 8;
        int result = Baituan4.SLN(a, b);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of GTNN method, of class Baituan4.
     */
    @Test
    public void testGTNN1() {
        System.out.println("GTNN");
        int[] arr = {1,2,3,4,5};
        int expResult = 1;
        int result = Baituan4.GTNN(arr);
        assertEquals(expResult, result);

    }

    /**
     * Test of BMI method, of class Baituan4.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double cao = 1.5;
        double cnang = 49.0;
        String expResult = "thieu can";
        String result = Baituan4.BMI(cao, cnang);
        assertEquals(expResult, result);

    }
     @Test
    public void testSLN2() {
        System.out.println("SLN");
        int a = 3;
        int b = 7;
        int expResult = 3;
        int result = Baituan4.SLN(a, b);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of GTNN method, of class Baituan4.
     */
    @Test
    public void testGTNN2() {
        System.out.println("GTNN");
        int[] arr = {4, 56, 3, 2,1};
        int expResult = 1;
        int result = Baituan4.GTNN(arr);
        assertEquals(expResult, result);

    }

    /**
     * Test of BMI method, of class Baituan4.
     */
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double cao = 1.8;
        double cnang = 69.0;
        String expResult = "thua can";
        String result = Baituan4.BMI(cao, cnang);
        assertEquals(expResult, result);

    }
     @Test
    public void testSLN3() {
        System.out.println("SLN");
        int a = 0;
        int b = 5;
        int expResult = 0;
        int result = Baituan4.SLN(a, b);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of GTNN method, of class Baituan4.
     */
    @Test
    public void testGTNN3() {
        System.out.println("GTNN");
        int[] arr = {1,2,3,4,5,0,8};
        int expResult = 0;
        int result = Baituan4.GTNN(arr);
        assertEquals(expResult, result);

    }

    /**
     * Test of BMI method, of class Baituan4.
     */
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double cao = 1.6;
        double cnang = 53.0;
        String expResult = "thieu can";
        String result = Baituan4.BMI(cao, cnang);
        assertEquals(expResult, result);

    }
     @Test
    public void testSLN4() {
        System.out.println("SLN");
        int a = 9;
        int b = 1;
        int expResult = 1;
        int result = Baituan4.SLN(a, b);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of GTNN method, of class Baituan4.
     */
    @Test
    public void testGTNN4() {
        System.out.println("GTNN");
        int[] arr = {1,2,3,4,8};
        int expResult = 1;
        int result = Baituan4.GTNN(arr);
        assertEquals(expResult, result);

    }

    /**
     * Test of BMI method, of class Baituan4.
     */
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double cao = 1.9;
        double cnang = 67.0;
        String expResult = "thua can";
        String result = Baituan4.BMI(cao, cnang);
        assertEquals(expResult, result);

    }
     @Test
    public void testSLN5() {
        System.out.println("SLN");
        int a = 81;
        int b = 78;
        int expResult = 81;
        int result = Baituan4.SLN(a, b);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of GTNN method, of class Baituan4.
     */
    @Test
    public void testGTNN5() {
        System.out.println("GTNN");
        int[] arr = {1,2,3,4,5,23,67};
        int expResult = 1;
        int result = Baituan4.GTNN(arr);
        assertEquals(expResult, result);

    }

    /**
     * Test of BMI method, of class Baituan4.
     */
    @Test
    public void testBMI5() {
        System.out.println("BMI");
        double cao = 1.3;
        double cnang = 32.0;
        String expResult = "beo phi";
        String result = Baituan4.BMI(cao, cnang);
        assertEquals(expResult, result);

    }
}