import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    ArrayList<Student> listSV = new ArrayList<Student>(100);
    ArrayList<String> groups = new ArrayList<String>();


    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals( s2.getGroup() );
    }

    public void studentByGroup() {
        for (int i = 0; i < listSV.size(); i++) {
            if (groups.indexOf(listSV.get(i).getGroup()) == -1)
                groups.add(listSV.get(i).getGroup());
        }
        System.out.printf("\t\t\t Danh sách theo lớp \n");
        for (int i = 0; i < groups.size(); i++) {
            System.out.printf("\t\t%s\n",groups.get(i));
            for (int j = 0; j< listSV.size(); j++) {
                if (listSV.get(j).getGroup().equals(groups.get(i)) == true)
                    System.out.printf("%-30s %-10s %-10s %s\n", listSV.get(j).getName(),listSV.get(j).getID(),
                            listSV.get(j).getGroup() , listSV.get(j).getEmail());
            }
        }
    }

    public void removeStudent(String id) {
        if (listSV.isEmpty())
            return;
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getID().equals(id) == true) {
                listSV.remove(i);
                return;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();

        Student sv = new Student();
        sv.setName("nguyễn quang hiệp");
        sv.setID("17020735");
        sv.setGroup("INT2204_9");
        sv.setEmail("nguyenquanghiep17@gmail.com");

        System.out.println(sv.getName());
        System.out.println(sv.getInfo());

        Student sv1 = new Student();
        Student sv2 = new Student("this is name", "17020732","name@gmail.com");
        Student sv3 = new Student(sv);

        sm.listSV.add(sv);
        sm.listSV.add(sv1);
        sm.listSV.add(sv2);

        sm.removeStudent("17020735");
        sm.studentByGroup();

        System.out.println(sm.sameGroup(sv,sv1));


    }
}
