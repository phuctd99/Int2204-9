/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab10 {

    List<String> getAllFuntions(File path) throws FileNotFoundException {
        List<String> AllFuntions = new ArrayList<>();
        FileInputStream in = new FileInputStream(path);
        Scanner sc = new Scanner(in);
        while (sc.hasNextLine()) {
            String f = sc.nextLine();
            f.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");
            f.replaceAll("(\\\\\\\\.*)","");
            if (f.contains("static")) {
                String funtion = "";
                funtion += f;
                funtion += "\n";
                while (sc.hasNextLine()) {
                    String a = sc.nextLine();
                    funtion += a;
                    funtion += "\n";
                    if (a.equals("")) {
                        break;
                    }
                }
                AllFuntions.add(funtion);
            }
        }
        return AllFuntions;
    }

    public String findFunctionByName(String name) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(new File("Utils.java")));
        boolean check = false;
        String funtion = "";
        while (sc.hasNextLine()) {
            String f = sc.nextLine();
            if (f.contains(name)) {

                funtion += f;
                while (sc.hasNextLine()) {
                    String a = sc.nextLine();
                    funtion += a;
                    if (a.equals("")) {
                        break;
                    }
                }
                check = true;

            }
        }
        if (check) {
            return funtion;
        }
        return "khong co ham can tim";
    }

    public void bubbleSort(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Lab10 test = new Lab10();
        //test cau 1
        try {
            List<String> arr = test.getAllFuntions(new File("Utils.java"));
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai");
        }
//        try {
//            System.out.println(test.findFunctionByName("findFileByName(String folderPath, String fileName)"));
//        } catch (FileNotFoundException ex) {
//            System.out.println("File khong ton tai");
//        }
//        
//        //test cau 2
//        double arr[] = new double[1000];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Math.random() * 10000 + 1;
//        }
//        test.bubbleSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

}
