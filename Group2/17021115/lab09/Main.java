package Week9;

import java.io.File;
import java.io.IOException;

public abstract class Main {

	public static void main(String[] args) {
		String[] list = { "hello world!", "what your name?", "how are you?" };
		File file = new File("C:\\Users\\TUNG318\\Desktop\\Data.txt");

		// phần b
		if(file.length() == 0) {
			System.out.println("File chưa có nội dung");
			Utils.writeContentToFile(file.getAbsolutePath(), list);
			
		}
		else {
			System.out.println("File đã có nội dung:  ");
			String duLieuTuFile = Utils.readContentFromFile(file.getAbsolutePath());
			System.out.println(duLieuTuFile);
			Utils.writeContentToFile(file.getAbsolutePath(), list);
			System.out.println("Nội dung file lúc sau: ");
			System.out.println(Utils.readContentFromFile(file.getAbsolutePath()));
		}
		
		// phần c
		Utils.themNoiDungFile(file.getAbsolutePath(), list);
		System.out.println(Utils.readContentFromFile(file.getAbsolutePath()));

		// phần d
		try {
			File findFile = Utils.findFileByName("C:\\\\Users\\\\TUNG318\\\\Desktop", "Data.txt");
			System.out.println(findFile.getName() + " có trong folder");
		} catch (Exception e) {
			System.out.println("Không có file này trong folder");
		}

	}

}
