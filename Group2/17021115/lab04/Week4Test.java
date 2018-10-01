/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopweek4;

import OopWeek4.Week4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
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
     * Test of timMax method, of class Week4.
     */
    @Test
    public void testTimMax() {
        System.out.println("timMax");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Week4.timMax(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of timMinCuaMang method, of class Week4.
     */
    @Test
    public void testTimMinCuaMang() {
        System.out.println("timMinCuaMang");
        int[] mangSoNguyen = null;
        int expResult = 0;
        int result = Week4.timMinCuaMang(mangSoNguyen);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tinhChiSoBMI method, of class Week4.
     */
    @Test
    public void testTinhChiSoBMI() {
        System.out.println("tinhChiSoBMI");
        double canNang = 0.0;
        double chieuCao = 0.0;
        String expResult = "";
        String result = Week4.tinhChiSoBMI(canNang, chieuCao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
