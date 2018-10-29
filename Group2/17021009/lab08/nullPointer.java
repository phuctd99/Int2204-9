package Cau2;

public class nullPointer {


    public static void exception() throws NullPointerException {
        String str = null;
        int a = str.length();
        System.out.println(a);
    }

    public static void main(String[] args){
        try {
            exception();
        } catch (NullPointerException e) {
            System.err.println("ERROR: nullPointerException");
        }
    }
}
