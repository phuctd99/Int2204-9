
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Utils {
	

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
