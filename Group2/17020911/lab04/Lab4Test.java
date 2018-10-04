package lab4;

import org.junit.Test;
import static org.junit.Assert.*;


public class Lab4Test {
    
    @Test
    public void testMax2() {
        System.out.println("max");
        int a = 2;
        int b = 4;
        int expResult = 4;
        int result = Lab4.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax3() {
        System.out.println("max");
        int a = 5;
        int b = 3;
        int expResult = 5;
        int result = Lab4.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax4() {
        System.out.println("max");
        int a = 100;
        int b = 101;
        int expResult = 101;
        int result = Lab4.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax5() {
        System.out.println("max");
        int a = 24;
        int b = 35;
        int expResult = 35;
        int result = Lab4.max(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of min method, of class Lab4.
     */
    @Test
    public void testMin1() {
        System.out.println("min");
        int[] a = {1,2,3,4,5};
        int n = 5;
        int expResult = 1;
        int result = Lab4.min(a, n);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMin2() {
        System.out.println("min");
        int[] a = {3,4,2,5,7,2};
        int n = 6;
        int expResult = 2;
        int result = Lab4.min(a, n);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMin3() {
        System.out.println("min");
        int[] a = {30,40,20,50,70,20};
        int n = 6;
        int expResult = 20;
        int result = Lab4.min(a, n);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMin4() {
        System.out.println("min");
        int[] a = {31,41,22,53,72,21};
        int n = 6;
        int expResult = 21;
        int result = Lab4.min(a, n);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMin5() {
        System.out.println("min");
        int[] a = {3,4,2,5,7,2,-1};
        int n = 7;
        int expResult = -1;
        int result = Lab4.min(a, n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BMI method, of class Lab4.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double weight = 58.87;
        double high = 1.6;
        String result=Lab4.BMI(weight, high);
        String expResult="Binh Thuong";
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double weight = 30.87;
        double high = 1.7;
        String result=Lab4.BMI(weight, high);
        String expResult="Thieu Can";
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double weight = 100;
        double high = 1.6;
        String result=Lab4.BMI(weight, high);
        String expResult;
        expResult = "Beo Phi";
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double weight = 30;
        double high = 1.6;
        String result=Lab4.BMI(weight, high);
        String expResult="Thieu Can";
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI5() {
        System.out.println("BMI");
        double weight = 60.87;
        double high = 1.6;
        String result=Lab4.BMI(weight, high);
        String expResult="Thua Can";
        assertEquals(expResult, result);
    }

}