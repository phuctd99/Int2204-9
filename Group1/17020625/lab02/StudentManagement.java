package baitaptuan2;

public class StudentManagement {
	
	
	Student[] students = new Student[100];
	void setStudentarr(Student[] arr)
	{
	 for(int i = 0; i < arr.length;i++)
		{
			arr[i].setInfo();
		}
	}
	
	public boolean sameGroup(Student s1, Student s2)
	{
		if(s1.getGroup() == s2.getGroup()) return true;
		return false;
	}
	public void studentbyGroup(Student[] arr)
	{
		for(int i = 0 ; i < arr.length;i++)
		{
			if(arr[i].sw == true)
			{
				arr[i].getInfo();
			}
			for(int j = i+1;j < arr.length;j++)
				{
				if(arr[i].getGroup() ==  arr[j].getGroup())
				{
					arr[j].getInfo();
					arr[j].sw = false;
				}
				
				}
		}
	}
	
	public void removeStudent(String id)
	
	{
		int i = 0; 
		while (students[i].getId() != id || students[i] != null)
		{
			i++;
			
		}
		while(students[i] != null)
		{
			
			students[i] = students[i+1];
			i++;
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Student hs1 = new Student();
		hs1.setName("Cuong");
		hs1.setId("17020625");
		hs1.setGroup("K62");
		hs1.setEmail("17020625@vnu.edu.vn");
		//System.out.println(hs1.getName());
		//khai bao kieu 1
		//Student hs2 = new Student();
		//System.out.println(hs2.getInfo());
		//khai bao kieu 2
      //  Student hs3 = new Student("Cuong", "17020625", "17020625@gmai.com");
		//System.out.println(hs3.getInfo());
		//khai bao kieu 3
		//Student hs4 = new Student(hs3);
		//System.out.println(hs4.getInfo());
		
		
	}
	
	
	
	
}
