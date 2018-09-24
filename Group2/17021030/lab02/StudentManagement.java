package studentmanagement;
import java.util.Scanner;

public class StudentManagement {
    public Student[] students = new Student[100];
    public Scanner sc = new Scanner(System.in);
    public int students_size = 0;
    // phuong thuc nhap vao thong tin sinh vien
    public void inputStu(int arraySize) {
        students_size = arraySize;
        for (int i = 0; i < students_size; i++)
        {
            System.out.println("Thong tin cho students[" + i + "]");
            System.out.print("\tNhap ho ten: ");
            String _name = sc.nextLine();
            System.out.print("\tNhap MSSV: ");
            String _id = sc.nextLine();
            System.out.print("\tNhap lop: ");
            String _group = sc.nextLine();
            System.out.print("\tNhap email: ");
            String _email = sc.nextLine();
            students[i] = new Student(_name, _id, _group, _email);
        }
    }
    
    public boolean sameGroup(Student stu1, Student stu2) {
        if (stu1.getGroup().equals(stu2.getGroup())) {
            return true;
        }
        else return false;
    }
    
    public void studentsByGroup() {
        int[] arr_check = new int[students_size];
        for (int i = 0; i < students_size; i++) {
            if (arr_check[i] == 0) {
                arr_check[i] = 1;
                System.out.println("\tDanh sach sinh vien lop " + students[i].getGroup());
                students[i].getInfo();
                for (int j = i + 1; j < students_size; j++) {
                    if (sameGroup(students[i], students[j])) {
                        arr_check[j] = 1;
                        students[j].getInfo();
                    }
                }
            }
        }
    }
    
    public void removeStudent() {
        int delete_pos = -1;
        String deleteID = "";
        System.out.print("Dien MSSV can xoa: ");
        deleteID = sc.nextLine();
        for (int i = 0; i < students_size; i++) {
            if (students[i].getID().equals(deleteID)) {
                delete_pos = i;
                break;
            }
        }
        if (delete_pos == -1) System.out.println("Khong co MSSV thoa man");
        else {
            for (int i = delete_pos; i < students_size - 1; i++) {
                students[i] = students[i+1];
            }
            students_size--;
        }
    }
    
    public static void main(String[] args) {
        StudentManagement stu_mng = new StudentManagement();
        Student BanThan = new Student();
        // thiet lap cac thong tin
        BanThan.setName("Nguyen Manh Thang");
        BanThan.setID("17021030");
        BanThan.setGroup("QH2017/I-CQ-C-L");
        BanThan.setEmail("17021030@vnu.edu.vn");
        
        // in ra ten sinh vien
        System.out.println("Ten sinh vien: " + BanThan.getName());
        
        // in ra toan bo thong tin bang phuong thuc getInfo()
        BanThan.getInfo();
        
        // kiem tra 3 phuong thuc khoi tao
        Student StuKhongDoi = new Student(); // khoi tao khong doi
        // khoi tao co doi
        Student StuCoDoi = new Student("Nguyen Van A", "1702xxxx", "abcxyz@vnu.edu.vn");
        Student StuSaoChep = new Student(BanThan); // khoi tao sao chep
        StuKhongDoi.getInfo();
        StuCoDoi.getInfo();
        StuSaoChep.getInfo();
        
        // kiem tra sameGroup()
        StuCoDoi.setGroup("K59CLC");
        StuSaoChep.setGroup("K59CLC");
        // StuKhongDoi co group la K59CB
        if (stu_mng.sameGroup(StuCoDoi, StuSaoChep)) {
            System.out.println("StuCoDoi cung lop StuSaoChep");
        }
        else System.out.println("StuCoDoi khac lop StuSaoChep");
        if (stu_mng.sameGroup(StuCoDoi, StuKhongDoi)) {
            System.out.println("StuCoDoi cung lop StuKhongDoi");
        }
        else System.out.println("StuCoDoi khac lop StuKhongDoi");
        // thu nhap vao cac sinh vien
        stu_mng.inputStu(5);
        System.out.println("\t\tXuat ra thong tin sinh vien");
        for (int i = 0; i < 5; i++) {
            stu_mng.students[i].getInfo();
        }
        stu_mng.studentsByGroup();
        stu_mng.removeStudent();
        System.out.println("\tSau khi xoa:");
        for (int i = 0; i < stu_mng.students_size; i++) {
            stu_mng.students[i].getInfo();
        }
    }
    
}
