/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.Scanner;

/**
 *
 * @author Tommmm^^
 */
public class StudentManagement {
    public Scanner scan = new Scanner(System.in);
     public Student students[] = new Student[100];
     int demStudent = 0;
     int index ;
      
    
       public void inputStudent(int n){
           demStudent = n;
           for( int i = 0; i < n; i++ ) {
            
            System.out.print("Name : ");
            String name = scan.nextLine();
            
            System.out.print(" ID: ");
            String id = scan.nextLine();
            
            System.out.print("Group: ");
            String group = scan.nextLine();
            
            System.out.print("Email: ");
            String email = scan.nextLine();
            
            students[i] = new Student(name, id, email, group);
        }
           
           
       }
       public boolean checkSameBefore(Student s, int end){
        for(int i = 0; i < end; i ++){
            if(sameGroup(s, students[i])){
                return true;
            }
        }
        return false;
    }
       public void studentsByGroup(){
           for(int i = 0; i < demStudent; i++){
               if(checkSameBefore(students[i], i) == false){
                System.out.println(" Lớp " + students[i].getGroup());
                for(int j = i; j < demStudent; j++){
                    if(sameGroup(students[i], students[j])){
                        students[i].getInfo();
                        
                    }
                }
            }
               
       }
       }
    public void removeStudent(String id){
        for(int i = 0; i < demStudent; i++){
            if(students[i].getId()== id){
                break;
            }
            index = i;
        }
        for(int i =index ; i < demStudent - 1; i++){
                students[i] = students[i+1];
            }
            demStudent = demStudent -1;
        }
        

   
    public static void main(String[] args) {
        StudentManagement StudentManagement = new StudentManagement();
        StudentManagement.inputStudent(3);
        StudentManagement.studentsByGroup();
        StudentManagement.removeStudent("3");
// Ý 1- 11 :        
//        Student sv1 = new Student();
//        sv1.setName("Vo Loc Anh");
//        sv1.setEmail("Volocanh102@gmail.com");
//        sv1.setGroup("IE9");
//        sv1.setId("1701");
//        System.out.println("Ten sinh vien : " +sv1.getName());
//        sv1.getInfo();
//        Student sv2 = new Student();
//        sv2.getInfo();
//        Student sv3 = new Student("SV3","003","email");
//        sv3.getInfo();
//        Student sv4  = new Student(sv3);
//        sv4.getInfo();
//       if (sameGroup(sv1,sv2)== true) System.out.println("2 sinh vien cung lop");
//       else System.out.println("2 sinh vien khac lop");
       
    
       
    }
    public static boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup() == s2.getGroup()) return true;
        else return false;
        
    }
}

    