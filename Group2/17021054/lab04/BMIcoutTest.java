import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class BMIcoutTest {
    @Test
    public void test1(){
        assertEquals("Thieu can",BMIcout.inKetqua(41,1.58));
    }
    @Test
     public void test2(){
        assertEquals("Binh thuong", BMIcout.inKetqua(48,1.60));
    }
    @Test
    public void test3() {
        assertEquals("Thua can", BMIcout.inKetqua(60, 1.55));
    }
    @Test
    public void test4() {
        assertEquals("Beo phi", BMIcout.inKetqua(72.5, 1.62));
    }
    @Test
    public void test5(){
        assertEquals("Thua can", BMIcout.inKetqua(60,1.58));

    }

}