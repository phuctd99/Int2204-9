package Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSoNguyenTest {

    @Test
    public void maxInt() {
        System.out.println("True");
        int result1 = 33;
        int maxresult1 = MaxSoNguyen.MaxInt(12, 33);
        assertEquals(result1, maxresult1);

        System.out.println("True");
        int result2 = 19;
        int maxresult2 = MaxSoNguyen.MaxInt(9, 19);
        assertEquals(result2, maxresult2);

        System.out.println("True");
        int result3 = 79;
        int maxresult3 = MaxSoNguyen.MaxInt(75, 79);
        assertEquals(result3, maxresult3);

        System.out.println("True");
        int result4 = 31;
        int maxresult4 = MaxSoNguyen.MaxInt(31, 23);
        assertEquals(result4, maxresult4);

        System.out.println("True");
        int result5 = 99;
        int maxresult5 = MaxSoNguyen.MaxInt(99, 96);
        assertEquals(result5, maxresult5);
    }
}