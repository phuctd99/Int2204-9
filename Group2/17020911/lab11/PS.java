package week11b1;

public class PS implements Comparable<PS>
{
	public int ts,ms;
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
		a=Math.abs(a);
		b=Math.abs(b);
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
		if(ms<0)
		{
			ts=ts*-1;
			ms=Math.abs(ms);
		}
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
	public static void main(String[] args)
	{
		PS ps1=new PS(2,-5);
		PS ps2=new PS(2,5);
		System.out.println(ps1.equals(ps2));
		ps1.rutgon();
		ps1.print();
	}
        @Override
        public int compareTo(PS a)
        {
            
            if(this.ts*a.ms-a.ts*this.ms>0) return 1;
            else return -1;
        }
}