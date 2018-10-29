package task2;

public class ClassCastExceptionDemo {
    public void casting(Object i) throws ClassCastException {
        System.out.println((String) i);
    }

    public static void main(String[] args) {
        ClassCastExceptionDemo tmp = new ClassCastExceptionDemo();
        try {
            tmp.casting(11);
        } catch (ClassCastException ex) {
            System.out.println(ex);
        }
    }
}
