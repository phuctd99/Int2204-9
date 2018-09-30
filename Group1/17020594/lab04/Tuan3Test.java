/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tommmm^^
 */
public class Tuan3Test {
    
    public Tuan3Test() {
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
     * Test of Max method, of class Tuan3.
     */
    @Test
    public void testMax() {
        System.out.println("Max");
        int a = 1;
        int b = 3;
        int expResult = 3;
        int result = Tuan3.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testMax2() {
        System.out.println("Max");
        int a = 1;
        int b = 4;
        int expResult = 4;
        int result = Tuan3.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testMax3() {
        System.out.println("Max");
        int a = 1;
        int b = 3;
        int expResult = 2;
        int result = Tuan3.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testMax4() {
        System.out.println("Max");
        int a = 1;
        int b = 3;
        int expResult = 2;
        int result = Tuan3.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testMax5() {
        System.out.println("Max");
        int a = 6;
        int b = 3;
        int expResult = 6;
        int result = Tuan3.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
    public void testMinArr() {
        System.out.println("MinArr");
        int[] arr = null;
        int expResult = 0;
        int result = Tuan3.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of BMI method, of class Tuan3.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double weight = 0.0;
        double height = 0.0;
        Tuan3.BMI(weight, height);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
