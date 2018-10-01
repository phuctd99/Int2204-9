public class Bai3
{
	public class Cat
{
	private String name,color;
	private int ages;
	public String getname()
	{
		return name;
	}
	public void setname(String s)
	{
		name=s;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcolor(String s)
	{
		color=s;
	}
	public int getages()
	{
		return ages;
	}
	public void setages(int s)
	{
		ages=s;
	}
}
	public class Dog
{
	private String name,color,species;
	private int ages;
	public String getname()
	{
		return name;
	}
	public void setname(String s)
	{
		name=s;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcolor(String s)
	{
		color=s;
	}
	public int getages()
	{
		return ages;
	}
	public void setages(int s)
	{
		ages=s;
	}
	public String getspecies()
	{
		return species;
	}
	public void setspecies(String s)
	{
		species=s;
	}
}
	public class House
{
	private String bedroom,bathroom,kitchen;
	public String getbedroom()
	{
		return bedroom;
	}
	public void setbedroom(String s)
	{
		bedroom=s;
	}
	public String getbathroom()
	{
		return bathroom;
	}
	public void setbathroom(String s)
	{
		bathroom=s;
	}
	public String getkitchen()
	{
		return kitchen;
	}
	public void setkitchen(String s)
	{
		kitchen=s;
	}
}
	public class Laptop
{
	private String cpu,gpu,ram;
	public String getcpu()
	{
		return cpu;
	}
	public void setcpu(String s)
	{
		cpu=s;
	}
	public String getgpu()
	{
		return gpu;
	}
	public void setgpu(String s)
	{
		gpu=s;
	}
	public String getram()
	{
		return ram;
	}
	public void setram(String s)
	{
		ram=s;
	}
}
	public class Luong
{
	private int luongcoban,phucap,tangca;
	public int getluongcoban()
	{
		return luongcoban;
	}
	public void setluongcoban(int s)
	{
		luongcoban=s;
	}
	public int getphucap()
	{
		return phucap;
	}
	public void setphucap(int s)
	{
		phucap=s;
	}
	public int gettangca()
	{
		return tangca;
	}
	public void settangca(int s)
	{
		tangca=s;
	}
	public int luongduocnhan()
	{
		int kq=luongcoban+phucap+tangca;
		return kq;
	}
}
	public class PS
{
	private int ts,ms;
	public PS()
	{
		this.ts=1;
		this.ms=1;
	}
	public PS(int a,int b)
	{
		this.ts=a;
		this.ms=b;
	}
	public void cong(PS a)
	{
		ts=ts*a.ms+a.ts*ms;
		ms=ms*a.ms;
	}
	public void tru(PS a)
	{
		ts=ts*a.ms-a.ts*ms;
		ms=ms*a.ms;
	}
	public void nhan(PS a)
	{
		ts=ts*a.ts;
		ms=ms*a.ms;
	}
	public void chia(PS a)
	{
		ts=ts*a.ms;
		ms=ms*a.ts;
	}
	public int ucln(int a,int b)
	{
		if(a==0) return b;
		if(b==0) return a;
		while(a!=b)
		{
			if(a>b) a=a-b;
			else b=b-a;
		}
		return a;
	}
	public void rutgon()
	{
		int ucln=ucln(ts,ms);
		ts=ts/ucln;
		ms=ms/ucln;
	}
	public boolean equals(PS a)
	{
		if(ts*a.ms-a.ts*ms==0) return true;
		else return false;
	}
	public void print()
	{
		System.out.println(ts+"/"+ms);
	}
	
}
	public class Sach
{
	private String name,id,price,author; 
	public String getname()              //lấy tên sách   
	{
		return name;
	}
	public void setname(String s)        //đặt tên sách
	{
		name=s;
	}
	public String getid()
	{
		return id;
	}
	public void setid(String s)
	{
		id=s;
	}
	public String getprice()
	{
		return price;
	}
	public void setprice(String s)
	{
		price=s;
	}
	public String getauthor()
	{
		return author;
	}
	public void setemail(String s)
	{
		author=s;
	}
	public Sach(String a,String b,String c,String d)      // hàm khởi tạo
	{
		name=a;
		id=b;
		price=c;
		author=d;
	}
	

}
	public class Sieuxe
{
	private int giatien,tocdo;
	private String hangxe;
	public int getgiatien()
	{
		return giatien;
	}
	public void setgiatien(int s)
	{
		giatien=s;
	}
	public int gettocdo()
	{
		return tocdo;
	}
	public void settocdo(int s)
	{
		tocdo=s;
	}
	public String gethangxe()
	{
		return hangxe;
	}
	public void sethangxe(String s)
	{
		hangxe=s;
	}
}
	public class Student
{
	private String name,id,group,email;        // các thuộc tính của Student là tên,mssv,lớp,email
	public String getname()                    
	{
		return name;
	}
	public void setname(String s)
	{
		name=s;
	}
	public String getid()
	{
		return id;
	}
	public void setid(String s)
	{
		id=s;
	}
	public String getgroup()
	{
		return group;
	}
	public void setgroup(String s)
	{
		group=s;
	}
	public String getemail()
	{
		return email;
	}
	public void setemail(String s)
	{
		email=s;
	}
	public Student(String a,String b,String c,String d)      // hàm khởi tạo
	{
		name=a;
		id=b;
		group=c;
		email=d;
	}
	
}
	public class TamGiac
{
	private double canh1,canh2,canh3;
	public double getcanh1()
	{
		return canh1;
	}
	public void setcanh1(double s)
	{
		canh1=s;
	}
	public double getcanh2()
	{
		return canh2;
	}
	public void setcanh2(double s)
	{
		canh2=s;
	}
	public double getcanh3()
	{
		return canh3;
	}
	public void setcanh3(double s)
	{
		canh3=s;
	}
}
}