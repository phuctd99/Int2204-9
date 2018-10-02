package lab04;

import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test2 {
    @Test
    public void max(){
        int a = -5;
        int b = -9;
        int result = -5;
        int maxresult = lab04.max(a, b);
        assertEquals(maxresult, result);
    }


    @Test
    public void min() {
        int arr[] = {1, 9, 35, 20, -10};
        int result = -10;
        int minresult = lab04.min(arr);
        assertEquals(result, minresult);
    }

    @Test
    public void IBM() {
        double a = 2;
        double b = 55;
        String result = "Thiếu cân";
        String ibmresult = lab04.IBM(a, b);
        assertEquals(result, ibmresult);
    }

}