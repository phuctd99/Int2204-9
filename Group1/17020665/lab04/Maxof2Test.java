import org.junit.Assert;
import org.junit.Test;

public class Maxof2Test {

    @Test
    public void Test1() {
        Assert.assertEquals(2, Maxof2.MAX(1, 2));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(3, Maxof2.MAX(2, 3));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(4, Maxof2.MAX(3, 4));
    }

    @Test
    public void Test4() {
        Assert.assertEquals(5, Maxof2.MAX(4, 5));
    }

    @Test
    public void Test5() {
        Assert.assertEquals(6, Maxof2.MAX(5, 6));
    }
}
