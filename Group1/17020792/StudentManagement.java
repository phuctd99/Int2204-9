/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 *
 */
public class StudentManagement {

    public Student[] students = new Student[100];
    private  int size = 0;

    static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
   public void arryStudent(Student s) {
        if (size == 100) {
            return ;
        }
        students[size] = s;
        size++;
      
    }

    
    public void studentsByGroup() {
        int count = 0;
        String [] a = new String[size];

        for (int i = 0 ; i < size ; i++) {
            int j =0;
            for (;j < count ; j++) {
                if (students[i].getGroup().equals(a[j])) {

                    break;
                }
            }
            if (j==count){
                a[count] = students[i].getGroup();
                count++;
            }
        }
        for ( int i = 0 ; i < count ; i++) {
            //System.out.println(a[i]);
            for ( int j = 0 ; j < size ; j++){
                if (students[j].getGroup().equals(a[i])) {
                     students[j].getInfo();
                }
            }
        }
    }

    public void removeStudent( String id) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equals(id)) {
                break;
            }
            index++;
        }
        if (index == size) {
            return ;
        }
        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        size--;
      //  return true;
    }

    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.setGroup("INT22041");
      
        
        Student sv2 = new Student("Hung", "17020792", "phamhung99");
        sv2.setGroup("INT22042");
      
        Student sv3 = new Student(sv1);
        sv3.setId("005");
   
        StudentManagement sm = new StudentManagement();
        sm.arryStudent(sv1);
        sm.arryStudent(sv2);
        sm.arryStudent(sv3);
        
        sm.removeStudent( "005");
        sm.studentsByGroup();
       

    }
}
