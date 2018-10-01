package bai_tap_tuan_3;

public class UCLN {
	
	// ham tim UCLN
	public int ucln(int a, int b)
    {
        if(b==0)
            return a;
        else return ucln(b,a%b);
    }

}
