package lab09;
import java.io.*;
import java.util.*;
class Utils {
	

    public static String readContentFromFile(String path) {
        String result = null;
	try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String s = "";
            String line = br.readLine();
            while (line != null) {
		s = s + line + "\n";
		line = br.readLine();
            }
            result = s;
            br.close();
            isr.close();
            fis.close();
            return result;
	} catch (Exception e) {
            e.printStackTrace();
	}
            return "";
	}

    public static void writeContentToFile(String path, String[] data) {
	try {
            FileOutputStream fos = new FileOutputStream(path, false);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for (String s : data) {
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

    public static void addContentToFile(String path, String[] data) {
	try {
            FileOutputStream fos = new FileOutputStream(path, true); 
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.newLine();
            for (String s : data) {
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

    public static File findFileByName(String folderPath, String fileName) {
	File file = new File(folderPath);
	File[] listFile = file.listFiles(); // tao mang luu danh sach cac file trong thu muc
	File result = null;
	for (File f : listFile) {
            if (f.getName().equals(fileName)) {
		result = f;
		break;
            }
	}
	return result;
	}
}

public class Lab09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] list = { "We are the wolrd", "We are the children", "We are the champions" };
        String[] list2 = {"Don’t cry because it’s over, smile because it happened"};
            File file = new File("D:\\Documents\\Text.txt");

            if(file.length() == 0) {
		System.out.println("File chưa có nội dung");
		Utils.writeContentToFile(file.getAbsolutePath(), list);
			
            } else {
                    System.out.println("File đã có nội dung:  ");
                    String content = Utils.readContentFromFile(file.getAbsolutePath());
                    System.out.println(content);
                    Utils.writeContentToFile(file.getAbsolutePath(), list);
                    System.out.println("Nội dung file lúc sau: ");
                    System.out.println(Utils.readContentFromFile(file.getAbsolutePath()));
            }
            Utils.addContentToFile(file.getAbsolutePath(), list2);
            System.out.println(Utils.readContentFromFile(file.getAbsolutePath()));
            try {
		File findFile = Utils.findFileByName("D:\\Documents", "Text.txt");
		System.out.println(findFile.getName() + " có trong thư mục");
            } catch (Exception e) {
		System.out.println("Không có file này trong thư mục");
            }

	}
}
