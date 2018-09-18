package lap02;

public class Student {
	//Khoi tao cac thuoc tinh cua lop
		private String name;
		private String id;
		private String group;
		private String email;
		//tao cac ham getter/setter
		public void setName(String n){
			this.name=n;
		}
		public String getName(){
			return name;
		}
		public void setId(String n){
			this.id=n;
		}
		public String getId(){
			return id;
		}
		public void setGroup(String n){
			this.group=n;
		}
		public String getGroup(){
			return group;
		}
		public void setEmail(String n){
			this.email=n;
		}
		public String getEmail(){
			return email;
		}
		//them phuong thuc getInfo
		public void getInfo(){
			System.out.println("Name: " + name);
			System.out.println("Id: " + id);
			System.out.println("Group: "+group);
			System.out.println("Email: "+email);
		}
		//ham khoi tao
		//phuong thuc 1
		Student(){
			name="Student";
			id="000";
			group="INT22041";
			email="uet@vnu.edu.vn";
		}
		//phuong thuc 2
		Student(String n,String id,String em){
			this.name=n;
			this.id=id;
			this.email=em;
			this.group="INT22041";
		}
		//phuong thuc 3
		Student(Student s){
			this.name=s.name;
			this.id=s.id;
			this.group=s.group;
			this.email=s.email;
		}
}
