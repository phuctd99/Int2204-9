/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CACLV
 */
public class Week4Test {

    public Week4Test() {
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
     * Test of maxIntdouble method, of class Week4.
     */
    @Test
    public void testMaxIntdouble1() {
        System.out.println("maxIntdouble");
        int a = 1;
        int b = 3;
        int expResult = 3;
        int result = Week4.maxIntdouble(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of maxIntdouble method, of class Week4.
     */
    @Test
    public void testMaxIntdouble2() {
        System.out.println("maxIntdouble");
        int a = 4;
        int b = 4;
        int expResult = 4;
        int result = Week4.maxIntdouble(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of maxIntdouble method, of class Week4.
     */
    @Test
    public void testMaxIntdouble3() {
        System.out.println("maxIntdouble");
        int a = 44;
        int b = 43;
        int expResult = 44;
        int result = Week4.maxIntdouble(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of maxIntdouble method, of class Week4.
     */
    @Test
    public void testMaxIntdouble4() {
        System.out.println("maxIntdouble");
        int a = 1;
        int b = 45;
        int expResult = 45;
        int result = Week4.maxIntdouble(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of maxIntdouble method, of class Week4.
     */
    @Test
    public void testMaxIntdouble5() {
        System.out.println("maxIntdouble");
        int a = 200;
        int b = 300;
        int expResult = 300;
        int result = Week4.maxIntdouble(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of minInts method, of class Week4.
     */
    @Test
    public void testMinInts1() {
        System.out.println("minInts");
        int[] ar = {100, 200, 500, 7};
        int expResult = 7;
        int result = Week4.minInts(ar);
        assertEquals(expResult, result);
    }

    /**
     * Test of minInts method, of class Week4.
     */
    @Test
    public void testMinInt2() {
        System.out.println("minInts");
        int[] ar = {15, 5, 5, 7};
        int expResult = 5;
        int result = Week4.minInts(ar);
        assertEquals(expResult, result);
    }

    /**
     * Test of minInts method, of class Week4.
     */
    @Test
    public void testMinInts3() {
        System.out.println("minInts");
        int[] ar = {6, 3, 5, 7};
        int expResult = 3;
        int result = Week4.minInts(ar);
        assertEquals(expResult, result);
    }

    /**
     * Test of minInts method, of class Week4.
     */
    @Test
    public void testMinInts4() {
        System.out.println("minInts");
        int[] ar = {2, 3, 5, 7, 1, 200, 500, 0};
        int expResult = 0;
        int result = Week4.minInts(ar);
        assertEquals(expResult, result);
    }

    /**
     * Test of minInts method, of class Week4.
     */
    @Test
    public void testMinInts5() {
        System.out.println("minInts");
        int[] ar = {3, 5, 8, 12, 2, 3, 5, 7};
        int expResult = 2;
        int result = Week4.minInts(ar);
        assertEquals(expResult, result);
    }

    /**
     * Test of BMI method, of class Week4.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double height = 1.65;
        double weight = 45;
        String expResult = "Thiếu cân";
        String result = Week4.BMI(height, weight);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of BMI method, of class Week4.
     */
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double height = 1.65;
        double weight = 48;
        String expResult = "Thiếu cân";
        String result = Week4.BMI(height, weight);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of BMI method, of class Week4.
     */
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double height = 1.65;
        double weight = 52;
        String expResult = "Bình thường";
        String result = Week4.BMI(height, weight);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of BMI method, of class Week4.
     */
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double height = 1.65;
        double weight = 68;
        String expResult = "Thừa cân";
        String result = Week4.BMI(height, weight);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of BMI method, of class Week4.
     */
    @Test
    public void testBMI5() {
        System.out.println("BMI");
        double height = 1.6;
        double weight = 47.367;
        String expResult = "Bình thường";
        String result = Week4.BMI(height, weight);
        assertEquals(expResult, result);
    }
}
