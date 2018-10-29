package cau2;
public class ArithmeticExceptions {
    public int Division(int x , int y) throws ArithmeticException{
        return x / y;
    }
    public static void main(String[] args) {
        ArithmeticExceptions s = new ArithmeticExceptions();
        try {
            System.out.println(s.Division(2, 0));
        }
        catch(ArithmeticException e){
            System.out.println("Loi khi chia");
        }  
    }
}
