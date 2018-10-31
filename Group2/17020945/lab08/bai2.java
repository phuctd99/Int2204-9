import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class bai2 {
	public String Arr (String [] arr) throws NullPointerException {
		return arr[arr.length];
	}

	public int Division(int a , int b) throws ArithmeticException{
		return a / b;
	}

	public int toInt (Object s) throws ClassCastException{
		return (int) s;
	}

	public int ArrIndex (int arr) throws ArrayIndexOutOfBoundsException {
		return arr;
	}

	public void ReadFile () throws FileNotFoundException{
		File dict = new File("dictionaries.txt");
		Scanner sc = new Scanner(dict, "utf-8");
		while (sc.hasNextLine())
		{
			String fullLine = sc.nextLine();
			String[] split = fullLine.split("\t");
			// tao tu moi
			System.out.println(split[0]);
		}
	}

	public void Read () throws IOException{
		File dict = new File("dictionaries.txt");
		Scanner sc = new Scanner(dict, "utf-8");
		while (sc.hasNextLine())
		{
			String fullLine = sc.nextLine();
			String[] split = fullLine.split("\t");
			// tao tu moi
			System.out.println(split[0]);
		}
	}
	public static void main(String[] args) {
		bai2 ee = new bai2();
		try {
			System.out.println(ee.Division(2, 0));
			System.out.println("-----------------------------------");
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("-----------------------------------");
		}
		String[] s = null;
		try {
			System.out.println(ee.Arr(s));
			System.out.println("-----------------------------------");
		}
		catch(NullPointerException e){
			System.out.println(e);
			System.out.println("-----------------------------------");
		}
		int [] arr =  new int [10];
		try {
			arr[22] = 10;
			System.out.println(ee.ArrIndex(arr[22]));
			System.out.println("-----------------------------------");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("-----------------------------------");
		}
		try{
			System.out.println(ee.toInt("abc"));
			System.out.println("-----------------------------------");
		}
		catch (ClassCastException e){
			System.out.println(e);
			System.out.println("-----------------------------------");
		}
		try{
			ee.Read();
			System.out.println("-----------------------------------");
		}
		catch(IOException e){
			System.out.println(e);
			System.out.println("-----------------------------------");

		}
	}
}
