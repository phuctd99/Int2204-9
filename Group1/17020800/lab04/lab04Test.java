/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPlab4;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nguyenhuy
 */
public class lab04Test {

    public lab04Test() {
    }

//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of min method, of class lab04.
     */
    @Test
    public void testMin() {
        System.out.println("min1");
        int[] arr = {2, 3, 5, 0};
        int expResult = 0;
        int result = lab04.min(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testMin1() {
        System.out.println("min2");
        int[] arr = {2, 3, 5, 1};
        int expResult = 1;
        int result = lab04.min(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testMin2() {
        System.out.println("min3");
        int[] arr = {2, 3, 0, 1};
        int expResult = 0;
        int result = lab04.min(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testMin3() {
        System.out.println("min4");
        int[] arr = {2, 3, -1, 1};
        int expResult = -1;
        int result = lab04.min(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testMin4() {
        System.out.println("min5");
        int[] arr = {2, -3, 5, 1};
        int expResult = -3;
        int result = lab04.min(arr);
        assertEquals(expResult, result);
    }

    /**
     * Test of BMI method, of class lab04.
     */
    @Test
    //25
    public void testBMI() {
        System.out.println("BMI");
        double w = 72.25;
        double h = 1.7;
        String expResult = "Béo phì";
        String result = lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    @Test
    //23
    public void testBMI1() {
        System.out.println("BM1I");
        double w = 66.47;
        double h = 1.7;
        String expResult = "Thừa cân";
        String result = lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI2() {
        System.out.println("BMI2");
        double w = 65;
        double h = 1.7;
        String expResult = "Bình thường";
        String result = lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI3() {
        System.out.println("BMI3");
        double w = 65;
        double h = 1.7;
        String expResult = "Bình thường";
        String result = lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI4() {
        System.out.println("BMI4");
        double w = 65;
        double h = 1.7;
        String expResult = "Bình thường";
        String result = lab04.BMI(w, h);
        assertEquals(expResult, result);
    }

    /**
     * Test of max method, of class lab04.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int a = 2;
        int b = 1;
        int expResult = 2;
        int result = lab04.max(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMax1() {
        System.out.println("max1");
        int a = -1;
        int b = 1;
        int expResult = 1;
        int result = lab04.max(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMax2() {
        System.out.println("max2");
        int a = -1;
        int b = -5;
        int expResult = -1;
        int result = lab04.max(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMax3() {
        System.out.println("max3");
        int a = 5;
        int b = -5;
        int expResult = 5;
        int result = lab04.max(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMax4() {
        System.out.println("max4");
        int a = 10;
        int b = -5;
        int expResult = 10;
        int result = lab04.max(a, b);
        assertEquals(expResult, result);
    }
}
