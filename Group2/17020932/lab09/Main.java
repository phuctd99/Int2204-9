import java.io.*;

public class Main {
    public static String readContentFromFile(String path) {
        String result = "";
        String tmp;
            try {
                File infile = new File(path);
                BufferedReader bf = new BufferedReader(new FileReader(infile));
                tmp = bf.readLine();
                while (tmp != null) {
                    result = result + tmp + "\n";
                    tmp = bf.readLine();
                }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void writeContentToFile1(String path) {
        String s = "djfnksjdnvkdsvn;dsvmsdv";
        File outFile = new File(path);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
            bw.write(s);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContentToFile2(String path) {
        String s = "12321343423423131232";
        File outFile = new File(path);
        //FileWriter fileWriter = new
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile.getAbsoluteFile(), true));
            bw.newLine();
            bw.append(s);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File[] arrayFile = file.listFiles();
        if(arrayFile == null)   return null;
        else {
            for(int i=0; i<arrayFile.length; i++) {
                if(arrayFile[i].getName().compareTo(fileName) == 0)
                    return arrayFile[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\ADMIN\\test.txt";
//        System.out.println(readContentFromFile(path));
//
//        writeContentToFile1(path);
//
//        writeContentToFile2(path);

        if(findFileByName("C:\\Users\\ADMIN","test.txt") == null) {
            System.out.println("file not found");
        }
        else System.out.println(findFileByName("C:\\Users\\ADMIN","test.txt").getName());

    }
}
