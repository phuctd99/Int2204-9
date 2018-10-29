package bt1;

public class ExpressionTest {
    public static void main(String args[]){
//        Numeral numeral = new Numeral(15);
//        System.out.println(numeral.toString());


            Expression ex1 = new Numeral(30);

            Expression ex2 = new Numeral(0);

//            Addition addition = new Addition(ex1, ex2);
//            System.out.println(addition.evaluate());

//            Multiplication multiplication = new Multiplication(ex1, ex2);
//            System.out.println(multiplication.evaluate());

                Division division = new Division(ex1, ex2);
                try {
                    int value = division.evaluate();
                    System.out.println(value);
                }
                catch (java.lang.ArithmeticException e){
                    System.out.println("chia cho 0 ?!");
                }
    }
}
