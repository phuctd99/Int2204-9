import org.junit.Assert;
import org.junit.Test;

public class MinOfArrayTest {

    @Test
    public void test1() {
        int[] a = {2, 3, 1, 4, 5};
        Assert.assertEquals(1, MinOfArray.MinOfArray(a));
    }

    @Test
    public void test2() {
        int[] a = {60, 56, 99, 100, 23, 40};
        Assert.assertEquals(23, MinOfArray.MinOfArray(a));
    }

    @Test
    public void test3() {
        int[] a = {78, -7, 56, 9, -90};
        Assert.assertEquals(-90, MinOfArray.MinOfArray(a));
    }

    @Test
    public void test4() {
        int[] a = {5, 3, 7, 9, 0, 1, 6, 1};
        Assert.assertEquals(0, MinOfArray.MinOfArray(a));
    }

    @Test
    public void test5() {
        int[] a = {7, 5, -7, 9, 10};
        Assert.assertEquals(-7, MinOfArray.MinOfArray(a));
    }
}
