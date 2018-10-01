import org.junit.Assert;
import org.junit.Test;

public class MinofArrayTest {

    @Test
    public void test1() {
        int[] arr = {2, 3, 1, 4, 5};
        Assert.assertEquals(1, MinofArray.MIN(arr));
    }

    @Test
    public void test2() {
        int[] arr = {-1, -2, -10, -9, -25};
        Assert.assertEquals(-25, MinofArray.MIN(arr));
    }

    @Test
    public void test3() {
        int[] arr = {7, 8, 9, 25, 1};
        Assert.assertEquals(1, MinofArray.MIN(arr));
    }

    @Test
    public void test4() {
        int[] arr = {1, 2, 3, 0, 7, -1, -8};
        Assert.assertEquals(-8, MinofArray.MIN(arr));
    }

    @Test
    public void test5() {
        int[] arr = {166, 202, 265};
        Assert.assertEquals(166, MinofArray.MIN(arr));
    }
}
