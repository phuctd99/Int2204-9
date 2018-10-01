import org.junit.Assert;
import org.junit.Test;

public class BMITest {

    @Test
    public void test1() {
        Assert.assertEquals("Thiếu Cân", BMI.BMI(55, 1.77));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Bình Thường", BMI.BMI(84, 1.93));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Thừa Cân", BMI.BMI(88, 1.934));
    }

    @Test
    public void test4() {
        Assert.assertEquals("Béo Phì", BMI.BMI(150, 1.95));
    }

    @Test
    public void test5() {
        Assert.assertEquals("Thiếu Cân", BMI.BMI(20, 1.5));
    }
}
