/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

public class StudentManagement {
    Student[] students = new Student[100];
    public boolean sameGroup(Student s1, Student s2){//xem 2 sv co cung lop hay k;
        if (s1.getGroup().equals(s2.getGroup())) return true;
        else return false;
    }
    
   
    public static void main(String []args){
        StudentManagement test = new StudentManagement();
        int soLuongSinhVien = 3;
        for(int i = 0; i<soLuongSinhVien; i++){
            test.students[i] = new Student();
            test.students[i].setInfo();
        }
        for(int i = 0; i<soLuongSinhVien; i++){
            System.out.println(test.students[i].getInfo());
        }
        
        // test hàm sameGroup (kiểm tra sv thứ 1 và sinh viên thứ 2 có cùng lớp không)
        if(test.sameGroup(test.students[0], test.students[1])==true){
       
            System.out.println("Cùng lớp");
        } 
        else
            System.out.println("Khác lớp");

    }        
}