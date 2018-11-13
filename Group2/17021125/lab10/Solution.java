import java.io.*;
import java.util.*;

public class Solution {
	public static String readFromFile(File path){
		String s ="";
		try {
			File file = path;
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String textInLine = br.readLine();
			while (textInLine != null){
				if( textInLine!= ""){
					s+= textInLine +"\n";
				}
				textInLine = br.readLine();
			}
			br.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}
	public static List<String> getAllFunction(File path) {
		List<String> listFunction = new ArrayList<>();
		String[] listString = readFromFile(path).split("\n");

		Stack<String> stack = new Stack<>();
		String function = "";
		for (int i = 0; i < listString.length; i++){
			if (listString[i].contains("static")){
				stack.push("{");
			}
			if (!stack.empty()){
				function += listString[i] + "\n";
				if (listString[i].contains("}")){
					stack.pop();
				}
			} else {
				if (!function.equals("")){
					listFunction.add(function);
				}
				function = "";
			}
		}
		return listFunction;
//		List<String> list = new ArrayList<String>();
//		String s ="";
//		try {
//			File file = path;
//			FileReader fileReader = new FileReader(file);
//			BufferedReader in = new BufferedReader(fileReader);
//			String line = in.readLine();
//
//			while(line != in.readLine())
//			{
//				String st = line.trim();
//				if(st.startsWith("public static"))
//				{
//					list.add(st);
//				}
//				s=s+line+"\n";
//				line = in.readLine();
//			}
//			in.close();
//		}
//		catch (Exception e) {
//		}
//		return list;
	}
	public static String findFunctionByName(String name){
		String s ="";
		int dem1 = 0;
		int dem2 = 0;
		int count = name.indexOf("(");
		String st = name.substring(0,count);
		int i = 0;
		try {
			File file = new File("D:\\bai1_lab10\\src\\utils.java");
			FileReader fileReader = new FileReader(file);
			BufferedReader in = new BufferedReader(fileReader);
			String line ;

			while(( line = in.readLine()) != null){
				if(line.contains(st)){
					i++;
				}
				if(i > 0)
				{
					s = s+ line + "\n";
					if(line.contains("{"))
					{
						dem1 ++;
					}
					else if(line.contains("}"))
					{
						dem2 ++;
					}
					if(dem1 == dem2 && dem1 != 0) {
						break;
					}
				}
			}
			in.close();
		}
		catch (Exception e) {
			System.out.println(s);
		}
		return s;
	}
	public static void main(String[] args) {
		File path= new File("C:\\Users\\CCNE\\Documents\\hello.txt ");
		List<String> listFunction = getAllFunction(path);
		for (String i : listFunction) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------------------");
		System.out.println(findFunctionByName("findFileByName(String, String)"));
	}
}
