package Cau2;

public class classCast {
    public static void exception() throws ClassCastException{
        Object x = new Integer(9);
        System.out.println( (String)x);
    }

    public static void main(String[] args) {
        try {
            exception();
        } catch (ClassCastException e) {
            System.err.println("ERROR: ClassCastException");
        }
    }
}
