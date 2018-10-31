package bai2;

public class iOException {

    public void IOE() throws ClassCastException {
        Object x = new Integer(10);
        System.out.println((String) x);
    }

    public static void main(String[] args){
        try {
            iOException iE = new iOException();
            iE.IOE();
        }
        catch (Exception e){
            System.out.println("iOException");
        }
    }
}
