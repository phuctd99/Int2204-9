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
     * Test of maxoftwo method, of class Lab04.
     */
    @Test
    public void testMaxoftwo() {
        System.out.println("maxoftwo");
        int a = 3;
        int b = 3;
        int expResult = 3;
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
        int[] a = {1,1,3,4};
        int n = 4;
        int expResult = 1;
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
        double w = 60;
        double h = 1.6;
        String result= Lab04.BMI(w, h);
        String exp = "Thua can";
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
