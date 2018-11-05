import java.io.*;
import java.util.Date;

public class Utils {

	public static String readContentFromFile(String path) throws FileNotFoundException, IOException{
		//Tạo một đối tượng File đại diện cho một đường dẫn
		File file = new File(path); 

		//Kiểm tra sự tồn tại
		if(file.exists()){
                        Reader r = new FileReader(file);
                        int temp = -1;
                        String s = "" ;
                        while((temp = r.read()) != -1){
                            s += (char)temp;
                        }
                        return s;
		}
                else{
                    return "";
                }
		

	}
	public static void writeContentToFile(String path) throws IOException{
            File file = new File(path);
           
                try (Writer w = new FileWriter(file)) {
                    String s = "hello hihidasdasdasdas";
                    w.write(s);
                    w.close();
                }
           
        }

	public static void overWriteContentToFile(String path) throws IOException{
            File file = new File(path);
            if(file.exists()){
                Reader r = new FileReader(file);
                try (BufferedReader br = new BufferedReader(r)) {
                    String[] s = new String[5000];
                    int i = 0;
                    while((s[i] = br.readLine()) != null){
                        ++i;
                    }
                Writer w = new FileWriter(file);
                try (BufferedWriter bw = new BufferedWriter(w)) {
                    for(int j = 0; j < i; ++j){
                        bw.write(s[j]);
                    }
                    bw.newLine();
                    bw.write("lalala");
                }
                }
            }
	}
	public static File findFileByName(String folderPath, String fileName){
            File file = new File(folderPath);
            //Kiểm tra sự tồn tại
            if(file.exists()){
                    if(file.isDirectory()){
                        File[] children = file.listFiles();
                        for(File child : children){
                            if(child.getName().equals(fileName)){ 
                                return child;
                            }
                        findFileByName(child.getAbsolutePath(), fileName);
                        }
                    }
            }
            return file; //Trả về folder nếu ko tìm được
            
           	
	}
	public static void main(String[] args) throws IOException {
		String s = readContentFromFile("test.txt");
                System.out.println(s);
                writeContentToFile("test.txt");
                overWriteContentToFile("test.txt");
                
                File fileFound = findFileByName("temp","hello.txt");
                //Ten file
                if(fileFound.exists()){
                    System.out.println(fileFound.getName());
                    //Duong dan file
                    System.out.println(fileFound.getAbsolutePath());
                    //Kiem tra kich thuoc file
                    System.out.println(fileFound.length());
                    //Thoi diem sua lan cuoi
                    Date date = new Date(fileFound.lastModified());
                    System.out.println(date);
                }
                else{
                    System.out.println("File khong ton tai");
                }
                
	}
}