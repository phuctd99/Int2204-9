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
public class lab04Test {
    
    public lab04Test() {
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
     * Test of max method, of class lab04.
     */
    @Test
    public void testMax1() {
        System.out.println("max");
        int x = 5;
        int y = 6;
        lab04 instance = new lab04();
        int expResult = 6;
        int result = instance.max(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax2() {
        System.out.println("max");
        int x = 3;
        int y = 4;
        int expResult = 4;
        int result = lab04.max(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax3() {
        System.out.println("max");
        int x = 11;
        int y = 31;
        int expResult = 31;
        int result = lab04.max(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax4() {
        System.out.println("max");
        int x = 21;
        int y = 7;
        int expResult = 21;
        int result = lab04.max(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax5() {
        System.out.println("max");
        int x = 11;
        int y = 6;
        int expResult = 11;
        int result = lab04.max(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of nhonhat method, of class lab04.
     */
    @Test
    public void testNhonhat1() {
        System.out.println("nhonhat");
        int[] arr = {1,2,3,4,5};
        int n = 5;
        int expResult = 1;
        int result = lab04.nhonhat(arr, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNhonhat2() {
        System.out.println("nhonhat");
        int[] arr = {11,-2,-3,4,5,7};
        int n = 6;
        int expResult = -3;
        int result = lab04.nhonhat(arr, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNhonhat3() {
        System.out.println("nhonhat");
        int[] arr = {11,21,35,4,5,-22,-345};
        int n = 7;
        int expResult = -345;
        int result = lab04.nhonhat(arr, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNhonhat4() {
        System.out.println("nhonhat");
        int[] arr = {1,2,3,4,5,6};
        int n = 6;
        int expResult = 1;
        int result = lab04.nhonhat(arr, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNhonhat5() {
        System.out.println("nhonhat");
        int[] arr = {-1,-22,-33,-244,-555};
        int n = 5;
        int expResult = -555;
        int result = lab04.nhonhat(arr, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of bmi method, of class lab04.
     */
    @Test
    public void testBmi1() {
        System.out.println("bmi");
        double cao = 1.78;
        double nang = 63.0;
        String expResult = "Bình thường";
        String result = lab04.bmi(cao, nang);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBmi2() {
        System.out.println("bmi");
        double cao = 1.55;
        double nang = 70.0;
        String expResult = "Béo phì";
        String result = lab04.bmi(cao, nang);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBmi3() {
        System.out.println("bmi");
        double cao = 1.6;
        double nang = 75.0;
        String expResult = "Béo phì";
        String result = lab04.bmi(cao, nang);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBmi4() {
        System.out.println("bmi");
        double cao = 1.95;
        double nang = 70.0;
        String expResult = "Thiếu cân";
        String result = lab04.bmi(cao, nang);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBmi5() {
        System.out.println("bmi");
        double cao = 1.95;
        double nang = 90.0;
        String expResult = "Bình thường";
        String result = lab04.bmi(cao, nang);
        assertEquals(expResult, result);
    }
    
}
