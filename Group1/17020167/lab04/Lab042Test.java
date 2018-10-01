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
 * @author Admin
 */
public class Lab042Test {
    
    public Lab042Test() {
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
     * Test of maxoftwo method, of class Lab04.
     */
    @Test
    public void testMaxoftwo() {
        System.out.println("maxoftwo");
        int a = 3;
        int b = 4;
        int expResult = 4;
        int result = Lab04.maxoftwo(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of minofarr method, of class Lab04.
     */
    @Test
    public void testMinofarr() {
        System.out.println("minofarr");
        int[] a = {0,1,2};
        int n = 3;
        int expResult = 0;
        int result = Lab04.minofarr(a, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double w = 47.36;
        double h = 1.6;
        Lab04.BMI(w, h);
        String result= Lab04.BMI(w, h);
        String exp = "Thieu can";
        assertEquals(exp, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Lab04.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Lab04.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
