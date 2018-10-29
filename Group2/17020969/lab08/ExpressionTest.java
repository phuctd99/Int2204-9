public class ExpressionTest {
    public static void main(String args[]) throws ArithmeticException{
        Expression n1 = new Numeral(10); // nhap gia tri = 10
        Expression s1 = new Square(n1); // 10 binh phuong 
        
        Expression n2 = new Numeral(1); // nhap gia tri = 1
        Expression x = new Subtraction(s1, n2); //10^2 - 1
        
        Expression n3 = new Numeral(2); // nhap gia tri = 2
        Expression n4 = new Numeral(3); // nhap gia tri = 3
        Expression x1 = new Multiplication(n3, n4);// tich 2 * 3
        Expression a1 = new Addition(x, x1); // 10^2 - 1 + 2 * 3
        Expression s2 = new Square(a1); // (10^2 - 1 + 2 * 3)^2

        Expression n5 = new Numeral(0);
        Expression x2 = new Division(n1, n5); // thuong = 10 / 0
        System.out.println("Ket qua phep tinh (10^2 - 1 + 2 * 3)^2 = " + s2.evaluate());
        
        try {
            int value = x2.evaluate();
            System.out.println(value);
        } 
        catch(ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        }
    }
}