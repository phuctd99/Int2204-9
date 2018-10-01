/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author haupc
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
     * Test of greater method, of class Week4.
     */
    @Test
    public void testGreater1() {
        System.out.println("greater");
        int a = 1;
        int b = 0;
        int expResult = 1;
        int result = Week4.greater(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGreater2() {
        System.out.println("greater");
        int a = 2;
        int b = 1;
        int expResult = 2;
        int result = Week4.greater(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     *
     */
    @Test
    public void testGreater3() {
        System.out.println("greater");
        int a = 3;
        int b = 1;
        int expResult = 3;
        int result = Week4.greater(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGreater4() {
        System.out.println("greater");
        int a = 4;
        int b = 0;
        int expResult = 4;
        int result = Week4.greater(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGreater5() {
        System.out.println("greater");
        int a = 5;
        int b = 0;
        int expResult = 5;
        int result = Week4.greater(a, b);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of min method, of class Week4.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        int[] a = {1,5,7,8,9,3,2,1,3,4,25};
        int expResult = 1;
        int result = Week4.min(a);
        assertEquals(expResult, result);
    }
        @Test
    public void testMin1() {
        System.out.println("min");
        int[] a = {2,5,7,8,9,3,2,1,3,4,25};
        int expResult = 1;
        int result = Week4.min(a);
        assertEquals(expResult, result);
    }
        @Test
    public void testMin2() {
        System.out.println("min");
        int[] a = {3,5,7,8,9,3,2,1,3,4,25};
        int expResult = 1;
        int result = Week4.min(a);
        assertEquals(expResult, result);
    }
        @Test
    public void testMin3() {
        System.out.println("min");
        int[] a = {4,5,7,8,9,3,2,1,3,4,25};
        int expResult = 1;
        int result = Week4.min(a);
        assertEquals(expResult, result);
    }
        @Test
    public void testMin4() {
        System.out.println("min");
        int[] a = {5,5,7,8,9,3,2,1,3,4,25};
        int expResult = 1;
        int result = Week4.min(a);
        assertEquals(expResult, result);
    }
        @Test
    public void testMin5() {
        System.out.println("min");
        int[] a = {6,5,7,8,9,3,2,1,3,4,25};
        int expResult = 1;
        int result = Week4.min(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of BMI method, of class Week4.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double weigh = 18.4;
        double heigh = 1.0;
        String expResult = "Thieu can";
        String result = Week4.BMI(weigh, heigh);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double weigh = 18.4;
        double heigh = 1.0;
        String expResult = "Thieu can";
        String result = Week4.BMI(weigh, heigh);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double weigh = 18.5;
        double heigh = 1.0;
        String expResult = "Binh thuong";
        String result = Week4.BMI(weigh, heigh);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double weigh = 23;
        double heigh = 1.0;
        String expResult = "Thua can";
        String result = Week4.BMI(weigh, heigh);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double weigh = 26;
        double heigh = 1.0;
        String expResult = "Beo phi";
        String result = Week4.BMI(weigh, heigh);
        assertEquals(expResult, result);
    }
}
