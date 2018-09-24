/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author nguyenhuy
 */
public class StudentManagement {

    public Student[] students = new Student[100];
    private  int size = 0;

    static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
    //lưu thông tin sinh viên s vào mảng students vị trí i.

    public boolean arryStudent(Student s) {
        if (size == 100) {
            return false;
        }
        students[size] = s;
        size++;
        return true;
    }
    public void studentsByGroup() {
        int count = 0;
        String [] a = new String[size];
//        boolean test = true;
        for (int i = 0 ; i < size ; i++) {
            int j =0;
            for (;j < count ; j++) {
                if (students[i].getGroup().equals(a[j])) {
//                    test = false;
                    break;
                }
            }
            if (j==count){
                a[count] = students[i].getGroup();
                count++;
            }
        }
        for ( int i = 0 ; i < count ; i++) {
            System.out.println(a[i]);
            for ( int j = 0 ; j < size ; j++){
                if (students[j].getGroup().equals(a[i])) {
                     System.out.println(students[j].getInfo());
                }
            }
        }
    }

    public boolean removeStudent( String id) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equals(id)) {
                break;
            }
            index++;
        }
        if (index == size) {
            return false;
        }
        for (int j = index; j < size - 1; j++) {
            students[j] = students[j + 1];
        }
        size--;
        return true;
    }

    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.setGroup("INT22041");
        //sv1.getInfo();
        Student sv2 = new Student("Huy", "17020800", "nguyenhuy2899");
        sv2.setGroup("INT22042");
        //sv2.getInfo();
        Student sv3 = new Student(sv1);
        sv3.setId("001");
        //System.out.println( sv3.getInfo());
        //System.out.println(sameGroup(sv1 , sv2));
        StudentManagement sm = new StudentManagement();
        sm.arryStudent(sv1);
        sm.arryStudent(sv2);
        sm.arryStudent(sv3);
        //test phương thức remove
        System.out.println(sm.removeStudent( "001"));
        sm.studentsByGroup();

    }
}
