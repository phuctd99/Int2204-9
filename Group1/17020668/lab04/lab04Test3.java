package lab04;

import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test3 {
    @Test
    public void max(){
        int a = -5;
        int b = 10;
        int result = 10;
        int maxresult = lab04.max(a, b);
        assertEquals(maxresult, result);
    }


    @Test
    public void min() {
        int arr[] = {1, 1, 1, 1, 1, 1, 1};
        int result = 1;
        int minresult = lab04.min(arr);
        assertEquals(result, minresult);
    }

    @Test
    public void IBM() {
        double a = 1.6;
        double b = 100;
        String result = "Béo phì";
        String ibmresult = lab04.IBM(a, b);
        assertEquals(result, ibmresult);
    }

}