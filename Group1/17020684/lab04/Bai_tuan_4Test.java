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
    public void testSLN() {
        System.out.println("SLN");
        int a = 9;
        int b = 5;
        int expResult = 9;
        int result = Bai_tuan_4.SLN(a, b);
        assertEquals(expResult, result);
     }

    /**
     * Test of GTNN method, of class Bai_tuan_4.
     */
    @Test
    public void testGTNN() {
        System.out.println("GTNN");
        int[] arr = {1, 5, 6, 8, 9};
        int expResult = 1;
        int result = Bai_tuan_4.GTNN(arr);
        assertEquals(expResult, result);
    }

    /**
     * Test of BMI method, of class Bai_tuan_4.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double ccao = 1.7;
        double cnang = 53.0;
        String expResult = "Thieu can";
        String result = Bai_tuan_4.BMI(ccao, cnang);
        assertEquals(expResult, result);
    }
    
    
}
