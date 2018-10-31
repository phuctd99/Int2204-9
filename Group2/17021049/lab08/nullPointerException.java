package bai2;

public class nullPointerException {

    public void number() throws NullPointerException {
        Object num = new Integer(null);
        System.out.println();
    }

    public static void main(String[] args){
        try {
            nullPointerException nP = new nullPointerException();
            nP.number();
        }
        catch (Exception e){
            System.out.println("nullPointerException");
        }
    }
}
