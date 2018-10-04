package lab4;
public class Lab4
{
	public static int max(int a,int b)
	{
		if(a>b) return a;
		else return b;
	}
	public static int min(int a[],int n)
	{
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<min) min=a[i];
		}
		return min;
	}
	public static String BMI(double weight,double high)
	{
                String s = null;
		double bmi=weight/(high*high);
		if(bmi<18.5&&bmi>0) s="Thieu Can";
		if(bmi>=18.5&&bmi<23) s="Binh Thuong";
		if(bmi<25&&bmi>=23) s="Thua Can";
		if(bmi>=25) s="Beo Phi";
                return s;
	}
}