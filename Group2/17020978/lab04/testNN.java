import org.junit.Test;

import static org.junit.Assert.*;

public class testNN {
    @Test
    public void testGTNN1()
    {
        int a[] = {1,2,3,4};
        assertEquals(1,LN.GTNN(a));
    }
    @Test
    public void testGTNN2()
    {
        int b[] = {5, 7, 8, 9, 4};
        assertEquals(4, LN.GTNN(b));
    }
        @Test
        public void testGTNN3()
        {
            int c[] = {9, 5, 6, 4, 7, 1, 2};
            assertEquals(1, LN.GTNN(c));
        }
            @Test
            public void testGTNN4()
            {
                int d[] = {4, 7, 5, 0, 9, 5, 6, 3};
                assertEquals(0, LN.GTNN(d));
            }
                @Test
                public void testGTNN5()
                {
                    int e[] = {14, 5, 8, 96, 47, 52, 18};
                    assertEquals(5, LN.GTNN(e));
                }
}