import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {
    final private static  String path = "C:\\Users\\Admin\\Documents\\file.txt";
    public static String readContentFromFile(String path){
        String text = "";
        try {
            FileReader file = new FileReader(path);
            Scanner sc = new Scanner(file);
            String str;
            while (sc.hasNext()) {
                str = sc.nextLine();
                text += str + "\n";
            }
            sc.close();
            return text;

        }
        catch (Exception ex) {
            System.out.println("Không có thư mục cần tìm");
        }
        return null;
    }

    public static void writeContentToFile(String path) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }

        Scanner sc = new Scanner(System.in, "UTF-8");
        String s = sc.nextLine();
        try {
            fileWriter.write(s);
            fileWriter.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println(s);
    }

    public static void writeaddContentToFile(String path) {
        String str = readContentFromFile(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

        Scanner sc = new Scanner(System.in, "UFT-8");
        String s = sc.nextLine();
        try {
            fileWriter.write(str + s);
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        System.out.println(s);
    }

    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File[] matchingFiles = file.listFiles(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                return name.equals(fileName);
            }
        });
        return matchingFiles.length != 0 ? matchingFiles[0] : null;
    }

    public static void main(String[] args) throws IOException {
        Utils ut = new Utils();
        System.out.println(ut.readContentFromFile(path));
//      ut.writeContentToFile(path);
//       ut.writeaddContentToFile(path);

    }
}
