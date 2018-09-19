package oop_2;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerment {
	Scanner input = new Scanner(System.in);
	public Student[] students;
	private int sizeArray;
	
	public int getSizeArray() {
		return sizeArray;
	}

	public void setSizeArray(int sizeArray) {
		this.sizeArray = sizeArray;
	}
	
	public boolean sameGroup(Student s1, Student s2) {
		if (s1.getGroup() == s2.getGroup()) return true;
		else return false;
	}
	
	public StudentManagerment() {  // n is size of students array 
		System.out.print("nhap so phan tu: ");
		sizeArray = input.nextInt();
		input.nextLine();
		students = new Student[sizeArray];
		for (int i = 0; i < sizeArray; i++) {
			students[i] = new Student();
		}
	}
	
	public void setArrayStudent() {		// function input data Array Student
		for (int i = 0; i < sizeArray; i++) {
			System.out.print("inport name: ");
			students[i].setName(input.nextLine());
			System.out.print("import id: ");
			students[i].setId(input.nextLine());
			System.out.print("import group: ");
			students[i].setGroup(input.nextLine());
			System.out.print("import email : ");
			students[i].setEmail(input.nextLine());
		}
	}
	
	public void printArrayStudent() {		
		for (int i = 0; i < sizeArray; i++) {
			System.out.println(students[i].getInfo());
		}
	}
	
	public void studentByGroup() {
		ArrayList<String> listGroup = new ArrayList<String>();
		for (int i = 0; i < sizeArray; i++) {
			if (!listGroup.contains(students[i].getGroup())) {
				listGroup.add(students[i].getGroup());
			}
		}
		
		for (int i = 0; i < listGroup.size(); i++) {
			System.out.println("nhom : " + listGroup.get(i));
			for (int j = 0; j < sizeArray; j++) {
				if (students[j].getGroup().equals(listGroup.get(i))) {
					System.out.println(students[j].getInfo());
				}
			}
		}
	}
	
	public void removeStudent(String id) {
		int loc = 0;
		for (int i = 0; i < sizeArray; i++) {
			if (students[i].getId() == id) {
				loc = i;
			}
		}
		
		for (int i = loc; i < sizeArray - 1; i++) {
			students[i] = new Student(students[i+1]);
		}
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s2.setName("Pham Dinh Nha");
		s2.setId("17020941");
		s2.setGroup("k62ie9");
		s2.setEmail("17020941@vnu.edu.vn");
		System.out.println(s2.getName());
		System.out.println(s2.getInfo());
		Student s3 = new Student();
		Student s4 = new Student("nha", "1700000", "1700000@vnu.edu.vn");
		Student s5 = new Student(s4);
		System.out.println(s3.getInfo());
		System.out.println(s4.getInfo());
		System.out.println(s5.getInfo());
		s3.setGroup("“INT22041");
		s4.setGroup("“INT22041");		
		Student s6 = new Student("quynh", "1728282", "1728282@vnu.edu.vn");
		s6.setGroup("INT22042");
		StudentManagerment test = new StudentManagerment();
		test.sameGroup(s3, s4);
		test.setArrayStudent();
		test.studentByGroup();		
		test.removeStudent("ee");
		test.setSizeArray(test.getSizeArray() - 1);
		test.printArrayStudent();
	}

	
}
