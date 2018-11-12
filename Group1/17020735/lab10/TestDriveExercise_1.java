/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.File;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TestDriveExercise_1 {

    public static void main(String[] args) {
        File path = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Lab09\\src\\Utils.java");
        Exercise_1 exercise_1 = new Exercise_1();
        List<String> listFuntion = exercise_1.getAllFunctions(path);
        for (int i = 0; i < listFuntion.size(); i++) {
            System.out.println(listFuntion.get(i));
        }
        System.out.println(exercise_1.findFunctionByName("findFileByName(String)"));
    }
}
