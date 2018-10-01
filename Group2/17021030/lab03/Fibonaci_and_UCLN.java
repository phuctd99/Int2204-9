package lab03;

public class Fibonaci_and_UCLN {
    // phuong thuc tim UCLN
    static int UCLN(int a, int b) {
        int abs_a = Math.abs(a);
        int abs_b = Math.abs(b);
        while (abs_a != abs_b) {
            if (abs_a > abs_b) {
                abs_a = abs_a - abs_b;
            }
            else {
                abs_b = abs_b - abs_a;
            }
        }
        return abs_a;
    }
    
    // phuong thuc tim so Fibonaci
    static int Fibonaci(int n) {
        int s1 = 0, s2 = 1;
        int s3 = 0;
        int count = 2;
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            while (count <= n)
            {
                s3 = s1 + s2;
                s1 = s2; 
                s2 = s3;
                count++;
            }
        }
        return s3;
    }
}
