
import java.util.Scanner;
public class Ps {
     int tuSo,mauSo;
	
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	Ps(int tuSo, int mauSo){
		this.tuSo	= tuSo;
		this.mauSo	= mauSo;
	}
	
	public Ps sum( Ps num1, Ps num2) {
		Ps sum	= new Ps(0,1);
		sum.setTuSo(num1.getTuSo()*num2.getMauSo()+num1.getMauSo()*num2.getTuSo());
		sum.setMauSo(num1.getMauSo()*num2.getTuSo());
		sum.toiGianPhanSo(sum);
		return sum;
		
	}
	
	public Ps subtract(Ps num1, Ps num2) {
		Ps subtract	= new Ps(0,1);
		subtract.setTuSo(num1.getTuSo()*num2.getMauSo()-num1.getMauSo()*num2.getTuSo());
		subtract.setMauSo(num1.getMauSo()*num2.getMauSo());
		subtract.toiGianPhanSo(subtract);
		return subtract;
	}
	
	public Ps multiply(Ps num1, Ps num2) 
        {
		Ps multiply = new Ps(0,1);
		multiply.setTuSo(num1.getTuSo()*num2.getTuSo());
		multiply.setMauSo(num1.getTuSo()*num2.getMauSo());
		multiply.toiGianPhanSo(multiply);
		return 	multiply;
	}
	
	public Ps division(Ps num1, Ps num2) {
		Ps division	= new Ps(0,1);
		division.setTuSo(num1.getTuSo()*num2.getMauSo());
		division.setMauSo(num1.getMauSo()*num2.getTuSo());
		division.toiGianPhanSo(division);
		return division;
	}
	
	public Ps toiGianPhanSo(Ps ps) {
		int temp = (ps.getMauSo()*ps.getTuSo())/Math.abs((ps.getMauSo()*ps.getTuSo()));
		for(int i=Math.abs(ps.getTuSo());i>0;i--) {
			if(ps.getMauSo()%i==0 && ps.getTuSo()%i==0) {
				ps.setTuSo(Math.abs(ps.getTuSo()/i)*temp);
				ps.setMauSo(Math.abs(ps.getMauSo()/i));
				break;
			}
		}
		return ps;
	}
	
	 public boolean equals(Ps num1, Ps num2) {
		 num1.toiGianPhanSo(num1);
		 num2.toiGianPhanSo(num2);
		 if((double)num1.getTuSo()/num1.getMauSo() == (double)num2.getTuSo()/num2.getMauSo())
			 return true;
		 return false;	
	 }
    public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
             int ts1=input.nextInt();
             int ms1 = input.nextInt();      
             Ps num1 = new Ps(ts1, ms1);
             int ts2=input.nextInt();
             int ms2=input.nextInt();
             Ps num2 =  new Ps(ts2,ms2);
             Ps ps = new Ps( 0,1);
             ps = ps.sum(num1, num2);
             System.out.println("cong phan so la: " + " "+ ps.getTuSo() + "/" + ps.getMauSo() );
             ps=ps.subtract(num1, num2);
             System.out.println("tru phan so la: " + " "+ ps.getTuSo() + "/" + ps.getMauSo() );
             ps=ps.multiply(num1, num2);
             System.out.println("nhan phan so la: " + " "+ ps.getTuSo() + "/" + ps.getMauSo() );
             ps = ps.division(num1, num2);
             System.out.println("chia phan so la: " + " "+ ps.getTuSo() + "/" + ps.getMauSo() );
             ps.equals(num1, num2);
        }

}