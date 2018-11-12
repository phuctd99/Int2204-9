import java.io.*;

public class Utils {
    static String readContentFromFile ( String path ) throws IOException {
        File file = new File(path); // khai báo file,
        String result = "";

            FileReader fileReader = new FileReader(file); // khai báo lớp tiện lợi đọc , tiện lợi ghi là FileWriter
            BufferedReader bufferedReader = new BufferedReader(fileReader); // khai báo biến đọc đệm từ tiện lợi đọc


            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
//                String[] EN_VI = line.split("\t");
                result += line + "\n";
            }
            bufferedReader.close();
            fileReader.close();

        return result;
    }
//    void
    static void writeContentToFile ( String path ) throws IOException{
        File file = new File(path);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(path); // viết vào đường dẫn
            /*
            * tạo Scanner nhập dữ liệu
            * */

            bufferedWriter.close();
            fileWriter.close();
    }

    static void finFile ( String source, String key) {
        File file = new File(source);
        if (file.exists()) {
            if (file.isFile()) { // kiểm tra nếu là FIle thì
                if (file.getName().endsWith(key)) { // kiểm tra nếu trùng tên thì
                    System.out.println("\n" + file.getAbsolutePath()); // in ra đường dẫn
                    return;
                }
                else {
                    System.out.println("\n file k tồn tại trong đường dẫn " + file.getAbsolutePath());
                    return;
                }
            }
            File[] listFile = file.listFiles(); // lấy danh sách các folder và file
            if (listFile != null) {
                for (File f : listFile) {
                    finFile(f.getAbsolutePath(), key); // đệ quy để tìm trong cả folder con của path
                }
            }
        } else {
            System.out.println("\nsource không tồn tại");
        }
    }

    static void find ( String source, String key ) {
            File dir = new File(source);
            String[] children = dir.list();
            if (children == null) {
                System.out.println("does not exist or is not a directory");
            }
            else {
                for (int i = 0; i < children.length; i++) {
                    if(key.equals(children[i])) {
                        String filename = children[i];
                        System.out.println(filename);
                    }
                }
            }
        }


    public static void main ( String[] args) {
        finFile("C:\\Users\\zeroa\\IdeaProjects\\oop_tuan9_IO\\src\\Utils.java","Utils.java");
    }
}
