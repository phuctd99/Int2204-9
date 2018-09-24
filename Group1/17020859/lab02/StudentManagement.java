import java.util.Scanner;

public class StudentManagement {

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
    public Scanner scan = new Scanner(System.in);
    public Student[] Students = new Student[100];
    public String[] Groups = new String[100];
    public int size;

    public void input(int n){
        size = n;
        for (int i = 0; i<size; i++) {
                Students[i] = new Student();
        }
        for (int i = 0; i < size; i++){
            String name = scan.nextLine();
            String id = scan.nextLine();
            String group = scan.nextLine();
            String email = scan.nextLine();
            Students[i].Student(name, id, group, email);
        }
    }

    public void studentsByGroup() {
        int Groupsize = size;
        for (int i=0; i<size; i++) {
            Groups[i] = Students[i].getGroup();
        }
        for (int i=0; i<Groupsize; i++) {
            for (int j=i+1; j<Groupsize; j++) {
                if (Groups[i].equals(Groups[j])) {
                    for (int k=j; k<Groupsize; k++) {
                        Groups[k] = Groups[k+1];
                    }
                    Groupsize --;
                    j --;
                }
            }
        }
        for (int i=0; i<Groupsize; i++) {
            System.out.println("Danh sach lop " + Groups[i] + ": ");
            for (int j=0; j<size; j++) {
                if (Groups[i].equals(Students[j].getGroup())) {
                    Students[j].getInfo();
                }
            }
            System.out.println();
        }
    }

    public void removeStudent(String id) {
        for (int i = 0; i<size; i++) {
            if (Students[i].getId().equals(id)) {
                for (int j = i; j<size; j++) {
                    Students[j] = Students[j+1];
                }
                size --;
                i --;
            }
        }
    }

    public static void main(String[] argh) {
        StudentManagement studentManagement = new StudentManagement();
        Student a = new Student();
        a.setName("Nguyen Tuan Linh");
        a.setId("17020859");
        a.setGroup("QH-I-2017/CQ-C-L");
        a.setEmail("Thunderking9x@gmail.com");
        System.out.println(a.getName());
        a.getInfo();

        Student b = new Student();
        Student c = new Student();
        Student d = new Student();
        b.Student();
        c.Student("Nguyen Van X", "17052169", "xxx@gmail.com");
        d = d.Student(c);
        b.getInfo();
        c.getInfo();
        d.getInfo();

        Student e = new Student();
        Student f = new Student();
        Student g = new Student();
        e.Student();
        e.setGroup("INT22041");
        g.Student();
        g.setGroup("INT22041");
        f.Student();
        f.setGroup("INT22041");
        if (studentManagement.sameGroup(e, g)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        studentManagement.input(n);
        studentManagement.studentsByGroup();

        sc.nextLine();
        String id = sc.nextLine();
        studentManagement.removeStudent(id);
    }

}
