import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {
    public void readFile() throws IOException {
        FileReader fw = new FileReader("mydata.txt");

        fw.close();
    }

    public static void main(String args[]) {
        try {
            FileNotFoundException se5 = new FileNotFoundException();
            se5.readFile();
        } catch (IOException e) {

    }
}
}
