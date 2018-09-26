import java.util.Scanner;
public class StudentManagement
{
	public Student students[]=new Student[100];
	public int n;
	public boolean sameGroup(Student s1,Student s2)
	{
		if(s1.getGroup()==s2.getGroup()) return true;
		else return false;
	}
	public static void main(String[] args) 
	{
		StudentManagement test =new StudentManagement();

		Student MyInfor=new Student();
		MyInfor.setName("Nguyen Huu Nam");
		MyInfor.setId("17020911");
		MyInfor.setGroup("INT22041");
		MyInfor.setEmail("namnguyenbn2399@gmail.com");
		Student a=new Student();
		Student b=new Student("Nguyen Van A","3333333","aaaaaaaa@gmail.com");
		Student c=new Student(MyInfor);
		System.out.println("Nhap so hoc sinh");
		Scanner scan=new Scanner(System.in);
		//System.out.println(test.sameGroup(a,b));

		test.n=scan.nextInt();
		test.Nhapthongtin();
		//sameGroup(a,b);
		//studentsByGroup(n);
		scan.nextLine();
		String e=scan.nextLine();
		//test.removeStudent(e);
		test.studentsByGroup();
		test.Xuatthongtin();
		//test.studentsByGroup
	}
	public void Nhapthongtin()
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap ten: ");
			String name=scan.nextLine();
			System.out.println("Nhap id: ");
			String id=scan.nextLine();
			System.out.println("Nhap group: ");
			String group=scan.nextLine();
			System.out.println("Nhap email: ");
			String email=scan.nextLine();
			students[i]=new Student(name,id,group,email);
		}
	}
	public void Xuatthongtin()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(students[i].getInfor());
		}
	}
	public void studentsByGroup()
	{
		String tmp[]=new String[n];
		int size=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<=size;j++)
			{
				if(students[i].getGroup().equals(tmp[j])==false)
				{
					count++;
				}
			}
			if(count==size+1)
			{
				tmp[size]=students[i].getGroup();
				size++;
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(students[i].getGroup());
			for(int j=0;j<n;j++)
			{
				if(students[j].getGroup().equals(tmp[i]))
				{
					System.out.println(students[j].getInfor());
				}
			}
		}
	}
	public void removeStudent(String id)
	{
		for(int i=0;i<n;i++)
		{
			if(students[i].getId().equals(id)==true)
			{
				for(int j=i;j<n-1;j++)
				{
					/*students[j].setName(students[j+1].getName());
					students[j].setId(students[j+1].getId());
					students[j].setGroup(students[j+1].getGroup());
					students[j].setEmail(students[j+1].getEmail());*/
					students[j]=students[j+1];
				}
				n--;
			}
		}
	}
}