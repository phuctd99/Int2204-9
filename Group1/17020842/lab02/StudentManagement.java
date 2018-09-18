/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduceOOP;

import java.util.Scanner;

/**
 *
 * @author CACLV
 */
public class StudentManagement {

    public Student [] students = new Student[100];
    public int sizeStudents = 1;
    public Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
       //    // 2
        Student firstStudent = new Student(); // khai báo một đối tượng thuôc lớp Student
    //6 // khởi tạo thông tin cho đói tượng 
        firstStudent.setName("Le Cong Ky");
        firstStudent.setId("17020842");
        firstStudent.setGroup("K62 CL");
        firstStudent.setEmal("duykypaul@gmail.com");
        // in ra tên của đối tượng
        System.out.println(firstStudent.getName());
        // in toàn bộ thông tin của đối tượng sinh viên đó
        System.out.println(firstStudent.getInfor());
    // 8
        Student secondStudent = new Student(); // khai báo đối tượng (contructor ko biến)
       // khai báo đối tượng (contructor có tham số )
        Student thirdStudent = new Student("Phi Xuan Hoan", "17020759", "K61 CL", "hoanphi@gmail.com");
        // khởi tạo copy
        Student fourthStudent = new Student(thirdStudent); 
        // in thông tin ra màn hình
        System.out.println(secondStudent.getInfor()  + "\n\n" + thirdStudent.getInfor()  + "\n\n" + fourthStudent.getInfor());
        System.out.println("firstStudent và secondStudent cùng lớp: " + studentManagement.sameGroup(firstStudent, secondStudent));
        System.out.println("thirdStudent và fourthStudent cùng lớp: " + studentManagement.sameGroup(thirdStudent, fourthStudent));
        //studentManagement.inputStudents(1);
        studentManagement.students[0] = new Student(firstStudent);
        System.out.println(studentManagement.students[0].getName());
        //System.out.println();
        //studentManagement.removeStudent("17020842");
        System.err.println(studentManagement.students[0].same(firstStudent, secondStudent));
       // studentManagement.studentByGroup();
        
    
    }
    private Student firstStudent;
            
    
    // 9 kiểm tra hai đối tượng có cùng lớp hay ko true/false
    public boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
// sap xep theo lop
    public void studentByGroup(){
        if(sizeStudents == 0){
            System.out.println("Lop ko co phan tu");
        }
        else {
            boolean [] checkStudents = new boolean[sizeStudents];
            for(int i = 0; i < sizeStudents; i++){
                checkStudents[i] = false;
            }

            for(int i = 0; i < sizeStudents; i++){
                if(!checkStudents[i]){
                    System.err.println(students[i].getGroup() + ": ");
                    System.out.println( students[i].getName());
                    checkStudents[i] = true;
                }
                else continue;
                for(int j = i + 1; j < sizeStudents; j++){
                    if(checkStudents[j]) continue;
                    if(sameGroup(students[i], students[j])){
                        System.out.println( students[j].getName());
                        checkStudents[j] = true;
                    }
                }

            }
        }
        
    }
    // ham nhap danh sach cac doi tuong
    public void inputStudents(int n){
        sizeStudents = n;
        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin sinh viên : "+ (i + 1));
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            
            System.out.print("Enter ID: ");
            String id = scan.nextLine();
            
            System.out.print("Enter group: ");
            String group = scan.nextLine();
            
            System.out.print("Enter email: ");
            String email = scan.nextLine();
            
            students[i] = new Student(name, id, group, email);
        }
    } 
    // ham in ra danh sach
    public void output(){
        for(int i = 0; i < sizeStudents; i++){
            System.out.println(students[i].getInfor()); 
        }
    }
    // ham check id trong danh sach
    public int isExistID(String id){
        for(int i = 0; i < sizeStudents; i++){
            if(students[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    // ham xoa doi tuong co Id = id
    public void removeStudent(String id){
        int index = isExistID(id);
        if(index < 0){
            System.out.println("id khong ton tai");
        }else{
            for(int i = index; i < sizeStudents - 1; i++){
                students[i] = students[i+1];
            }
            sizeStudents--;
        }
    }
}
