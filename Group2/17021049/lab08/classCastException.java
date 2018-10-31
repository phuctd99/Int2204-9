package bai2;

public class classCastException {

    public void DataTypeCast() throws ClassCastException {
        Object x = new Integer(6);
        char ch =  (char)x;
    }

    public static void main(String[] args){
        try {
            classCastException cE = new classCastException();
            cE.DataTypeCast();
        }
        catch (Exception e){
            System.out.println("classCastException");
        }
    }
}
