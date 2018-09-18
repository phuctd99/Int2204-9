
package lec02;

/**
 *
 * @author hyperStolen
 */
class Student {
	
	private String name;							//Câu 1 & 3
	private String id;
	private String group, email;

	 Student(){												//Câu 7
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn";
	}
	Student(String name, String id, String email){
		this.name = name;
		this.id = id;
		this.email = email;
		group = "INT22041";
	}
	Student(Student s){
		name = s.name;
		id = s.id;
		group = s.group;
		email = s.email;
	}
	public String getName(){						//Câu 4
		return name;
	}
	public String getId(){
		return id;
	}
	public String getGroup(){
		return group;
	}
	public String getEmail(){
		return email;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setGroup(String group){
		this.group = group;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getInfo(){																	//Câu 5
		if(this.name == null || this.id == null || this.group == null || this.email == null)
			return null;
		System.out.println(this.name + " " + this.id + " " + this.group + " " + this.email + " ");
		return "1";
	}
}


public class StudentManagement {
	
		public Student[] students = new Student[100];
		public int k = 7;

		StudentManagement(){
			students[0] = new Student("A","123","asss@ad");
			students[1] = new Student("B","000","rrrr@sad");
			students[2] = new Student("C","222", "aaaa@as");
			students[3] = new Student("D", "456", "asd@sad");
			students[4] = new Student("E", "333", "aawew@dd");
			students[5] = new Student("F", "789","ssss@vnu");
			students[6] = new Student("G", "999", "dsss@dd");
			students[2].setGroup("INT22042");
			students[3].setGroup("INT22043");
			students[4].setGroup("INT22041");
			students[5].setGroup("INT22042");
			students[6].setGroup("INT22041");	
		}

		 
	public boolean sameGroup(Student s1, Student s2){
		
		return s1.getGroup() == s2.getGroup();
	}

	public void studentsByGroup(){
		
		String[] groups = new String[50]; // tập hợp tất cả các tên lớp 
		int cout = 0;
		int check = 0;
		groups[0] = students[0].getGroup();
		cout++;

		for(int i = 0; i < k; ++i){                 		// Tìm tập hợp tên lớp 
			for(int j = 0; j < cout ; ++j){
				if(groups[j] == students[i].getGroup()){
					check = 1;
				}
			}
			if(check == 1){
				check = 0;
			}
			else{
				groups[cout] = students[i].getGroup();
				cout++;
			}
		}													//

		int cout2 = 0;
		cout = 0;

		while(cout2 < k){										
			for(int i = 0; i < k; ++i){
				if(students[i].getGroup() == groups[cout]){
					students[i].getInfo();									//in ra danh sách theo từng lớp 
					cout2++;
				}
			}
			cout++;
		}
	}

	public void removeStudent(String id){
		for(int i = 0; i < k; ++i){
			if(id == students[i].getId()){
				students[i].setName(null);
				students[i].setId(null);
				students[i].setGroup(null);
				students[i].setEmail(null);
			}
		}
	}

	public static void main(String[] args) {

		Student s1 = new Student();							//Câu 2

		s1.setName("Huan");									//Câu 6
		s1.setId("170201781");
		s1.setEmail("abcgmai.com");
		s1.setGroup("INT22041");	
		String ten = s1.getName();
		System.out.println(ten);
		s1.getInfo();
		System.out.println();

		Student s2 = new Student();							//câu 8
		Student s3 = new Student("Nam","11111","asdas@asd");
		Student s4 = new Student(s3);
		s2.getInfo();										
		s3.getInfo();
		s4.getInfo();
		System.out.println();

		s4.setGroup("INT22042");										//Câu 9 10
		System.out.println(new StudentManagement().sameGroup(s3,s2));
		System.out.println(new StudentManagement().sameGroup(s3,s4));
		System.out.println();

		new StudentManagement().studentsByGroup();						//Câu 12
		System.out.println();

		new StudentManagement().removeStudent("000");					//Câu 13
		new StudentManagement().studentsByGroup();
		System.out.println();
				
	}
}