/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Admin
 */
public class StudentManagement {
        // Cau 9
    public boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    } 
        
        // Cau 11
    public Student[] students = new Student[100];
        
        // Cau 12
    private  int size = 0;
    public boolean addStudent(Student s) {
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
                     students[j].getInfo();
                }
            }
            System.out.println();
        }
    }
    
        // Cau 13
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
        // Cau 2
        Student one = new Student();
        
        // Cau 6
        Student two = new Student();
        two.setName("Nguyen Trong Thang");
        two.setId("17020167");
        two.setGroup("INT22049");
        two.setEmail("kayami98@gmail.com");
        System.out.println("Ten sinh vien la " + two.getName());
        two.getInfo();
        System.out.println();
        
        // Cau 8
        Student three = new Student();
        three.getInfo();
        Student four = new Student("Binh","123","Binh123@gmail.com");
        four.getInfo();
        Student five = new Student(four);
        five.getInfo();
        System.out.println();
        
        // Cau 10
        Student six = new Student("An","124","An124@gmail.com");
        Student seven = new Student("Anh","125","Anh125@gmail.com");
        Student eight = new Student("Chi","126","Chi26@gmail.com");
        eight.setGroup("INT22042");
        StudentManagement SM = new StudentManagement();
        System.out.println("Kiem tra cung lop " + SM.sameGroup(six, seven));
        System.out.println("Kiem tra khac lop " + SM.sameGroup(six, eight));
        System.out.println();
        
        // Test Cau 12
        SM.addStudent(one);
        SM.addStudent(two);
        SM.addStudent(six);
        SM.addStudent(seven);
        SM.addStudent(eight);
        SM.studentsByGroup();
        System.out.println();
        
        // Test Cau 13
        SM.removeStudent("125");
        SM.studentsByGroup();
    }
}
