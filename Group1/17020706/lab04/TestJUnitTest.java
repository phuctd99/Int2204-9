/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyễn Giang
 */
public class TestJUnitTest {
    
    public TestJUnitTest() {
    }

    /**
     * Test of solonnhat method, of class TestJUnit.
     */
    @Test
    public void testSolonnhat() {
        System.out.println("solonnhat");
        int a = 1;
        int b = 2;
        int expResult = 2;
        int result = TestJUnit.solonnhat(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolonnhat2() {
        System.out.println("solonnhat2");
        int a = 2;
        int b = 2;
        int expResult = 2;
        int result = TestJUnit.solonnhat(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolonnhat3() {
        System.out.println("solonnhat3");
        int a = -3;
        int b = 0;
        int expResult = 0;
        int result = TestJUnit.solonnhat(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolonnhat4() {
        System.out.println("solonnhat4");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = TestJUnit.solonnhat(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolonnhat5() {
        System.out.println("solonnhat5");
        int a = -3;
        int b = -5;
        int expResult = -3;
        int result = TestJUnit.solonnhat(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of mincuaMang method, of class TestJUnit.
     */
    @Test
    public void testMincuaMang() {
        System.out.println("mincuaMang");
        int[] ar = {1, 2, 3, -2, 0};
        int expResult = -2;
        int result = TestJUnit.mincuaMang(ar);
        assertEquals(expResult, result);
    }
    @Test
    public void testMincuaMang2() {
        System.out.println("mincuaMang1");
        int[] ar = {1, 2, 3, 10, 0};
        int expResult = 0;
        int result = TestJUnit.mincuaMang(ar);
        assertEquals(expResult, result);
    }
    @Test
    public void testMincuaMang3() {
        System.out.println("mincuaMang2");
        int[] ar = {-10, -11, -12, -13};
        int expResult = -13;
        int result = TestJUnit.mincuaMang(ar);
        assertEquals(expResult, result);
    }
    @Test
    public void testMincuaMang4() {
        System.out.println("mincuaMang3");
        int[] ar = {-50, 60, 0, 1, 2};
        int expResult = -50;
        int result = TestJUnit.mincuaMang(ar);
        assertEquals(expResult, result);
    }
    @Test
    public void testMincuaMang5() {
        System.out.println("mincuaMang4");
        int[] ar = {-1, -1, 2, 3};
        int expResult = -1;
        int result = TestJUnit.mincuaMang(ar);
        assertEquals(expResult, result);
    }
    /**
     * Test of bmi method, of class TestJUnit.
     */
    @Test
    public void testBmi() {
        System.out.println("bmi");
        double cao = 1.7;
        double nang = 70;
        String expResult = "Thua can";
        String result = TestJUnit.bmi(cao, nang);
        assertEquals(expResult, result);
    }
     @Test
    public void testBmi1() {
        System.out.println("bmi1");
        double cao = 1.7;
        double nang = 53;
        String expResult = "Thieu can";
        String result = TestJUnit.bmi(cao, nang);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testBmi2() {
        System.out.println("bmi2");
        double cao = 1.69;
        double nang = 53;
        String expResult = "Binh thuong";
        String result = TestJUnit.bmi(cao, nang);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testBmi3() {
        System.out.println("bmi3");
        double cao = 1.7;
        double nang = 80;
        String expResult = "Beo phi";
        String result = TestJUnit.bmi(cao, nang);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testBmi4() {
        System.out.println("bmi4");
        double cao = 1.7;
        double nang = 40;
        String expResult = "Thieu can";
        String result = TestJUnit.bmi(cao, nang);
        assertEquals(expResult, result);
    }

}
