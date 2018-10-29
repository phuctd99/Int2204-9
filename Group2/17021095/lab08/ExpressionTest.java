/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btt7_2;
public class ExpressionTest {
    public static void main(String[] args) {
        //khai bao cac so hang can thiet
		Expression num1 = new Numeral(2);
		Expression num2 = new Numeral(3);
		Expression num3 = new Numeral(4);
		Expression num4 = new Numeral(5);
		Expression num0 = new Numeral(0);
		//xu ly ngoai le
		try {
			Expression chia = new Division(num1, num0);
			System.out.println(chia.evaluate());
		} catch (Exception e) {
			System.out.println("Lỗi chia cho 0");
		}
		
		Expression s1 = new Square(num1); // bình phương của s1
		Expression s2 = new Subtraction(s1, num2);// hieu
		Expression s3 = new Multiplication(num3, num4);//tich
		Expression s4 = new Addition(s2, s3);//tong
		System.out.println(s4.toString() + " = " + s4.evaluate());
		
		
	}
}
