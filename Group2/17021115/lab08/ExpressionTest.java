package Week8;

public class ExpressionTest {

	public static void main(String[] args) {
		// (10^2 - 1 + 2*3)^2
		Expression num1 = new Numeral(10);
		Expression num2 = new Numeral(1);
		Expression num3 = new Numeral(2);
		Expression num4 = new Numeral(3);
		Expression num0 = new Numeral(0);
		
		try {
			Expression chia = new Division(num1, num0);
			System.out.println(chia.evaluate());
		} catch (Exception e) {
			System.out.println("Lỗi chia cho 0");
		}
		
		Expression s1 = new Square(num1); // bình phương của s1
		Expression s2 = new Subtraction(s1, num2);
		Expression s3 = new Multipcation(num3, num4);
		Expression s4 = new Addtion(s2, s3);
		Expression ketQua = new Square(s4);
		System.out.println(ketQua.toString() + " = " + ketQua.evaluate());
		
		
	}

}
