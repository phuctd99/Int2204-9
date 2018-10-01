import org.junit.Assert;
import org.junit.Test;

public class practice_4Test {
    practice_4 test = new practice_4();
    //test maxValue
    @Test
    public void maxValue() {

        Assert.assertEquals(7, test.maxValue(7, 5));

    }

    @Test
    public void maxValue1() {

        Assert.assertEquals(8, test.maxValue(2, 8));

    }

    @Test
    public void maxValue2 () {

        Assert.assertEquals(10, test.maxValue(0, 10));

    }

    @Test
    public void maxValue3 () {

        Assert.assertEquals(6, test.maxValue(6, 6));

    }

    @Test
    public void maxValue4 () {

        Assert.assertEquals(8, test.maxValue(8, 5));
    }

    //test minValue
    @Test
    public void minValue() {
        int[] a = new int[100];
        Assert.assertEquals(0, test.minValue(a));
    }

    @Test
    public void minValue1 () {
        int[] a = new int[100];
        for (int i=0; i<100; i++) {
            a[i] = i+5;
        }
        Assert.assertEquals(5, test.minValue(a));

    }

    @Test
    public void minValue2 () {

        int[] b = {9, 5, 8, 4, 3, 9, 5, 3};
        Assert.assertEquals(3, test.minValue(b));

    }
    @Test
    public void minValue3 () {

        int[] c = {89, 89209, 9283, 9023, 834234, 4934, 8820, 43};
        Assert.assertEquals(43, test.minValue(c));

    }
    @Test
    public void minValue4 () {
        int[] d = {82, 93420, 234, 34820, 93482, 0, 2933, 2939, 3948, 39402};
        Assert.assertEquals(0, test.minValue(d));
    }

    //test BMI
    @Test
    public void BMI() {
        Assert.assertEquals("Thiếu cân", test.BMI(45, 1.6));
    }

    @Test
    public void BMI1() {
        Assert.assertEquals("Bình thường", test.BMI(58.87, 1.6)); //22.996
    }
    @Test
    public void BMI2() {
        Assert.assertEquals("Thừa cân", test.BMI(60.05, 1.55));//24.994
    }
    @Test
    public void BMI3() {
        Assert.assertEquals("Béo Phì", test.BMI(70, 1.6));
    }
    @Test
    public void BMI4() {
        Assert.assertEquals("Béo Phì", test.BMI(80, 1.6));
    }

}