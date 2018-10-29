package Try_Catch_Throw;

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class ExpressionTest{
	
	private static BufferedReader file;
	
	public void IOException(){
		try {
        	File f = new File("Test.txt");
        	if(!f.exists()){
                f.createNewFile();
            }
            FileWriter file = new FileWriter(f);
            try (Writer out = new BufferedWriter(file)) {
                out.write("Ly Minh Nghia");
            }
            System.out.println(f.getAbsoluteFile());
        }catch(IOException e){
            e.printStackTrace();
        }
	}
	
	public void FileNotFoundException() throws IOException {
		ArrayList<String> data = new ArrayList<String>();
        String read;
        try{
            File f = new File("test.txt");
            file = new BufferedReader(new FileReader(f));
            if (!file.ready()){
                throw new IOException();
            }
            while((read=file.readLine())!=null){
                data.add(read);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        for (int i = 0;i < data.size();i++){
            System.out.println(data.get(i).toString());
        }
	}
	
	
	public void NullPointerException () {
		
 
        String str2 = null;
        try{
        	str2.length();
        }catch (NullPointerException e) {
        	e.printStackTrace();
        }
        System.out.println("Finish NullPointerException");
	}
	
	public void ArrayIndexOfBoundException () {
		String[] strs = new String[] { "One", "Two", "Three" };
        String str1 = strs[0];
 
        System.out.println("String at Zero = " + str1);
        try{
        	String str2 = strs[5];
            System.out.println("String at Five = " + str2);
        }catch(ArrayIndexOutOfBoundsException e) {
        	e.printStackTrace();
        }
        
	}
	public void ClassCastException() {
		Object dog = new Object();
		try {
			Rectangle rect = (Rectangle) dog;
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException{
		ExpressionTest ExT = new ExpressionTest();
		//10^2
        int ex1 = new Square(new Numeral(10)).evaluate();

        //2*3
        int ex2 = new Multiplication(new Numeral(2), new Numeral(3)).evaluate();

        //10^2 - 1
        int ex3 = new Subtraction(new Numeral(ex1), new Numeral(1)).evaluate();

        //10^2 - 1 + 2*3
        int ex4 = new Addition(new Numeral(ex3), new Numeral(ex2)).evaluate();

        //(10^2 - 1 + 2*3)^2
        int result = new Square(new Numeral(ex4)).evaluate();
        System.out.println(result);

        /// Test divide by zero
        try {
            int ex = new Division(new Numeral(5), new Numeral(0)).evaluate();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        
        ExT.IOException();
        ExT.FileNotFoundException();
        ExT.NullPointerException();
        ExT.ArrayIndexOfBoundException();
        ExT.ClassCastException();
	}

}
