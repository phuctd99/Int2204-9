package BT_TH2;

import java.util.*;

public class StudentManagement{
    int Max_size = 4;

    public Student[] students = new Student[Max_size];

    public boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup().compareTo(s2.getGroup())== 0) return true;
        return false;
    }
    public void studentsByGroup(){

           List<String> Group = new ArrayList<>();
           for(int i=0; i<students.length; i++){
               if(!Group.contains(students[i].getGroup())){
                   Group.add(students[i].getGroup());
               }
           }
           for(int i=0; i<Group.size(); i++) {
               System.out.println("Group " + Group.get(i) + ": ");
               for (int j = 0; j < students.length; j++) {
                   if (students[j].getGroup().compareTo(Group.get(i)) == 0) {
                       students[j].getInfo();
                   }
               }
           }
    }

    public Student[] removeStudent(String id){
        List<Student> result = new ArrayList<Student>();
        for(int i=0; i<students.length; i++){
            result.add(students[i]);
        }
        int c=0;
        for(int i=0; i<result.size(); i++){
            if(result.get(i).getId().compareTo(id)==0) {
                result.remove(result.get(i));
                c++;
            }
        }

        for(int i=0; i<Max_size-c; i++){
            students[i] = result.get(i);
        }
        for(int i=  Max_size-c; i<Max_size; i++){
            students[i] = null;
        }
        return students;
    }

    public static void main(String[] args){
        StudentManagement class1 =  new StudentManagement();


                Student studentA = new Student();

        studentA.setName("Nguyen Thi Ngoc");
        studentA.setID("17020932");
        studentA.setGroup("INT22042");
        studentA.setEmail("17020932@vnu.edu.vn");
        //System.out.println(studentA.getName());
        //studentA.getInfo();

        Student studentB = new Student(studentA);
        //studentB.getInfo();
        Student studentC = new Student("Nguyen minh","1234567","sdfg@j");
        //studentC.getInfo();
        Student studentD = new Student();
        //studentD.getInfo();
        Student studentE = new Student("ngoc anh", "17020934", "17020934@vnu.edu.vn");

        boolean check = class1.sameGroup(studentA, studentC);
        if( check == true) {System.out.println(studentA.getName() +" " + studentC.getName() + " the same class "  );}
        else								{	System.out.println(studentA.getName() +" " + studentC.getName() + " different class");}

        class1.students[0] = studentA;
        class1.students[1] = studentC;
        class1.students[2] = studentD;
        class1.students[3] = studentE;

        class1.studentsByGroup();

        System.out.println("danh sach sau khi xoa : ");
        class1.students = class1.removeStudent("17020932");
        for(int i=0; i<class1.students.length; i++){
            System.out.println(class1.students[i].getName());
        }

    }
}