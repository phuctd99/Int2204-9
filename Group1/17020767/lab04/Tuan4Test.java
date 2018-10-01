/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class Tuan4Test {
    
    public Tuan4Test() {
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
     * Test of Max method, of class Tuan4.
     */
    @Test
    public void testMax1() {
        System.out.println("Max");
        int a = 4;
        int b = 0;
        int expResult = 4;
        int result = Tuan4.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax2() {
        System.out.println("Max");
        int a = -193;
        int b = 75;
        Tuan4 instance = new Tuan4();
        int expResult = 75;
        int result = Tuan4.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax3() {
        System.out.println("Max");
        int a = 27;
        int b = 45;
        Tuan4 instance = new Tuan4();
        int expResult = 45;
        int result = Tuan4.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax4() {
        System.out.println("Max");
        int a = -20;
        int b = -40;
        Tuan4 instance = new Tuan4();
        int expResult = -20;
        int result = Tuan4.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax5() {
        System.out.println("Max");
        int a = 20;
        int b = 19;
        Tuan4 instance = new Tuan4();
        int expResult = 20;
        int result = Tuan4.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of minArr method, of class Tuan4.
     */
    @Test
    public void testMinArr1() {
        System.out.println("minArr");
        int[] arr = {1, 2, 3, 4, 5, 6};
        Tuan4 instance = new Tuan4();
        int expResult = 1;
        int result = Tuan4.minArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinArr2() {
        System.out.println("minArr");
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        Tuan4 instance = new Tuan4();
        int expResult = 0;
        int result = Tuan4.minArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinArr3() {
        System.out.println("minArr");
        int[] arr = {-23, 3, 5, -10};
        Tuan4 instance = new Tuan4();
        int expResult = -23;
        int result = Tuan4.minArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinArr4() {
        System.out.println("minArr");
        int[] arr =  {1, 2, 3, 4, 5, 6, -30};
        Tuan4 instance = new Tuan4();
        int expResult = -30;
        int result = Tuan4.minArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinArr5() {
        System.out.println("minArr");
        int[] arr = {0, 1, 2, 3, 4, 5, 6, -1334, 7};
        Tuan4 instance = new Tuan4();
        int expResult = -1334;
        int result = Tuan4.minArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of BMI method, of class Tuan4.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        float a = 1.70F;
        float b = 65F;
        Tuan4 instance = new Tuan4();
        String expResult = "Binh Thuong";
        String result = instance.BMI(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        float a = 1.68F;
        float b = 55F;
        Tuan4 instance = new Tuan4();
        String expResult = "Binh Thuong";
        String result = instance.BMI(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        float a = 1.53F;
        float b = 58F;
        Tuan4 instance = new Tuan4();
        String expResult = "Thua Can";
        String result = instance.BMI(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        float a = 1.48F;
        float b = 48F;
        Tuan4 instance = new Tuan4();
        String expResult = "Binh Thuong";
        String result = instance.BMI(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI5() {
        System.out.println("BMI");
        float a = 1.93F;
        float b = 96F;
        Tuan4 instance = new Tuan4();
        String expResult = "Beo Phi";
        String result = instance.BMI(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
