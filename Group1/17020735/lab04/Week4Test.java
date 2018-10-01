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
 * @author Admin
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
     * Test of findMax method, of class Week4.
     */
    @Test
    public void testFindMax1() {
        System.out.println("findMax");
        int a = 3;
        int b = 4;
        int expResult = 4;
        int result = Week4.findMax(a, b);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindMax2() {
        System.out.println("findMax");
        int a = 54;
        int b = 435;
        int expResult = 435;
        int result = Week4.findMax(a, b);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindMax3() {
        System.out.println("findMax");
        int a = -978;
        int b = 0;
        int expResult = 0;
        int result = Week4.findMax(a, b);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindMax4() {
        System.out.println("findMax");
        int a = 0;
        int b = 100;
        int expResult = 100;
        int result = Week4.findMax(a, b);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindMax5() {
        System.out.println("findMax");
        int a = 985;
        int b = 654;
        int expResult = 985;
        int result = Week4.findMax(a, b);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findMin method, of class Week4.
     */
    @Test
    public void testFindMin1() {
        System.out.println("findMin");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int expResult = 1;
        int result = Week4.findMin(arr);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindMin2() {
        System.out.println("findMin");
        int[] arr = {454, 0, -484, 85, -1};
        int expResult = -484;
        int result = Week4.findMin(arr);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindMin3() {
        System.out.println("findMin");
        int[] arr = {845, 1000, 44, 154, 45};
        int expResult = 44;
        int result = Week4.findMin(arr);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindMin4() {
        System.out.println("findMin");
        int[] arr = {454, 78, 1321, 787, 34};
        int expResult = 34;
        int result = Week4.findMin(arr);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFindMin5() {
        System.out.println("findMin");
        int[] arr = {-110, 878, -9878, 45, 0, 78};
        int expResult = -9878;
        int result = Week4.findMin(arr);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bmiIndex method, of class Week4.
     */
    @Test
    
    public void testBmiIndex1() {
        System.out.println("bmiIndex");
        float weight = 38F;
        float height = 1.48F;
        String result = Week4.bmiIndex(weight, height);
        System.out.println(result);
        assertEquals("Thiếu cân", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBmiIndex2() {
        System.out.println("bmiIndex");
        float weight = 50F;
        float height = 1.73F;
        String result = Week4.bmiIndex(weight, height);
        System.out.println(result);
        assertEquals("Thiếu cân", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBmiIndex3() {
        System.out.println("bmiIndex");
        float weight = 60.1F;
        float height = 1.60F;
        String result = Week4.bmiIndex(weight, height);
        System.out.println(result);
        assertEquals("Thừa cân", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBmiIndex4() {
        System.out.println("bmiIndex");
        float weight = 80F;
        float height = 1.80F;
        String result = Week4.bmiIndex(weight, height);
        System.out.println(result);
        assertEquals("Thừa cân", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBmiIndex5() {
        System.out.println("bmiIndex");
        float weight = 100F;
        float height = 1.50F;
        String result = Week4.bmiIndex(weight, height);
        System.out.println(result);
        assertEquals("Béo phì", result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
