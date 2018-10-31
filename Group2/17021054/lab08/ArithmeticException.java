public class ArithmeticException  {
    public static void print() throws java.lang.ArithmeticException {
        int a = 3;
        int b =0;
        int result = a / b;
        System.out.println(result);
    }
    public static void main(String[] args) {

        try {
            print();
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e);
        }
    }
}
