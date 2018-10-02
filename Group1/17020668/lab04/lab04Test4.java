package lab04;

import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test4 {
    @Test
    public void max(){
        int a = 10;
        int b = 10;
        int result = 10;
        int maxresult = lab04.max(a, b);
        assertEquals(maxresult, result);
    }


    @Test
    public void min() {
        int arr[] = {-1, -3, -5, -8, -30, -90};
        int result = -90;
        int minresult = lab04.min(arr);
        assertEquals(result, minresult);
    }

    @Test
    public void IBM() {
        double a = 2;
        double b = 94;
        String result = "Thừa cân";
        String ibmresult = lab04.IBM(a, b);
        assertEquals(result, ibmresult);
    }

}