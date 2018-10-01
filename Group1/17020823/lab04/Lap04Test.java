/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap04;

import java.util.Scanner;
import static lap04.Lap04.MAX;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hoang Vu Huong
 */
public class Lap04Test {
    
    public Lap04Test() {
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
     * Test of main method, of class Lap04.
     */
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Lap04.main(args);
//        int[] arr = new int[10];
//        for(int i=0; i< 10; i++){
//            arr[i] = i + 1;
//            
//        }
//        assertEquals(9,Lap04.MAX(4,9));
//        assertEquals(-8,Lap04.MAX(-88,-8));
//        assertEquals(1,Lap04.MAX(1,1));
//        assertEquals(100,Lap04.MAX(40,100));
//        assertEquals(5,Lap04.MAX(4,5));
//        assertEquals(1,Lap04.Minarr(arr));
    }

    /**
     * Test of MAX method, of class Lap04.
     */
    @Test
    public void testMAX() {
        System.out.println("MAX");
        int x = 2;
        int y = 9;
        int expResult = 9;
        int result = Lap04.MAX(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMAX1() {
        System.out.println("MAX");
        int x = -7;
        int y = 4;
        int expResult = 4;
        int result = Lap04.MAX(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMAX2() {
        System.out.println("MAX");
        int x = 10000;
        int y = -99;
        int expResult = 10000;
        int result = Lap04.MAX(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMAX3() {
        System.out.println("MAX");
        int x = 99;
        int y = 9;
        int expResult = 99;
        int result = Lap04.MAX(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMAX4() {
        System.out.println("MAX");
        int x = -88;
        int y = -9;
        int expResult = -9;
        int result = Lap04.MAX(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of Minarr method, of class Lap04.
     */
    @Test
    public void testMinarr() {
        System.out.println("Minarr");
        int[] a = {99,-7,-66,8,9};
        int expResult = -66;
        int result = Lap04.Minarr(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMinarr1() {
        System.out.println("Minarr");
        int[] a = {2,6,5,3,1,4,-7};
        int expResult = -7;
        int result = Lap04.Minarr(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMinarr3() {
        System.out.println("Minarr");
        int[] a = {0,0,3,2,1,3,4,5,7};
        int expResult = 0;
        int result = Lap04.Minarr(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinarr4() {
        System.out.println("Minarr");
        int[] a = {-88,44,33,2,57,8};
        int expResult = -88;
        int result = Lap04.Minarr(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinarr5() {
        System.out.println("Minarr");
        int[] a = {9,2,8,6,4,1};
        int expResult = 1;
        int result = Lap04.Minarr(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of BMI method, of class Lap04.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        float cannang = 60.0F;
        float chieucao = 1.6F;
        Lap04.BMI(cannang, chieucao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        float cannang = 70.0F;
        float chieucao = 1.65F;
        Lap04.BMI(cannang, chieucao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        float cannang = 80.0F;
        float chieucao = 1.85F;
        Lap04.BMI(cannang, chieucao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        float cannang = 70.54F;
        float chieucao = 1.55F;
        Lap04.BMI(cannang, chieucao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        float cannang = 47.36F;
        float chieucao = 1.60F;
        Lap04.BMI(cannang, chieucao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
