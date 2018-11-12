package Week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ultis {
	public static ArrayList<String> list = new ArrayList<>();

	public static String readContentFromFile(String path) {
		String duLieuOfFile = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String s = "";
			String line = br.readLine();
			while (line != null) {
				s += line + "\n";
				line = br.readLine();
			}
			duLieuOfFile = s;
			br.close();
			isr.close();
			fis.close();
			return duLieuOfFile;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void writeContentToFile(String path, String[] duLieu) {
		try {
			FileOutputStream fos = new FileOutputStream(path, false); // false là cho ghi đè
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			for (String s : duLieu) {
				String line = s;
				bw.write(line);
				bw.newLine();

			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void themNoiDungFile(String path, String[] duLieu) {
		try {
			FileOutputStream fos = new FileOutputStream(path, true); // true là thêm tiếp vào nội dung ban đầu
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			bw.newLine();
			for (String s : duLieu) {
				String line = s;
				bw.write(line);
				bw.newLine();

			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static File findFileByName(String folderPath, String fileName) throws NullPointerException{
		File file = new File(folderPath);
		File[] listFile = file.listFiles(); // trả về danh sách các file trong folder
		File ketQua = null;
		for (File f : listFile) {
			if (f.getName().equals(fileName)) {
				ketQua = f;
				break;
			}
		}
		return ketQua;
	}
}