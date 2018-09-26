package bai_tap_tuan_2;

public class StudentManagement {
    public Student[] arrStudent = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public boolean checkBefore(Student s, int end) {
        for (int i = 0; i < 3; i++) {
            if (sameGroup(s, arrStudent[i])) {
                return true;
            }
        }
        return false;
    }

    public void studentsByGroup() {
        for (int i = 0; i < 2; i++) {
            if (!checkBefore(arrStudent[i], i)) {
                for (int j = i + 1; j < 3; j++) {
                    if (sameGroup(arrStudent[i], arrStudent[j])) {
                        arrStudent[j].getInfo();
                    }
                }
            }

        }
    }

    public int vitri(String id) {
        for (int i = 0; i < 3; i++) {
            if (id.equals(arrStudent[i].getId())) {
                return i;
            }
        }
        return -1;
    }

    public void removeStudent(String id) {
        int vitri = vitri(id);
        if (vitri < 0) {
            System.out.println("ko ton tai");
        } else {
            for (int i = vitri; i < 2; i++) {
                arrStudent[i] = arrStudent[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Student student1 = new Student();

        System.out.println("Thong tin sinh vien: ");
        student1.setName("NGUYEN THI HONG HANH");
        student1.setId("17020720");
        student1.setGroup("K62_CG");
        student1.setEmail("hanhanhhueduy@gmail.com");
        student1.getInfo();
        sm.arrStudent[0] = student1;
        Student student2 = new Student();

        student2.setName("NGUYEN MINH PHUONG");
        student2.setId("17020968");
        student2.setGroup("K62_CF");
        student2.setEmail("hotanhiu@gmail.com");
        student2.getInfo();
        sm.arrStudent[1] = student2;
        Student student3 = new Student();

        student3.setName("NGUYEN VU TUNG DUONG");
        student3.setId("17020657");
        student3.setGroup("K62_CG");
        student3.setEmail("tungduongnguyen@gmail.com");
        student3.getInfo();
        sm.arrStudent[2] = student3;

        if (sm.sameGroup(student1, student3) == true) {
            System.out.println("student1 cung lop student3 ");
        }
        if (sm.sameGroup(student1, student2) == true) {
            System.out.println("student1 cung lop student2 ");
        }
        if (sm.sameGroup(student2, student3) == true) {
            System.out.println("student2 cung lop student3 ");
        }
        sm.studentsByGroup();

        sm.removeStudent("17020657");

        for (int i = 0; i < 2; i++) {
            sm.arrStudent[i].getInfo();
        }
    }

}
