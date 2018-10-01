import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tuan4Test {
    tuan4 test = new tuan4();

    @Test
    void lonnhat() {
        int a = test.lonnhat(5,5);
        int b = test.lonnhat(5,6);
        int c = test.lonnhat(15,7);
        int d = test.lonnhat(18,0);
        int e = test.lonnhat(7,9);

        assertEquals(5,a);
        assertEquals(6,b);
        assertEquals(15,c);
        assertEquals(18,d);
        assertEquals(9,e);
    }

    @Test
    void nhonhatcuamang() {
        int mang1[] = {-1,2,3,4,5};
        int mang2[] = {4,7,2,1,9};
        int mang3[] = {12,24,21,1,25,56};
        int mang4[] = {1,0,23,42,114};
        int mang5[] = {3,4,5,1,3,5};

        int min1 = test.nhonhatcuamang(mang1);
        int min2 = test.nhonhatcuamang(mang2);
        int min3 = test.nhonhatcuamang(mang3);
        int min4 = test.nhonhatcuamang(mang4);
        int min5 = test.nhonhatcuamang(mang5);

        assertEquals(-1,min1);
        assertEquals(1,min2);
        assertEquals(1,min3);
        assertEquals(0,min4);
        assertEquals(1,min5);
    }

    @Test
    void IBM() {
        String ketluan1 = test.IBM(62.6175,1.65);//23
        String ketluan2 = test.IBM(58,1.72);//19.6
        String ketluan3 = test.IBM(70,1.72);//23,66
        String ketluan4 = test.IBM(68.035275,1.65);//24.99
        String ketluan5 = test.IBM(85,1.92);//23.05


        assertEquals("Thừa cân",ketluan1);
        assertEquals("Bình thường",ketluan2);
        assertEquals("Thừa cân",ketluan3);
        assertEquals("Béo phì",ketluan4);
        assertEquals("Thừa cân",ketluan5);


    }
}