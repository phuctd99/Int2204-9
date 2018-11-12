/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Exercise_1 {

    public List<String> getAllFunctions(File path) {
        List<String> listFunction = new ArrayList();
        int check = 0;
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String temp = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("    public static") && line.endsWith("{")) {
                    check = 1;
                }
                if (line.equals("")) {
                    check = 0;
                }
                if (check == 1) {
                    temp = temp.concat(line + "\r\n");
                } else {
                    if (temp.equals("") == false) {
                        listFunction.add(temp);
                    }
                    temp = "";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listFunction;
    }

    public String findFunctionByName(String name) {
        File path = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Lab09\\src\\Utils.java");
        int indexOfOpenParenthesis = name.indexOf('(');
        int indexOfCloseParenthesis = name.indexOf(')');
        String[] arr = name.substring(indexOfOpenParenthesis + 1, indexOfCloseParenthesis).split(",");
        String arrToString = "";
        String functionName = name.substring(0, indexOfOpenParenthesis + 1);
        int check = 0;
        int indexOfName = -1;
        boolean control = false;
        String temp = "";
        
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("    public static") && line.endsWith("{")) {
                    check = 1;
                    indexOfName = line.indexOf(functionName);
                    if (indexOfName != -1) {
                        indexOfOpenParenthesis = line.indexOf('(');
                        indexOfCloseParenthesis = line.indexOf(')');
                        String parameters = line.substring(indexOfOpenParenthesis + 1, indexOfCloseParenthesis);
                        String []arr1 = parameters.trim().split("[+ ]");
                        parameters = "";
                        for (int i = 0; i < arr1.length; i++) {
                            if (i % 2 == 0) {
                                parameters = parameters.concat(arr1[i]);
                            }
                        }
                        for (int i = 0; i < arr.length; i++) {
                            arrToString = arrToString.concat(arr[i]);
                        }
                        if (arrToString.equals(parameters))
                            control = true;
                    }
                }
                if (line.equals("")) {
                    check = 0;
                }
                if (check == 1 && indexOfName != -1 && control) {
                    temp = temp.concat(line + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
