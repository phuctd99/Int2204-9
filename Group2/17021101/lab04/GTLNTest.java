import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class GTLNTest {
    private Main a=new Main();
    private int i;
    @Test public void test() {
        i = a.GTLN(2, 3);
        assertEquals(3, i);
    }
    @Test public void test2() {
        i = a.GTLN(2, 6);
        assertEquals(6, i);
    }
    @Test public void test3() {
        i = a.GTLN(9, 3);
        assertEquals(9, i);
    }
    @Test public void test4() {
        i = a.GTLN(12, 7);
        assertEquals(12, i);
    }
    @Test public void test5() {
        i = a.GTLN(27, 34);
        assertEquals(34, i);
    }
}