
import org.junit.Assert;
import org.junit.Test;

public class integersTest {

    integers integer = new integers();


    //test phương thức max
    @Test
    public void max() {
        Assert.assertEquals(2, integer.max(2, 1));
    }

    @Test
    public void max1() {
        Assert.assertEquals(4, integer.max(-4, 4));
    }

    @Test
    public void max2() {
        Assert.assertEquals(-2, integer.max(-4, -2));
    }

    @Test
    public void max3() {
        Assert.assertEquals(100000, integer.max(99999, 100000));
    }

    @Test
    public void max4() {
        Assert.assertEquals(0, integer.max(-4, 0));
    }

    //test phuong thuc minarr
    @Test
    public void min() {
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 6;
        arr[2] = 5;
        arr[3] = 10;
        Assert.assertEquals(5, integer.minarr(arr));
    }

    @Test
    public void min1() {
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 0;
        arr1[2] = -2;
        Assert.assertEquals(-2, integer.minarr(arr1));
    }

    @Test
    public void min2() {
        int[] arr2 = new int[1];
        arr2[0] = 1;
        Assert.assertEquals(1, integer.minarr(arr2));
    }

    public void min3() {
        int[] arr3 = new int[2];
        arr3[0] = 2;
        arr3[1] = -2;
        Assert.assertEquals(-2, integer.minarr(arr3));
    }

    @Test
    public void min4() {
        int[] arr4 = new int[4];
        arr4[0] = 110;
        arr4[1] = 101;
        arr4[2] = 102;
        arr4[3] = 103;
        Assert.assertEquals(101, integer.minarr(arr4));
    }

    //test phuong thuc BIM
    @Test
    public void BIM() {

        Assert.assertEquals("Thieu can", integer.BIM(50, 1.7));
    }

    @Test
    public void BIM1() {
        Assert.assertEquals("Binh thuong", integer.BIM(66.45555, 1.7));
    }

    @Test
    public void BIM2() {
        Assert.assertEquals("Thua can", integer.BIM(66.47, 1.7));
    }

    @Test
    public void BIM3() {
        Assert.assertEquals("Beo phi", integer.BIM(69, 1.62));
    }

    @Test
    public void BIM4() {
        Assert.assertEquals("Beo phi", integer.BIM(70, 1.62));
    }

}

