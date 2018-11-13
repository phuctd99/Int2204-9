import java.io.*;
import java.util.Scanner;


public class utils {

	public static String readContentFromFile(String path) throws IOException {
		String text = "";
		File file = new File(path);
		FileReader fileReader = new FileReader(file);
		BufferedReader in = new BufferedReader(fileReader);
		String line;
		try {
			while((line = in.readLine())!=null){
				text = text + line + "\n";
			}
		} catch (Exception a) {
			System.out.println(a);
		}
		return text;
	}

	public static void writeContentToFile1(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập nội dung: ");
		String s = sc.nextLine();
		try {
			File file = new File(path);
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter out = new BufferedWriter(fileWriter);
			out.write(s);
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void writeContentToFile2(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String s = sc.nextLine();
		try {
			File file = new File(path);
			FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter out = new BufferedWriter(fileWriter);
			out.newLine();
			out.append(s);
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static File findFileByName(String folderPath, String fileName){
		File file = new File(folderPath);
		File[] files = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.equals(fileName);
			}
		});
		return files.length != 0 ? files[0] : null;

	}

	public static void main(String[] args) throws IOException {
		String in = "C:\\Users\\CCNE\\Documents\\hello.txt";
		String out1 =  "C:\\Users\\CCNE\\Documents\\hello.txt";
		String out2 =  "C:\\Users\\CCNE\\Documents\\hello.txt";
		String s = readContentFromFile(in);
		System.out.println(s);
		System.out.println("------------------------------");
		writeContentToFile1(out1);
		System.out.println("------------------------------");
		writeContentToFile2(out1);
		System.out.println("------------------------------");
		String path1 = "C:\\Users\\CCNE\\Documents";
		String path2 = "hello.txt";
		if(findFileByName(path1,path2)==null){
			System.out.println("Không  tìm thấy file!");
		}
		else System.out.println(findFileByName(path1,path2));
	}
}
