/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hung
 */
public class Lab04Test {
    
    public Lab04Test() {
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
     * Test of max method, of class Lab04.
     */
    @Test
    public void testMax1() {
        System.out.println("max");
        int a = 1;
        int b = 2;
        int expResult = 2;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMax2() {
        System.out.println("max");
        int a = 5;
        int b = 5;
        int expResult = 5;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMax3() {
        System.out.println("max");
        int a = 60;
        int b = 8;
        int expResult = 60;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMax4() {
        System.out.println("max");
        int a = 79;
        int b = 78;
        int expResult = 78;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMax5() {
        System.out.println("max");
        int a = 1;
        int b = 0;
        int expResult = 1;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of min method, of class Lab04.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        int[] a = null;
        int expResult = 0;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testMin1() {
        System.out.println("min");
        int[] a = {2,4};
        int expResult = 2;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testMin2() {
        System.out.println("min");
        int[] a = {1};
        int expResult = 1;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testMin3() {
        System.out.println("min");
        int[] a = {3,5,2,6,1};
        int expResult = 1;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testMin4() {
        System.out.println("min");
        int[] a = {7,6,9,10};
        int expResult = 6;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testMin5() {
        System.out.println("min");
        int[] a = {7,6,9,10,2};
        int expResult = 2;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BMI method, of class Lab04.
     */
    public void testBMI() {
        System.out.println("BMI");
        double w = 72.25;
        double h = 1.7;
        String expResult = "Béo phì";
        String result = Lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    @Test
    //23
    public void testBMI1() {
        System.out.println("BM1I");
        double w = 66.47;
        double h = 1.7;
        String expResult = "Thừa cân";
        String result = Lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI2() {
        System.out.println("BMI2");
        double w = 65;
        double h = 1.7;
        String expResult = "Bình thường";
        String result = Lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI3() {
        System.out.println("BMI3");
        double w = 65;
        double h = 1.7;
        String expResult = "Bình thường";
        String result = Lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI4() {
        System.out.println("BMI4");
        double w = 65;
        double h = 1.7;
        String expResult = "Bình thường";
        String result = Lab04.BMI(w, h);
        assertEquals(expResult, result);
    }
}
