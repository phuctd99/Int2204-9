import java.util.*;
public class StudentManagement {

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup() == s2.getGroup()) {
            return true;
        } else
            return false;
    }

    public static List<Student> students = new ArrayList<>();

    public static void studentByGroup() {
        //  int n = students.size();
        // tạo mảng group chứa các lớp
        ArrayList<String> group = new ArrayList<String>();
        // kiểm tra group đã chứa lớp ( trong students ) chưa ? contains
        // nếu chưa có thêm add()
        for (int i = 0; i < students.size(); i++) {
            if (!group.contains(students.get(i).getGroup())) {
                group.add(students.get(i).getGroup());
            }
        }
        // xuất sinh viên theo lớp
        for (int i = 0; i < group.size(); i++) {
            System.out.println("\t\tTen Lop " + group.get(i));
            for (int j = 0; j < students.size(); j++) {
                // lệnh a.equals(b) so sánh a == b return boolean
                if (students.get(j).getGroup().equals(group.get(i))) {
                    students.get(j).getInfo();
                }
            }
        }
    }

    public static void removeStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                students.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Student sv = new Student();
        sv.setGroup("INT22042");
        Student v = new Student("tran the vuong", "17021142", "zeroain186@gmail.com");
        Student s = new Student(v);

        StudentManagement test = new StudentManagement();
        test.students.add(sv);
        test.students.add(s);
        test.students.add(v);
        test.studentByGroup();
    }
}
/*

public static void main(String[] args) {
	// write your code here
        StudentManagement test = new StudentManagement();
        Student st1 = new Student("Minh", "001", "Red", "K59CC");
        System.out.println(st1.getInfo());
        System.out.println(st1.getName());
        Student st2 = new Student("Nam", "002", "Blue", "K59CB");
        Student st3 = new Student(st1);
        Student st4 = new Student();
        test.students.add(st1);
        test.students.add(st2);
        test.students.add(st3);
        test.students.add(st4);
        if (test.sameGroup(st1, st2)) {
            System.out.println("In same group");
        }
        else {
            System.out.println("In different group");
        }
        System.out.println(st3.getInfo());

        test.studentsByGroup();


    }
}
 */