
package lab4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pham Van Thuan
 */
public class Lab4Test {
    
    public Lab4Test() {
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
     * Test of Min method, of class Lab4.
     */
    @Test
    public void testMin() {
        System.out.println("Min");
        int[] a = {1,2,3,4};
        int n = 4;
        int expResult = 1;
        int result = Lab4.Min(a, n);
        assertEquals(expResult, result);
    }

    @Test
    public void test1Min() {
        System.out.println("Min");
        int[] a = {-1,-2,3,4};
        int n = 4;
        int expResult = -2;
        int result = Lab4.Min(a, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test2Min() {
        System.out.println("Min");
        int[] a = {4,3,2};
        int n = 3;
        int expResult = 2;
        int result = Lab4.Min(a, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test3Min() {
        System.out.println("Min");
        int[] a = {0,2,-3,4};
        int n = 4;
        int expResult = -3;
        int result = Lab4.Min(a, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test4Min() {
        System.out.println("Min");
        int[] a = {11,8,3,4};
        int n = 4;
        int expResult = 3;
        int result = Lab4.Min(a, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test5Min() {
        System.out.println("Min");
        int[] a = {-2,2,3,-4};
        int n = 4;
        int expResult = -4;
        int result = Lab4.Min(a, n);
        assertEquals(expResult, result);
    }



    /**
     * Test of Max method, of class Lab4.
     */
    @Test
    public void test1Max() {
        System.out.println("Max");
        int a = 2;
        int b = 3;
        int expResult = 3;
        int result = Lab4.Max(a, b);
        assertEquals(expResult, result);
    }
    
     @Test
    public void test2Max() {
        System.out.println("Max");
        int a = 5;
        int b = 4;
        int expResult = 5;
        int result = Lab4.Max(a, b);
        assertEquals(expResult, result);
    }

     @Test
    public void test3Max() {
        System.out.println("Max");
        int a = 5;
        int b = 7;
        int expResult = 7;
        int result = Lab4.Max(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void test4Max() {
        System.out.println("Max");
        int a = -1;
        int b = -7;
        int expResult = -1;
        int result = Lab4.Max(a, b);
        assertEquals(expResult, result);
    }

     @Test
    public void test5Max() {
        System.out.println("Max");
        int a = 4;
        int b = 2;
        int expResult = 4;
        int result = Lab4.Max(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of BMI method, of class Lab4.
     */
    @Test
    public void test1BMI() {
        System.out.println("BMI");
        double weigh = 40;
        double height = 1.52;
        assertEquals("Thieu can",Lab4.BMI(weigh, height));
    }

    @Test
    public void test2BMI() {
        System.out.println("BMI");
        double weigh = 56;
        double height = 1.6;
        assertEquals("Binh thuong",Lab4.BMI(weigh, height));
    }
    
   @Test
    public void test3BMI() {
        System.out.println("BMI");
        double weigh = 60;
        double height = 1.58;
        assertEquals("Thua can",Lab4.BMI(weigh, height));
    }

    @Test
    public void test4BMI() {
        System.out.println("BMI");
        double weigh = 70;
        double height = 1.6;
        assertEquals("Beo phi",Lab4.BMI(weigh, height));
    }

    @Test
    public void test5BMI() {
        System.out.println("BMI");
        double weigh = 60;
        double height = 1.65;
        assertEquals("Binh thuong",Lab4.BMI(weigh, height));
    }

}
