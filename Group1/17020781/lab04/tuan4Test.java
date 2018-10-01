/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author huanc_9jkjulx
 */
public class tuan4Test {
    tuan4 test = new tuan4();
    public tuan4Test() {
                             
    }

    /**
     * Test of minArray method, of class tuan4.
     */
    @Test
    public void testMinArray1() {
    	double min = -5.999;
    	int a[] = {2,-1,0,-6,5,7,3};
    	assertEquals(min, test.minArray(a,7),0.01);  // pass vì độ chính xác lớn hơn chênh lệch 
    }
    @Test
    public void testMinArray2() {
        double min = -6.001;
        int a[] = {2,-1,0,-6,5,7,3};
        assertEquals(min, test.minArray(a,7),0.01);   // pass vì độ chính xác lớn hơn chênh lệch
    }
    @Test
    public void testMinArray3() {
        double min = -6.1;
        int a[] = {2,-1,0,-6,5,7,3};
        assertEquals(min, test.minArray(a,7),0.01);   //ko pass vì độ chính xác nhỏ hơn chênh lệch
    }
    @Test
    public void testMinArray4() {
        double min = -6.001;
        int a[] = {2,-1,0,-6,5,7,3};
        assertEquals(min, test.minArray(a,7),0.001);   //ko pass vì độ chính xác bằng chênh lệch
    }
    @Test
    public void testMinArray5() {
        double min = -5.999;
        int a[] = {2,-1,0,-6,5,7,3};
        assertEquals(min, test.minArray(a,7),0.002);   // pass vì độ chính xác lớn hơn chênh lệch
    }

    /**
     * Test of max method, of class tuan4.
     */
    @Test
    public void testMax1() {
    	int a = 5;
    	assertEquals(a, test.max(4,5));
    }
    @Test
    public void testMax2() {
        int a = 5;
        assertEquals(a, test.max(5,5));
    }
    @Test
    public void testMax3() {
        int a = 0;
        assertEquals(a, test.max(0,-1));
    }
    @Test
    public void testMax4() {
        int a = 0;
        assertEquals(a, test.max(0,0));
    }
    @Test
    public void testMax5() {
        int a = 00;
        assertEquals(a, test.max(-1,0));
    }
    /**
     * Test of BMI method, of class tuan4.
     */

    @Test
    public void testBMI1() {
    	String expected1 = "Bình thường";
    	assertEquals(expected1, test.BMI(57,1.67));
    }
    @Test
     public void testBMI2() {
        
        String expected2 = "Thừa cân";
        assertEquals(expected2, test.BMI(67,1.67));
    
    }
    @Test
     public void testBMI3() {
        
        String expected3 = "Béo phì";
        assertEquals(expected3, test.BMI(77,1.67));
       
    }
    @Test
     public void testBMI4() {
        
        String expected4 = "Thiếu cân";
        assertEquals(expected4, test.BMI(47,1.67));

    }
    @Test
     public void testBMI5() {
        String expected1 = "Bình thường ";
        assertEquals(expected1, test.BMI(57,1.67)); //ko pass vì thừa 1 dấu space
       
    }
    
}
