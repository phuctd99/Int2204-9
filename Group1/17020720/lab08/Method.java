package ExceptionTuan8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Method {
    private String a;

    public Method(){

    }

    public String testMethod(){
        return null;
    }

    public int testArray(int arr[]){
        return arr[5];
    }

    public int testClassCast(Object s) throws ClassCastException{
        s = 12.5;
        return (int)s;
    }

    String fileName = "Input.txt";
    public void readFile(String fileName) throws IOException, FileNotFoundException{
        BufferedReader br;
        FileReader f = new FileReader("Input.txt");
        br = new BufferedReader(f);
        System.out.println(br.lines());
    }


}
