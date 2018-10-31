public class ExpressionTest {
	public static void main(String args[]) throws ArithmeticException{
		Expression n1 = new Numeral(12); // nhap gia tri = 12
		Expression s1 = new Square(n1); // 12 binh phuong

		Expression n2 = new Numeral(2); // nhap gia tri = 2
		Expression x = new Subtraction(s1, n2); //12^2 - 2

		Expression n3 = new Numeral(3); // nhap gia tri = 3
		Expression n4 = new Numeral(2); // nhap gia tri = 2
		Expression x1 = new Multiplication(n3, n4);// tich 2 * 3
		Expression a1 = new Addition(x, x1); // 12^2 - 2 + 2 * 3
		Expression s2 = new Square(a1); // (12^2 - 2 + 2 * 3)^2

		Expression n5 = new Numeral(0);
		Expression x2 = new Division(n1, n5); // thuong = 12 / 0
		System.out.println("Ket qua phep tinh (12^2 - 2 + 2 * 3)^2 = " + s2.evaluate());
		System.out.println("------------------------------------------------");
		try {
			int value = x2.evaluate();
			System.out.println(value);
		}
		catch(ArithmeticException e) {
			System.out.println("Ket qua phep tinh 12/0 :");
			System.out.println("Loi chia cho 0");
		}
	}
}