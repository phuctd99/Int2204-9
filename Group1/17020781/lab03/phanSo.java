package bai2;

/**
 *
 * @author huanc_9jkjulx
 */
import java.util.*; //thu vien dung lop Scanner


public class phanSo{
	private int tuSo;
	private int mauSo;
	private boolean xacDinh;			// Phân số có xác định hay không ?
	private double value;				//Giá trị của phân số

	phanSo(int tuSo, int mauSo){									//Hàm khởi tạo
		if(mauSo > 0){
			this.tuSo = tuSo;
			this.mauSo = mauSo;
			this.value = (double)tuSo/(double)mauSo;
			this.xacDinh = true;
		}
		else if (mauSo < 0) {								// Đưa hết dấu âm về tử số 
			this.tuSo = -tuSo;
			this.mauSo = -mauSo;
			this.value = (double)tuSo/(double)mauSo;
			this.xacDinh = true;
		}
		else{
			this.xacDinh = false;
		}

		this.reduce();			//Tối giản phân số 
	}
	public int getTuSo(){					//getter
		return this.tuSo;
	}
	public int getMauSo(){
		return this.mauSo;
	}
	public boolean getXacDinh(){
		return this.xacDinh;
	}
	public double getValue(){
		return this.value;
	}
	public void setTuSo(int tuSo){				//Setter
		this.tuSo = tuSo;
	}
	public void setMauSo(int mauSo){
		this.mauSo = mauSo;
	}
	public void setPhanSo(phanSo pS){
		this.tuSo = pS.tuSo;
		this.mauSo = pS.mauSo;
	}
	
	public void print(){										//In ra phân số 
		if (xacDinh) {
			if(value == 0){
				System.out.println("0");
			}
			else if (value == 1) {
				System.out.println("1");
			}
			else {
				System.out.println(this.tuSo + "/" + this.mauSo);	
			}
		}
		else{
			System.out.println("Mau so bang 0");
		}
	}

	public int ucln(int a, int b){		// tìm ước chung lớn nhất của tử số và mẫu số 
		if(a == b){
			return a;
		}
		else if (a > b) {
			return ucln(a - b, b);
		}
		else {
			return ucln(a, b - a);
		}
	}

	public void reduce(){						// Rút gọn Phân số
		if(this.tuSo == 0){
			return;
		}
		int a ;
		if(this.tuSo < 0){
			a =  this.ucln(-this.tuSo, this.mauSo);
		}
		else{
			a =  this.ucln(this.tuSo, this.mauSo);
		}
		this.tuSo = this.tuSo/a;
		this.mauSo = this.mauSo/a;
	}

	public void plus(phanSo a){									//các phương thức cộng trừ nhân chia phân số 
		if(a.value == 0){
			return;
		}
		this.tuSo = this.tuSo*a.mauSo + a.tuSo*this.mauSo;
		this.mauSo = this.mauSo*a.mauSo;
		this.reduce();
		this.value = (double)this.tuSo / (double)this.mauSo;
	}

	public void minus(phanSo a){
		if(a.value == 0){
			return;
		}
		this.tuSo = this.tuSo*a.mauSo - this.mauSo*a.tuSo;
		this.mauSo = this.mauSo*a.mauSo;
		this.reduce();
		this.value = (double)this.tuSo / (double)this.mauSo;
	}
	public void multiply(phanSo a){
		if(a.value == 0){
			this.tuSo = 0;
			this.value = 0;
		}
		this.tuSo = this.tuSo*a.tuSo;
		this.mauSo = this.mauSo*a.mauSo;
		this.reduce();
		this.value = (double)this.tuSo / (double)this.mauSo;
	}

	public void divide(phanSo a){
		if(a.value == 0)
		{
			System.out.println("Khong chia duoc cho 0");
			return;
		}
		phanSo temp = new phanSo(0,1);
		temp.tuSo = this.tuSo*a.mauSo;
		temp.mauSo =this.mauSo*a.tuSo;
		temp.reduce();
		if(temp.mauSo < 0){
			this.tuSo = -temp.tuSo;
			this.mauSo = - temp.mauSo;
		}
		else {
			this.tuSo = temp.tuSo;
			this.mauSo = temp.mauSo;
		}
		this.value = (double)this.tuSo / (double)this.mauSo;
	}

	public void cong(phanSo a, phanSo b){									//Các phương thức nhận 2 đối số
		
		this.tuSo = a.tuSo*b.mauSo + a.mauSo*b.tuSo;
		this.mauSo = a.mauSo*b.mauSo;
		this.value = (double)this.tuSo/(double)this.mauSo;
		this.reduce();
		}
	

	public void tru(phanSo a, phanSo b){
		
		this.tuSo = a.tuSo*b.mauSo - a.mauSo*b.tuSo;
		this.mauSo = a.mauSo*b.mauSo;
		this.value = (double)this.tuSo/(double)this.mauSo;
		this.reduce();
		
	}

	public void nhan(phanSo a, phanSo b){
		
		this.tuSo = a.tuSo*b.tuSo;
		this.mauSo = a.mauSo*b.mauSo;
		this.value = (double)this.tuSo/(double)this.mauSo;
		this.reduce();
		
	}

	public void chia(phanSo a,phanSo b){
		if(b.value == 0){
			System.out.println("khong chia cho 0");
			return;
		}
		this.tuSo = a.tuSo*b.mauSo;
		this.mauSo =a.mauSo*b.tuSo;
		this.reduce();
		if(this.mauSo < 0){
			this.tuSo = -this.tuSo;
			this.mauSo = - this.mauSo;
		}
		else {
			this.tuSo = this.tuSo;
			this.mauSo = this.mauSo;
		}
		this.value = (double)this.tuSo / (double)this.mauSo;
	}

	public boolean equals(phanSo a){			//So sánh 2 phân số có bằng nhau hay không
		if(this.value == a.value){
			return true;
		}
		else{
			return false;
		}
			
	}


	public static void main(String agrv[]) 
	{
	
		phanSo phanSoX = new phanSo(12, 18);
		phanSoX.print();							//Thử hàm khởi tạo có tối giản luôn phân số 
		
		phanSo ps1 = new phanSo(1,2);
		phanSo ps2 = new phanSo(2,3);
		phanSo ps = new phanSo(3,4);
		ps.cong(ps1,ps2);         //ps = ps1 + ps2
		ps.print();
		ps.tru(ps1,ps2);			//ps = ps1 - ps2
		ps.print();
		ps.nhan(ps1,ps2);			//ps = ps1*ps2
		ps.print();
		ps.chia(ps1,ps2);			//ps = ps1 / ps2
		ps.print();

		ps1.plus(ps2);				// ps1 = ps1 + ps2
		ps1.print();
		ps2.minus(ps1);				// ps2 = ps1 - ps2
		ps2.print();
		
		phanSo ps3 = new phanSo(1,2);
		ps2.multiply(ps3);             // ps2 = ps2 * ps3
		ps2.print();

		phanSo ps4 =new phanSo(4,5);   
		ps2.divide(ps4);				// ps2 = ps4 / ps2
		ps2.print();


		
	}
}
