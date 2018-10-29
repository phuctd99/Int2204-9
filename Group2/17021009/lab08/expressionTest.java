package Cau1;


public class expressionTest {
    public static void main(String[] args) {
        expression n1 = new numeral(0);
        expression n2 = new numeral(1);
        expression n3 = new numeral(3);
        expression n4 = new numeral(10);
        expression n5 = new numeral(2);

        try {
            expression division = new division(n2, n1);
            System.out.println( division.toString() + "=" + division.evaluate());
        } catch(Exception e) {
            System.err.println("ERROR: lỗi chia cho 0");
        }

        //10^2
        expression square1 = new square(n4);
        expression sq = new numeral(square1.evaluate());

        //10^2-1
        expression substraction = new subtraction(sq, n2);
        expression sub = new numeral(substraction.evaluate());

        //2*3
        expression multiplication = new multiplication(n5, n3);
        expression multi = new numeral(multiplication.evaluate());

        //10^2-1+2*3
        expression addtion = new addition(sub, multi);
        expression add = new numeral(addtion.evaluate());

        //(10^2-1+2*3)^2
        expression square2 = new square(add);
        int result = square2.evaluate();
        System.out.println("(10^2 - 1 + 2*3)^2 = " + result);
    }
}
