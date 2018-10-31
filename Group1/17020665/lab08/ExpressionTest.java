public class ExpressionTest {
    public static void main (String [] args){

        Expression v1 = new Numeral(2);
        Expression v2 = new Numeral(3);
        Expression v3 = new Numeral(4);
        Expression v4 = new Numeral(5);
        Expression v5 = new Numeral(6);

        Expression c1 = new Square(v1);
        Expression c2 = new Addition(c1, v2);
        Expression c3 = new Multiplication(v3, c2);
        Expression c4 = new Division(v4, c3);
        Expression c5 = new Subtraction(c4, v5);
        try{
            System.out.println(c5 + " =" + c5.evaluate());
        }
        catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }
    }
}
