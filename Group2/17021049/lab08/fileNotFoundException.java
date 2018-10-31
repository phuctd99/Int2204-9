package bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileNotFoundException {

    public void write() throws FileNotFoundException {
        File file = new File("MU.txt");
        Scanner sc = new Scanner(file);
    }

    public static void main(String[] args){

        try {
           fileNotFoundException f = new fileNotFoundException();
           f.write();
        }
        catch (Exception e){
            System.out.println("fileNotFoundException");
        }
    }

}
