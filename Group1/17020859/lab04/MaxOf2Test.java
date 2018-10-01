import org.junit.Assert;
import org.junit.Test;

public class MaxOf2Test {

    @Test
    public void Test1() {
        Assert.assertEquals(2, MaxOf2.MaxOf2(1, 2));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(3, MaxOf2.MaxOf2(2, 3));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(4, MaxOf2.MaxOf2(4, 4));
    }

    @Test
    public void Test4() {
        Assert.assertEquals(5, MaxOf2.MaxOf2(4, 5));
    }

    @Test
    public void Test5() {
        Assert.assertEquals(6, MaxOf2.MaxOf2(5, 6));
    }
}
