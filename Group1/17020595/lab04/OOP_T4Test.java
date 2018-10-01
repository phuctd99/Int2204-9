
package oop_t4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OOP_T4Test {
    
    public OOP_T4Test() {
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
     * Test of main method, of class OOP_T4.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        OOP_T4.main(args);
//        
//    }

    /**
     * Test of returnMax method, of class OOP_T4.
     */
    @Test
    //test so lon hon
    public void testReturnMax() {
        System.out.println("returnMax");
        int a = 3;
        int b = 4;
        //OOP_T4 instance = new OOP_T4();
        int expResult = 4;
        int result = OOP_T4.returnMax(a, b);
        assertEquals(4, result);        
    }
    @Test
    public void testReturnMax2() {
        System.out.println("returnMax2");
        int a = -4;
        int b = 4;
        //OOP_T4 instance = new OOP_T4();
        int expResult = 4;
        int result = OOP_T4.returnMax(a, b);
        assertEquals(4, result);
    } 
    @Test
    public void testReturnMax3() {
        System.out.println("returnMax");
        int a = 0;
        int b = 0;
        //OOP_T4 instance = new OOP_T4();
        int expResult = 0;
        int result = OOP_T4.returnMax(a, b);
        assertEquals(0, result);
    }
    @Test
    public void testReturnMax4() {
        System.out.println("returnMax");
        int a = -1;
        int b = -4;
        //OOP_T4 instance = new OOP_T4();
        int expResult = -1;
        int result = OOP_T4.returnMax(a, b);
        assertEquals(-1, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testReturnMax5() {
        System.out.println("returnMax");
        int a = 3;
        int b = 10;
        //OOP_T4 instance = new OOP_T4();
        int expResult = 10;
        int result = OOP_T4.returnMax(a, b);
        assertEquals(10, result);
    }
    //test so nho nhat trong mang
    @Test
    public void testReturnMinArr() {
        System.out.println("returnMinArr");
        int[] arr = {5,7,3,2,6,2,1};
        //OOP_T4 instance = new OOP_T4();
        int expResult = 1;
        int result = OOP_T4.returnMinArr(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testReturnMinArr2() {
        System.out.println("returnMinArr");
        int[] arr = {0,0,0,0,0,0};
        //OOP_T4 instance = new OOP_T4();
        int expResult = 0;
        int result = OOP_T4.returnMinArr(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testReturnMinArr3() {
        System.out.println("returnMinArr");
        int[] arr = {5,0,-3,2,10,4};
        //OOP_T4 instance = new OOP_T4();
        int expResult = -3;
        int result = OOP_T4.returnMinArr(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testReturnMinArr4() {
        System.out.println("returnMinArr");
        int[] arr = {-1,-4,-6,-2,0};
        //OOP_T4 instance = new OOP_T4();
        int expResult = -6;
        int result = OOP_T4.returnMinArr(arr);
        assertEquals(expResult, result);
    }
    @Test
    public void testReturnMinArr5() {
        System.out.println("returnMinArr");
        int[] arr = {100,10000,0,-111};
        //OOP_T4 instance = new OOP_T4();
        int expResult = -111;
        int result = OOP_T4.returnMinArr(arr);
        assertEquals(expResult, result);
    }
    @Test
    //test chi so BMI
    public void testPrintBMI() {
        System.out.println("printBMI");
        double weight = 77.8;
        double height = 1.84;
        //OOP_T4 instance = new OOP_T4();
        String result = OOP_T4.printBMI(weight, height);
        assertEquals("Binh thuong",result);
        
    }
    @Test
    public void testPrintBMI2() {
        System.out.println("printBMI");
        double weight = 100;
        double height = 1.74;
        //OOP_T4 instance = new OOP_T4();
        String result = OOP_T4.printBMI(weight, height);
        assertEquals("Beo phi",result);
        
    }
    @Test
    public void testPrintBMI3() {
        System.out.println("printBMI");
        double weight = 49;
        double height = 1.63;
        //OOP_T4 instance = new OOP_T4();
        String result = OOP_T4.printBMI(weight, height);
        assertEquals("Thieu can",result);
        
    }
    @Test
    public void testPrintBMI4() {
        System.out.println("printBMI");
        double weight = 47.6;
        double height = 1.6;
        //OOP_T4 instance = new OOP_T4();
        String result = OOP_T4.printBMI(weight, height);
        assertEquals("Binh thuong",result);        
    }
    @Test
    public void testPrintBMI5() {
        System.out.println("printBMI");
        double weight = 66.5;
        double height = 1.7;
        //OOP_T4 instance = new OOP_T4();
        String result = OOP_T4.printBMI(weight, height);
        assertEquals("Thua can",result);    
    }
    @Test
    public void testPrintBMI6() {
        System.out.println("printBMI");
        double weight = 52;
        double height = 1.45;
        //OOP_T4 instance = new OOP_T4();
        String result = OOP_T4.printBMI(weight, height);
        assertEquals("Thua can",result);    
    }
}
