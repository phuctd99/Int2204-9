/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author Admin
 */
public class ExpressionTest {
      public static void main(String[] args) {
                Expression num0 = new Numeral(0);
		Expression num1 = new Numeral(-1);
		Expression num2 = new Numeral(1);
		Expression num3 = new Numeral(5);
		Expression num4 = new Numeral(10);
		//xu ly ngoai le chia cho 0
		try {
			Expression chia = new Division(num1, num0);
			System.out.println(chia.evaluate());
		} catch (Exception e) {
			System.out.println("Erorr !");
		}
		Expression s1 = new Square(num1); 
		Expression s2 = new Subtraction(s1, num2);
		Expression s3 = new Multiplication(num3, num4);
		Expression s4 = new Addition(s2, s3);
		System.out.println(s4.toString() + " = " + s4.evaluate());	
	}
}
