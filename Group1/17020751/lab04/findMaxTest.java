import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class findMaxTest {
    @Test
    public void testFind() {
        assertEquals(4, findMax.find(3, 4));
    }
    public void testFind1() {
        assertEquals(5,findMax.find(4,5));
    }
    public void testFind2() {
        assertEquals(7,findMax.find(6,7));
    }
    public void testFind3() {
        assertEquals(13, findMax.find(1,13));
    }
    public void testFind4() {
        assertEquals(99, findMax.find(23,99));
    }
    @Test
    public void testMin(){
        int [] arr = {1,2,3,4,5,6,7};
        assertEquals(1,findMax.findMin(arr));





        assertEquals(1,findMax.findMin(arr));
        assertEquals(1,findMax.findMin(arr));
    }
    @Test
    public void testMin1() {
        int [] arr1 = {2,3,4,5,6,7,8};
        assertEquals(2,findMax.findMin(arr1));
    }
    @Test
    public void testMin2() {
        int [] arr2 = {4,7,2,9,5};
        assertEquals(2,findMax.findMin(arr2));
    }
    @Test
    public void testMin3() {
        int [] arr3 = { 9,8,7,4,1};
        assertEquals(1,findMax.findMin(arr3));
    }
    @Test
    public void testMin4() {
        int [] arr4 = {6,0,5,6,7,5};
        assertEquals(0,findMax.findMin(arr4));
    }
    @Test
    public void testBMI(){
        assertEquals("Thieu can" ,findMax.BMI(46,1.8));
    }
    @Test
    public void testBMI1() {
        assertEquals("Binh thuong" , findMax.BMI(46,1.5));
    }
    @Test
    public void testBMI2() {
        assertEquals("Beo phi" , findMax.BMI(80,1.5));
    }
    @Test
    public void testBMI3() {
        assertEquals("Thua can", findMax.BMI(51.75,1.5));
    }
    @Test
    public void testBMI4() {
         assertEquals("Thua can" , findMax.BMI(58.88,1.6));
    }
}
