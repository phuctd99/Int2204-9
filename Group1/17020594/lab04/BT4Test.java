/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tommmm^^
 */
public class BT4Test {
    
    public BT4Test() {
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
     * Test of Max method, of class BT4.
     */
    @Test
    public void testMax() {
        System.out.println("Max");
        int a = 0;
        int b = 0;
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.Max(a, b);
        assertEquals(expResult, result);
       
        
    }

   @Test
    public void testMax1() {
        System.out.println("Max");
        int a = 0;
        int b = 0;
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.Max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax2() {
        System.out.println("Max");
        int a = 0;
        int b = 0;
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.Max(a, b);
        assertEquals(expResult, result);
        
     
    }
    @Test
    public void testMax3() {
        System.out.println("Max");
        int a = 0;
        int b = 0;
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testMax4() {
        System.out.println("Max");
        int a = 0;
        int b = 0;
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testMinArr() {
        System.out.println("MinArr");
        int[] arr = {0,0,2,3};
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     @Test
    public void testMinArr3() {
        System.out.println("MinArr");
        int[] arr = null;
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     @Test
    public void testMinArr1() {
        System.out.println("MinArr");
        int[] arr = {1,3,0,9};
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     @Test
    public void testMinArr2() {
        System.out.println("MinArr");
        int[] arr = {0,1,2,9};
        BT4 instance = new BT4();
        int expResult = 0;
        int result = instance.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     @Test
    public void testMinArr4() {
        System.out.println("MinArr");
        int[] arr = {1,3,5,6};
        BT4 instance = new BT4();
        int expResult = 1;
        int result = instance.MinArr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of BMI method, of class BT4.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double weight = 50;
        double height = 1,5;
        BT4 instance = new BT4();
        String expResult = "Beo phi";
        String result = instance.BMI(weight, height);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testBMI2() {
        System.out.println("BMI");
        double weight = 50;
        double height = 1.6;
        BT4 instance = new BT4();
        String expResult = "Beo phi";
        String result = instance.BMI(weight, height);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testBMI1() {
        System.out.println("BMI");
        double weight = 52;
        double height = 1.5;
        BT4 instance = new BT4();
        String expResult = "Thua can";
        String result = instance.BMI(weight, height);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testBMI3() {
        System.out.println("BMI");
        double weight = 53;
        double height = 1.5;
        BT4 instance = new BT4();
        String expResult = "Beo phi";
        String result = instance.BMI(weight, height);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testBMI4() {
        System.out.println("BMI");
        double weight = 59;
        double height = 1.2;
        BT4 instance = new BT4();
        String expResult = "Beo phi";
        String result = instance.BMI(weight, height);
        assertEquals(expResult, result);
       
    }
   
}
