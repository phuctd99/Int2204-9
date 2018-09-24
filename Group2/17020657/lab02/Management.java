package bai_tap;

import java.util.Scanner;

public class Management {

    private static Students[] listStudent = new Students[100];
    private static int number = 10;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("***************----- Khởi tạo sinh viên -----***************");
        createStudent();
        System.out.println();

        System.out.println("======> Cách 1:");
        createStudentNoParams();

        System.out.println("======> Cách 2:");
        createStudentWithInfor();

        System.out.println("=========================================================");
        checkSameGroup();

        System.out.println("***************----- Danh sách sinh viên -----***************");
        listStudent();

        System.out.println("***************----- Xóa sinh viên -----***************");
        System.out.print("Nhập Id sinh viên cần xóa: ");
        String idToDelete = cin.nextLine();
        removeStudent(idToDelete);
    }

    public static boolean sameGroup(Students s1, Students s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public static void createStudent() {
        Students firstStudent = new Students();

        firstStudent.setName("Nguyen Vu Tung Duong");
        firstStudent.setId("17020657");
        firstStudent.setGroup("K62-CQC-CF");
        firstStudent.setEmail("duongk22899@gmail.com");

        System.out.println(firstStudent.getInfor());
    }

    public static void createStudentNoParams() {
        Students studentNotParams = new Students();
        System.out.print(studentNotParams.getInfor());
    }

    public static void createStudentWithInfor() {
        Students studentWithInfor = new Students("Nguyen Vu Tung Duong", "17020657", "minhphuong99@abc.zyx", "K62CG");
        System.out.println(studentWithInfor.getInfor());
    }

    public static void checkSameGroup() {
        Students student1 = new Students("Vũ Thu Trang", "17020657", "duongk22@gmail.com", "K62CG");
        Students student2 = new Students("Nguyễn Vũ Tùng Dương", "17020658", "duongk22@gmail.com", "K62CF");
        Students student3 = new Students("Nguyễn Vũ Mai Linh", "17020623", "duongk22@gmail.com", "K62CG");

        student1.setGroup("K59CLC");
        student2.setGroup("K59CLC");
        student3.setGroup("K59CB");

        System.out.println(student1.getInfor());
        System.out.println(student2.getInfor());
        System.out.println(student3.getInfor());

        // Kiem tra cung lop
        if (sameGroup(student1, student2)) {
            System.out.println(student1.getName() + " hoc cung lop voi " + student2.getName());
        } else System.out.println(student1.getName() + " khong hoc cung lop voi " + student2.getName());

        if (sameGroup(student2, student3)) {
            System.out.println(student2.getName() + " hoc cung lop voi " + student3.getName());
        } else System.out.println(student2.getName() + " khong hoc cung lop voi " + student3.getName());

        if (sameGroup(student1, student3)) {
            System.out.println(student1.getName() + " hoc cung lop voi " + student3.getName());
        } else System.out.println(student1.getName() + " khong hoc cung lop voi " + student3.getName());
    }

    public static void listStudent() {
        createList();
        for (int i = 0; i < number; i++) {
            System.out.println(listStudent[i].getInfor());
        }
        studentByGroup();
    }

    public static void createList() {
        listStudent[0] = new Students("name", "1", "uet@vnu.edu.vn", "K62-CG");
        listStudent[1] = new Students("name", "2", "uet@vnu.edu.vn", "K62-CM");
        listStudent[2] = new Students("name", "3", "uet@vnu.edu.vn", "K62-CG");
        listStudent[3] = new Students("name", "4", "uet@vnu.edu.vn", "K62-CT");
        listStudent[4] = new Students("name", "5", "uet@vnu.edu.vn", "K62-CB");
        listStudent[5] = new Students("name", "6", "uet@vnu.edu.vn", "K62-CG");
        listStudent[6] = new Students("name", "7", "uet@vnu.edu.vn", "K62-CN");
        listStudent[7] = new Students("name", "8", "uet@vnu.edu.vn", "K62-CG");
        listStudent[8] = new Students("name", "9", "uet@vnu.edu.vn", "K62-CM");
        listStudent[9] = new Students("name", "10", "uet@vnu.edu.vn", "K62-CT");

    }

    public static void studentByGroup() {
        /*
           -Tạo một mảng boolean đánh dấu trạng thái duyệt của từng sinh viên, default là true
           -Để trạng thái tất cả sinh viên đã duyệt là true.
           -Sau đó duyệt từng sinh viên từ đầu và in ra tất cả các sinh viên cùng lớp $$ chuyển trạng thái thành false.
           -Sinh viên trạng thái false sẽ bỏ qua không duyệt
         */

        boolean[] checked = new boolean[number];

        for (int i = 0; i < number; i++) {
            checked[i] = true;
        }

        for (int i = 0; i < number; i++) {
            if (checked[i]) {
                System.out.println("***************-----" + listStudent[i].getGroup() + "-----***************");
                for (int j = i; j < number; j++) {
                    if (listStudent[i].getGroup().equals(listStudent[j].getGroup())) {
                        System.out.println(listStudent[j].getInfor());
                        checked[j] = false;
                    }
                }
            }
        }
    }

    public static void removeStudent(String id) {
        boolean isFoundId = false;
        int numberic = 0;
        for (int i = 0; i < number && !isFoundId; i++) {
            if (listStudent[i].getId().equals(id)) {
                isFoundId = true;
                numberic = i;
                number--;
            }
        }

        for (int i = numberic; i < number; i++) {
            listStudent[i] = listStudent[i + 1];
        }
        listStudent[number] = null;


        System.out.println("***************-----" + "Danh sách sau khi xóa" + "-----***************");

        for (int i = 0; i < number; i++) {
            System.out.println(listStudent[i].getInfor());
        }
    }
}
