
public class Student
{
	private
	String name,id,group,email;
	public String getName()
	{
		return name;
	}
	public void setName(String s)
	{
		name=s;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String s)
	{
		id=s;
	}
	public String getGroup()
	{
		return group;
	}
	public void setGroup(String s)
	{
		group=s;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String s)
	{
		email=s;
	}
	public String getInfor()
	{
		String Infor=name+" "+id+" "+group+" "+email;
		return Infor;
	}
	public Student()
	{
		name= "Student";
		id="000";
		group="INT22041";
		email="uet@vnu.edu.vn";
	}
	public Student (String n, String sid, String em)
	{
		name=n;
		id=sid;
		group="INT22041";
		email=em;
	}
	public Student (String n, String sid, String gp, String em)
	{
		name=n;
		id=sid;
		group=gp;
		email=em;
	}
	public Student (Student s)
	{
		name=s.name;
		id=s.id;
		group=s.group;
		email=s.email;
	}

}