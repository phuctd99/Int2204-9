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
 * @author CCNE
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
        assertEquals(0, Lab04.max(0,0));
    }
    
    public void testMax2 () {
        System.out.println("max2");
        assertEquals(1, Lab04.max(-1,1));
    }
    public void testMax3() {
        System.out.println("max3");
        assertEquals(1, Lab04.max(-1,1));
    }
    
    public void testMax4() {
        System.out.println("max4");
        assertEquals(-10, Lab04.max(-10,-100));
    }
    public void testMax5() {
        System.out.println("max5");
        assertEquals(100, Lab04.max(99,100));
    }

    /**
     * Test of min method, of class Lab04.
     */
    @Test
    public void testMin1() {
        System.out.println("min1");
        int[] a = {0,1,2,3};
        int expResult = 0;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
    }
    public void testMin2() {
        System.out.println("min2");
        int[] a = {10,1,2,3};
        int expResult = 1;
        int result = Lab04.min(a);
        assertEquals(expResult, result);    
    }
    
    public void testMin3() {
        System.out.println("min3");
        int[] a = {10,-1,20,3};
        int expResult = -10;
        int result = Lab04.min(a);
        assertEquals(expResult, result);    
    }
    
    public void testMin4() {
        System.out.println("min4");
        int[] a = {10,1,2,3};
        int expResult = 1;
        int result = Lab04.min(a);
        assertEquals(expResult, result);    
    }
    
    public void testMin5() {
        System.out.println("min5");
        int[] a = {10,100,20,39};
        int expResult = 10;
        int result = Lab04.min(a);
        assertEquals(expResult, result);    
    }

    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI1");
        float h = 1.7F;
        float w = 48F;
        String expResult = "Thiếu cân";
        String result = Lab04.BMI(h, w);
        assertEquals(expResult, result);
    }
    public void testBMI2() {
        System.out.println("BMI2");
        float h = 1.8F;
        float w = 60F;
        String expResult = "Bình thường";
        String result = Lab04.BMI(h, w);
        assertEquals(expResult, result);
    }
    
    public void testBMI3() {
        System.out.println("BMI3");
        float h = 1.8F;
        float w = 100F;
        String expResult = "Béo phì";
        String result = Lab04.BMI(h, w);
        assertEquals(expResult, result);
    }
    
    public void testBMI4() {
        System.out.println("BMI4");
        float h = 1.75F;
        float w = 65F;
        String expResult = "Bình thường";
        String result = Lab04.BMI(h, w);
        assertEquals(expResult, result);
    }
    
    public void testBMI5() {
        System.out.println("BMI5");
        float h = 1.5F;
        float w = 55F;
        String expResult = "Thừa cân";
        String result = Lab04.BMI(h, w);
        assertEquals(expResult, result);
    }
    
}
