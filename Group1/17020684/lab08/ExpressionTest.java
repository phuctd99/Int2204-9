
package tuan_8;
/*
*hoangvandinh
*/

public class ExpressionTest {
    public static void main(String[] args) throws ArithmeticException {
        Expression n1 = new Numeral(2); 
        Expression s1 = new Square(n1); 
        Expression n2 = new Numeral(0); 
        Expression x1 = new Division(n2, s1);
        Expression a1 = new Addition(s1, n2); 
        Expression s2 = new Square(a1); 
        
        System.out.println(n1.toString());
        System.out.println(s1.toString());
        System.out.println(n2.toString());
        System.out.println(a1.evaluate());
        System.out.println(s2);
        System.out.println(s2.evaluate());
        
        try {
            int value = x1.evaluate();
            System.out.println(x1.evaluate());
        } catch(ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }
        
    }
}
