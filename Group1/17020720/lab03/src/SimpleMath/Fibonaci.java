package SimpleMath;

public class Fibonaci {
    public static void main(String[] args) {
        Fibonaci fib = new Fibonaci();

        //Example
        int n = 8;
        int fibo = fib.find(n);
        System.out.println(fibo);
    }

    public int find(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else return (this.find(n - 1) + this.find(n - 2));
    }
}
