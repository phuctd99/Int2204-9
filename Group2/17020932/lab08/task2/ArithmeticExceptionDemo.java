package task2;

public class ArithmeticExceptionDemo {
    public void Divison(int n, int d) throws ArithmeticException {
        if(d == 0) throw new ArithmeticException();
        System.out.println(n + "/" + d + " " + n/d);
    }

    public static void main(String[] args) {
        ArithmeticExceptionDemo tmp = new ArithmeticExceptionDemo();
        try {
            tmp.Divison(9, 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
