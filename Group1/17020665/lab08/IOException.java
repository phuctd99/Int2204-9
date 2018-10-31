import java.io.File;
import java.util.Scanner;

public class IOException {

    public static void InserFromFile(){
        File f = new File("x.txt");
        try (Scanner sc = new Scanner(f)) {
            System.out.print("Success");
        } catch (java.io.IOException e){
            System.err.print("Can't open");
        }
    }
}
