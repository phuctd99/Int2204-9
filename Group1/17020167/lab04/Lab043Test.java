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
public class Lab043Test {
    
    public Lab043Test() {
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
        int a = 0;
        int b = 2;
        int expResult = 2;
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
        int[] a = {2,2,4};
        int n = 3;
        int expResult = 2;
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
        double w = 58.89;
        double h = 1.6;
        Lab04.BMI(w, h);
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
