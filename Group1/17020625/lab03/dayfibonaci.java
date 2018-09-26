package baitaptuan3;

public class dayfibonaci {
	//dung de quy
	public static int dayfibonaci(int n)
	{
		if(n < 0) {return -1;}
		if(n == 0 || n == 1) { return n;}
		return dayfibonaci(n-1)+dayfibonaci(n-2);
		
		
	}
	
	//khong dung de quy
	public static int dayfibonacic2(int n)
	{
		int f0 = 1;
		int f1 = 1;
		int fn = 1;
		if(n < 0) return -1;
		if(n == 0 || n == 1) return n;
			for(int i = 2 ; i < n;i++){
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
			}
		return fn;
		
	}
	
	
	
	
	
	
	
}
