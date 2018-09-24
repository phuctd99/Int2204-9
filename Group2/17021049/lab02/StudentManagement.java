package Lab2;

 import java.util.*;
 import java.util.ArrayList;


     public class StudentManagement{
         public List<Student> ListStudents = new ArrayList<Student>();


             public static void main(String[] args){
                 StudentManagement test = new StudentManagement();

                 Student sv = new Student();

                 sv.setName("Pham Van Thuan");
                 sv.setId("17021049");
                 sv.setGroup("INT22042");
                 sv.setEmail("phamthuanmu@gmail.com");

                 System.out.println(sv.getName());

                 sv.getInfo();

                 Student sv1 = new Student();
                 Student sv2 = new Student("David A", "17021050", "ABCmu@gmail.com");
                 Student sv3 = new Student(sv);
                 System.out.println("sv1: ");
                 sv1.getInfo();
                 System.out.println("sv2: ");
                 sv2.getInfo();
                 System.out.println("sv3: ");
                 sv3.getInfo();

                 System.out.println("sv1 va sv3 co cung lop khong?: " + test.sameGroup(sv1, sv3));

                 test.ListStudents.add(sv1);
                 test.ListStudents.add(sv2);
                 test.ListStudents.add(sv3);

                 System.out.println("Kiem tra ham studentsByGroup");
                 test.studentsByGroup();

                 System.out.println("Kiem tra ham remove");
                 test.removeStudent("17021069");
                 for (int i = 0; i < test.ListStudents.size(); i++) {
                     test.ListStudents.get(i).getInfo();
                 }

             }

             public boolean sameGroup (Student s1, Student s2){
                 if (s1.getGroup().equals(s2.getGroup())) {
                     return true;
                 }
                 return false;
             }

             void studentsByGroup () {
                 ArrayList<String> group = new ArrayList<String>();
                 for (int i = 0; i < ListStudents.size(); i++) {
                     if (!group.contains(ListStudents.get(i).getGroup())) {
                         group.add(ListStudents.get(i).getGroup());
                     }
                 }
                    for (int i = 0; i < group.size(); i++) {
                     System.out.println("Lop " + group.get(i));
                     for (int j = 0; j < ListStudents.size(); j++) {
                         if (ListStudents.get(j).getGroup().equals(group.get(i))) {
                             ListStudents.get(j).getInfo();
                         }
                     }
                   }
                 System.out.println();
             }

             public void removeStudent (String id){
                 int length = ListStudents.size();
                 for (int i = 0; i < length; i++) {
                     if (ListStudents.get(i).getId() == id) {
                         ListStudents.remove(i);
                     }
                 }
             }
            }