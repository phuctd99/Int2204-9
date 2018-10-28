package Week8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bai2 {
	public static void phepChia() throws ArithmeticException {
		System.out.println(5/0);
		throw new ArithmeticException();
	}

	public static void epKieu() throws ClassCastException {
		Object obj = "Hello";
		Integer num = (Integer) obj;
		throw new ClassCastException();
	}

	public static void inHoa(String s) throws NullPointerException {
		s = s.toUpperCase();
		throw new NullPointerException();
	}

	public static void Array() throws ArrayIndexOutOfBoundsException {
		int[] arr = {0, 1};
		System.out.println(arr[3]);
		throw new ArrayIndexOutOfBoundsException();
	}
	public static void docFile() throws Exception {
		FileReader fr = new FileReader("test.txt");
		fr.read();
		throw new Exception();
	}
	public static void main(String[] args) {
		try {
			phepChia();
		} catch (Exception e) {
			System.out.println("Lỗi chia cho 0");
		}

		try {
			epKieu();
		} catch (Exception e) {
			System.out.println("Lỗi không thể gán kiểu  về nhỏ hơn");
		}

		try {
			inHoa(null);
		} catch (Exception e) {
			System.out.println("Không có giá trị");
		}
		
		try {
			Array();
		} catch (Exception e) {
			System.out.println("Vượt quá số lượng phần tử");
		}
		
		try {
			docFile();
		} catch (Exception e) {
			System.out.println("Lỗi không có file");
		}
	}
}
