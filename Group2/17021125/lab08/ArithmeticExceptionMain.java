public class ArithmeticExceptionMain {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 0;
        try {
            int result = numberOne / numberTwo;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
