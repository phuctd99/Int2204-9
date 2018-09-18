/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduceOOP;

import java.util.ArrayList;


/**
 *
 * @author CACLV
 */
public class StudentManagement1 {

    /**
     *
     */
    public static ArrayList<Student> students = new ArrayList();
    
    public static void main(String[] args) {
        Student firstStudent= new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();
        students.add(firstStudent);
        
        firstStudent.setName("Le Cong Ky");
        firstStudent.setId("17020842");
        firstStudent.setGroup("123");
        firstStudent.setEmal("duykypaul@gmail.com");
        
        
        secondStudent.setName("Le Duy Ky");
        secondStudent.setId("17020842");
        secondStudent.setGroup("123");
        secondStudent.setEmal("duongthienhan95@gmail.com");
        
        thirdStudent.setName("Duong Thien Han");
        thirdStudent.setId("17020849");
        thirdStudent.setGroup("456");
        thirdStudent.setEmal("duongthienhan@gmail.com");
        
        
        
        /*System.err.println(firstStudent.getName());
        System.out.println(firstStudent.getInfor());
        System.out.println(sameGroup(firstStudent, secondStudent));*/
        students.add(secondStudent);
        students.add(thirdStudent);
        //studentsByGroup();
        //System.out.println(students.size());
        String s = "17020842";
        
        studentsByGroup();
        removeStudent(s);
        System.out.println("\n\n");
        studentsByGroup();
        //System.out.println(students.size());
   }
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    public static void cout() {
        students.forEach((student) -> {
            System.out.println(student.getInfor());
        });
    }
    public static void studentsByGroup(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add(students.get(0).getGroup());
        for(int i = 1; i < students.size(); i++){
            String group = students.get(i).getGroup();
            if(arr.get(arr.size() - 1) == null ? group != null : !arr.get(arr.size() - 1).equals(group)) arr.add(group);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Group: " + arr.get(i));
            for (int j = 0; j < students.size(); j++) {
                if (arr.get(i).equals(students.get(j).getGroup())){
                    System.out.println(students.get(j).getInfor());
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    public static void removeStudent(String id) {
        Student studentRe = null;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId().equals(id)){
                studentRe = students.get(i);
                break;
            }
        }
        if(studentRe != null){
            students.remove(studentRe);
        }
        else System.out.println("id = " + id + " not existed. \n");
    }
}
