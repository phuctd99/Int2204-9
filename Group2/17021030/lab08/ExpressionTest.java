package lab08;

public class ExpressionTest {
    // class dung de test bieu thuc
    public static void main(String[] args) {
        // tao ra cac so hang co ban trong bieu thuc
        Expression num_0 = new Numeral(0); // xet truong hop chia 0
        Expression num_1 = new Numeral(1);
        Expression num_2 = new Numeral(2);
        Expression num_3 = new Numeral(3);
        Expression num_10 = new Numeral(10);
        
        Expression sqr_10 = new Square(num_10); // 10^2
        Expression mul_2n3 = new Multiplication(num_2, num_3); // 2*3
        Expression dif = new Subtraction(sqr_10, num_1); // 10^2 - 1
        Expression sum = new Addition(dif, mul_2n3); // 10^2 - 1 + 2*3
        Expression sqr_of_sum = new Square(sum); // (10^2 - 1 + 2*3)^2
        
        // xu li ngoai le khi chia 0
        try {
            Expression division = new Division(sqr_of_sum, num_0);
            System.out.println(division.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Error! Divide by zero");
        }
        
        // hien thi ket qua
        System.out.println("Hien thi phep tinh va ket qua: ");
        System.out.println(sqr_of_sum.toString() + " = " + sqr_of_sum.evaluate());
    }
}
