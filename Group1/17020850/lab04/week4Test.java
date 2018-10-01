/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class week4Test {
    
   
    @Test
    public void testMax1() {
        System.out.println("max1");
        int a = 2;
        int b = 4;
        int expResult = 4;
        int result = week4.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax2() {
        System.out.println("max2");
        int a = 12;
        int b = 4;
        int expResult = 12;
        int result = week4.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax3() {
        System.out.println("max3");
        int a = 8;
        int b = 4;
        int expResult = 8;
        int result = week4.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax4() {
        System.out.println("max4");
        int a = 5;
        int b = 4;
        int expResult = 5;
        int result = week4.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax5() {
        System.out.println("max5");
        int a = 2;
        int b = 6;
        int expResult = 6;
        int result = week4.max(a, b);
        assertEquals(expResult, result);
        
    }
    

    
    @Test
    public void testMinArr1() {
        System.out.println("minArr1");
        int[] arr = {1,2,3,4,5};
        int expResult = 1;
        int result = week4.minArr(arr);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMinArr2() {
        System.out.println("minArr2");
        int[] arr = {0,2,3,4,5};
        int expResult = 0;
        int result = week4.minArr(arr);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMinArr3() {
        System.out.println("minArr3");
        int[] arr = {6,2,3,4,5};
        int expResult = 2;
        int result = week4.minArr(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testMinArr4() {
        System.out.println("minArr4");
        int[] arr = {9,10,3,4,5};
        int expResult = 3;
        int result = week4.minArr(arr);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMinArr5() {
        System.out.println("minArr5");
        int[] arr = {10,12,13,4,5};
        int expResult = 4;
        int result = week4.minArr(arr);
        assertEquals(expResult, result);
        
    }
   
    @Test
    public void testBmi1() {
        System.out.println("bmi1");
        double weight = 50;
        double high = 1.57;
        assertEquals(week4.bmi(weight, high),"Binh thuong");
        
    }
     @Test
    public void testBmi2() {
        System.out.println("bmi2");
        double weight = 50;
        double high = 1.50;
        assertEquals(week4.bmi(weight, high),"Binh thuong");
        
    }
     @Test
    public void testBmi3() {
        System.out.println("bmi3");
        double weight = 50;
        double high = 1.47;
        assertEquals(week4.bmi(weight, high),"Thua can");
       
    }
     @Test
    public void testBmi4() {
        System.out.println("bmi4");
        double weight = 40;
        double high = 1.57;
        assertEquals(week4.bmi(weight, high),"Thieu can");
       
    }
     @Test
    public void testBmi5() {
        System.out.println("bmi5");
        double weight = 58;
        double high = 1.57;
        assertEquals(week4.bmi(weight, high),"Thua can");
    }

    
}
