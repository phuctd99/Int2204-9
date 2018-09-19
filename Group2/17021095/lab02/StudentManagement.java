import java.util.ArrayList;

public class StudentManagement {
    public
    ArrayList<Student> Students = new ArrayList<Student>();


    public boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup() == s2.getGroup())
            return true;
        return false;
    }

    public void studentByGroup() {
        int swapPosition = 0;

        for ( int i = swapPosition; i < Students.size() ; i++ ) {
            for ( int j = i + 1; j < Students.size(); j++) {
                if ( Students.get(i).getGroup() == Students.get(j).getGroup() ) {
                    Student sv = new Student(Students.get(swapPosition + 1));
                    Students.set( swapPosition + 1, Students.get(j) );
                    Students.set( j, sv);
                    swapPosition++;
                }
            }
        }

        for (int i = 0; i < Students.size(); i++) {
            Students.get(i).getInfo();
            System.out.println();
        }

    }

    public void removeStudent(String id) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getId() == id)
                Students.remove(i);
        }
    }

    public static void main(String[] args) {

        Student sv1, sv2, sv3, sv4;
        StudentManagement s = new StudentManagement();
        String a = "k58";

        sv1 = new Student();
        sv2 = new Student("tuantu", "17021095", "kudohdtt@gmail.com");
        sv3 = new Student("haha", "178263", "kudasdjhf@jgash");
        sv2.setGroup(a);
        sv4 = new Student(sv2);


        sv1.getName();
        sv1.getInfo();
        boolean b = s.sameGroup(sv1, sv2);

        s.Students.add(0, sv1);
        s.Students.add(1, sv2);
        s.Students.add(2, sv3);
        s.Students.add(3, sv4);

        s.studentByGroup();

    }
}
