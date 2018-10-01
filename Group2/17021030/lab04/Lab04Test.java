package lab04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Lab04Test {
    
    public Lab04Test() {
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
     * Test of timLonHon method, of class Lab04.
     */
    @Test
    public void test1_TimLonHon() {
        System.out.println("timLonHon 1");
        int expResult = 10;
        int result = Lab04.timLonHon(3, 10);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test2_TimLonHon() {
        System.out.println("timLonHon 2");
        int expResult = 99;
        int result = Lab04.timLonHon(99, 98);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test3_TimLonHon() {
        System.out.println("timLonHon 3");
        int expResult = 1;
        int result = Lab04.timLonHon(-1, 1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test4_TimLonHon() {
        System.out.println("timLonHon 4");
        int expResult = 20;
        int result = Lab04.timLonHon(20, 11);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test5_TimLonHon() {
        System.out.println("timLonHon 5");
        int expResult = 10;
        int result = Lab04.timLonHon(3, 10);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of timNhoNhat method, of class Lab04.
     */
    
    @Test
    public void test1_TimNhoNhat() {
        System.out.println("timNhoNhat 1");
        int[] arr = {9, 6, 2, 7, 1, 8, 11, 14, 5};
        int numOfElement = arr.length;
        int expResult = 1;
        int result = Lab04.timNhoNhat(arr, numOfElement);
        assertEquals(expResult, result);

    }
    
    @Test
    public void test2_TimNhoNhat() {
        System.out.println("timNhoNhat 2");
        int[] arr = {-1, -10, -4, 1, 5, -14, -11, 6, 13, -2};
        int numOfElement = arr.length;
        int expResult = -14;
        int result = Lab04.timNhoNhat(arr, numOfElement);
        assertEquals(expResult, result);

    }
     
    @Test
    public void test3_TimNhoNhat() {
        System.out.println("timNhoNhat 3");
        int[] arr = {100, 145, 162, 99, 101};
        int numOfElement = arr.length;
        int expResult = 99;
        int result = Lab04.timNhoNhat(arr, numOfElement);
        assertEquals(expResult, result);

    }
    
    @Test
    public void test4_TimNhoNhat() {
        System.out.println("timNhoNhat 4");
        int[] arr = {20, 18, 19, 17, 14, 12, 41, 11, 35, 45, 69};
        int numOfElement = arr.length;
        int expResult = 11;
        int result = Lab04.timNhoNhat(arr, numOfElement);
        assertEquals(expResult, result);

    }
    
    @Test
    public void test5_TimNhoNhat() {
        System.out.println("timNhoNhat 5");
        int[] arr = {17, 25, 758, 0, 15, 67, 63, 75, 14, 536, 564, 64};
        int numOfElement = arr.length;
        int expResult = 0;
        int result = Lab04.timNhoNhat(arr, numOfElement);
        assertEquals(expResult, result);

    }
      
    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void test1_BMI() {
        System.out.println("BMI");
        double height = 1.8;
        double weight = 59.94;
        String expResult = "Thieu can";
        String result = Lab04.BMI(height, weight);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test2_BMI() {
        System.out.println("BMI");
        double height = 1.6;
        double weight = 65;
        String expResult = "Beo phi";
        String result = Lab04.BMI(height, weight);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test3_BMI() {
        System.out.println("BMI");
        double height = 1.8;
        double weight = 71.28;
        String expResult = "Binh thuong";
        String result = Lab04.BMI(height, weight);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test4_BMI() {
        System.out.println("BMI");
        double height = 1.7;
        double weight = 66.47;
        String expResult = "Thua can";
        String result = Lab04.BMI(height, weight);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test5_BMI() {
        System.out.println("BMI");
        double height = 1.68;
        double weight = 70;
        String expResult = "Thua can";
        String result = Lab04.BMI(height, weight);
        assertEquals(expResult, result);
    }
}
