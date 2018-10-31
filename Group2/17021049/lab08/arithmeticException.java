package bai2;

public class arithmeticException {

    public void Fraction() throws ArithmeticException {
        int a = 15 / 0;
    }

    public static void main(String[] args){
        try {
            arithmeticException aE = new arithmeticException();
            aE.Fraction();
        }
        catch (Exception e){
            System.out.println("divideByZeroException");
        }
    }

}
