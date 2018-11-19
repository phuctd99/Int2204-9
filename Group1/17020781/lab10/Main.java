package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public List<String> getAllFunctions(File path) throws FileException{
        List<String> result = new ArrayList<String>();
        if(path.exists()) {
            try {
                Reader r = new FileReader(path);
                int temp = -1;
                String s = "";
                char ch ;
                int count = 0, count2 = 0, count3 = 0, count4 = 0 , count5 = 2;
                while((temp = r.read()) != -1) {
                    ch = (char) temp;


                    if (count == 13) {
                        if (ch == '{') {
                            count2++;
                        }
                        if (ch == '}') {
                            count2--;
                        }
                        if (ch == '}' && count2 == 0) {
                            count = 0;
                            s += ch;
                            result.add(s);
                            s = "";
                            continue;
                        }
                        s += ch;
                        continue;
                    } else {
                        if(count3 == 2){
                            if(ch == '\n'){
                                count3 = 0;
                            }
                            continue;
                        }
                        if(ch == '/') count3++;
                        else count3 = 0;


                        if(count4 == 2){
                            if(ch == '*' || (count5 == 1 && ch == '/')) count5--;
                            else count5 = 2;
                            if(count5 == 0) count4 = 0;
                            continue;
                        }

                        if((ch == '/' && count4 == 0) || (count4 == 1 && ch == '*')) count4++;
                        else count4 = 0;

                    }

                    if ((ch == 'p' && count == 0) || (ch == 'u' && count == 1) ||
                            (ch == 'b' && count == 2) || (ch == 'l' && count == 3) ||
                            (ch == 'i' && count == 4) || (ch == 'c' && count == 5) ||
                            ((ch == ' '||ch == '\n') && count == 6) || (ch == 's' && count == 7) ||
                            (ch == 't' && count == 8) || (ch == 'a' && count == 9) ||
                            (ch == 't' && count == 10) || (ch == 'i' && count == 11) || (ch == 'c' && count == 12)
                    ) {
                        s += ch;
                        count++;
                    } else if(ch == ' ' && count == 7){

                    } else if(ch == '\n' && count == 7){
                       s += ch;
                    }
                    else {
                        count = 0;
                        s = "";
                    }

                }
            } catch (Exception e) {
                System.out.println("Error");
                result = null;
            }

        } else {
            System.out.println("Khong tim thay tep");
            result = null;
        }
        return result;
    }

    public String findFunctionByName(String name, File path) throws FileException{
        String result = "";
        if(path.exists()){
            try {
                Reader r = new FileReader(path);
                int temp = -1, k = 0, count1 = 0, count2 = 0, rest = 0;
                char ch;
                boolean noPara = false;
                StringTokenizer token = null, token2 = null;
                int pre = name.indexOf("(");
                int las = name.indexOf(")");
                String para = name.substring(pre + 1, las);
                para = para.replace(',',' ');
                if(!para.equals("")) {

                    token = new StringTokenizer(para);
                } else {
                    noPara = true;
                }
                String nameFunc = name.substring(0, pre);
                String paraTemp = "";
                while ((temp = r.read())!=-1){
                    ch = (char)temp;
                    if(k == pre){
                        if(ch == '{') count1++;
                        if(ch == '}') count1--;
                        if(ch == '}' && count1 == 0){
                            result += ch;
                            return result;
                        }

                        if(rest == 1) {
                            k = 0;
                            rest = 0;
                            continue;
                        }
                        if(ch == ')' && count1 == 0) {
                            count2 = 0;
                            paraTemp = paraTemp.replace(',',' ');
                            if(noPara){
                                if(paraTemp.equals("")){

                                } else{
                                    rest = 1;
                                    paraTemp = "";
                                    result = "Khong tim duoc function";
                                    continue;
                                }
                            } else {
                                token2 = new StringTokenizer(paraTemp);
                                if(token.countTokens() != token2.countTokens()/2){
                                    rest = 1;
                                    paraTemp = "";
                                    result = "Khong tim duoc function";
                                    continue;
                                }

                                while (token2.hasMoreTokens()){
                                    if(token2.nextToken().equals(token.nextToken())) {
                                        token2.nextToken();
                                    } else {
                                        paraTemp = "";
                                        result = "Khong tim duoc function";
                                        rest = 1;
                                        break;
                                    }
                                }

                            }
                        }
                        if(count2 == 1) paraTemp += ch;
                        if(ch == '(') count2 = 1;

                        result += ch;
                        continue;
                    }
                    if(ch == name.charAt(k)){
                        ++k;
                    } else {
                        k = 0;
                    }
                    if(pre == k) result = nameFunc;
                }

            } catch (Exception e){
                System.out.println("Error2");
                System.out.println(e.getStackTrace());
            }
        } else {
            System.out.println("File khong ton tai");

        }
        return result;
    }

    public static void main(String[] args) throws FileException {
	// write your code here
        File file = new File("res/Utils.java");
        List<String> test = new Main().getAllFunctions(file);
        System.out.println(test.size());

        System.out.println(test.get(0));
        String s = new Main().findFunctionByName("String test()", file);
        System.out.println(s);
    }
}
