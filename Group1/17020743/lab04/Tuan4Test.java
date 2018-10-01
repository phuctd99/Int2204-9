/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan4;

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
public class Tuan4Test {
    
   
    @Test
    public void testMax1() {
        System.out.println("max");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Tuan4.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testMax2() {
        System.out.println("max");
        int a = 12;
        int b = 23;
        int expResult = 23;
        int result = Tuan4.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testMax3() {
        System.out.println("max");
        int a = 2312;
        int b = 1231;
        int expResult = 2312;
        int result = Tuan4.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testMax4() {
        System.out.println("max");
        int a = 33;
        int b = 21;
        int expResult = 33;
        int result = Tuan4.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testMax5() {
        System.out.println("max");
        int a = 99;
        int b = 100;
        int expResult = 100;
        int result = Tuan4.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of minarr method, of class Tuan4.
     */
    @Test
    public void testMinarr() {
       System.out.println("minarr"); 
        int[] arr = {3};
        int expResult = 3;
        int result = Tuan4.minarr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
        @Test
    public void testMinarr1() {
        System.out.println("minarr");
        int[] arr = {12,32,43,54,65,76,87,99};
        int expResult = 12;
        int result = Tuan4.minarr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
        @Test
    public void testMinarr2() {
        System.out.println("minarr");
        int[] arr = {-11,-21,21,43,100,-14};
        int expResult = -21;
        int result = Tuan4.minarr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
        @Test
    public void testMinarr3() {
        System.out.println("minarr");
        int[] arr = {-12,12,-12,32,31,43};
        int expResult = -12;
        int result = Tuan4.minarr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testMinarr4() {
        System.out.println("minarr");
        int[] arr = {21,32};
        int expResult = 21;
        int result = Tuan4.minarr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of bmi method, of class Tuan4.
     */
    @Test
    public void testBmi() {
        System.out.println("bmi");
        double a = 50;
        double b = 1.8;
        String expResult = "THIEU CAN";
        String result = Tuan4.bmi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    public void testBmi1() { //18.5
        System.out.println("bmi"); 
        double a = 47.36;
        double b = 1.6;
        String expResult = "BINH THUONG";
        String result = Tuan4.bmi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    public void testBmi2() { //23
        System.out.println("bmi");
        double a = 58.88;
        double b = 1.6;
        String expResult = "THUA CAN";
        String result = Tuan4.bmi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    public void testBmi3() {
        System.out.println("bmi");
        double a = 96;
        double b = 1.6;
        String expResult = "BEO PHI";
        String result = Tuan4.bmi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    public void testBmi4() {
        System.out.println("bmi");
        double a = 80;
        double b = 1.9;
        String expResult = "BINH THUONG";
        String result = Tuan4.bmi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Tuan4.
     */

}
