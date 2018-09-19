package ClassStudent;
import java.util.ArrayList;

public class StudentManagement {
	// ham so sanh group cua 2 students
	public boolean sameGroup(Student s1, Student s2) {
		if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
	}
	// khoi tao danh sach mang dong lop sinh vien
	static ArrayList<Student> students = new ArrayList();
	// ham studentsByGroup() in ra danh sach sinh vien cung thuoc tinh group
	static void studentsByGroup() {
		for(int i = 0; i < students.size(); i++)
		{
			System.out.println(students.get(i).getInfo());
		}
	}
	// ham removeStudent de xoa sinh vien co ma so sv ID
	static void removeStudent(String id) {
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i).getID().equals(id))
			{
				students.remove(i);
				i--;
			}
		}
	}
	
	public static void main(String[] args)
	{
		// khai bao do tuong Stm de truy cap phan tu ngoai main khong co "static"
		StudentManagement Stm = new StudentManagement();
		// Khoi tao mot so doi tuong va in ra thuoc tinh cua tung doi tuong
		Student Std1 = new Student("NGOC_ANH", "17020***", "abcdef@gmail.com", "K59CB");
		System.out.println(Std1.getName());
		System.out.println(Std1.getInfo());
		// su dung phuong thuc khoi tao khong tham so
		Student std_f = new Student();
		System.out.println(std_f.getInfo());
		// su dung phuong thuc khoi tao co tham so, mac dinh group "K59CLC"
		Student std_s = new Student("Anh", "1702", "@gmail.com");
		System.out.println(std_s.getInfo());
		// so sanh thuoc tinh group cua 2 sinh vien
		if(Stm.sameGroup(std_f, std_s)) {
			System.out.println("Student first and second are in the same group");
		}
		else {
			System.out.println("Student first and second are not in the same group");
		}
		
		if(Stm.sameGroup(Std1, std_f)) {
			System.out.println("Student one and first are in the same group");
		}
		else 
			System.out.println("Student one and first are not in the same group");
		// them tung sinh vien vao ArrayList
		students.add(std_s);
		students.add(std_f);
		students.add(Std1);
		// xoa thong tin sinh vien student first
		removeStudent(std_f.getID());
		// in ra danh sach sinh vien co cung thuoc tinh group
		studentsByGroup();
	}
	//       **************END*******************
}
