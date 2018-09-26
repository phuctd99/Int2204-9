import java.util.Scanner;

public class PS {
	private int tu;
	private int mau;

	public PS() {
	}

	public PS(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	
	// hàm cộng 2 phân số (trả về phân số tổng)
	public PS cong2PS(PS p) {
		PS tong = new PS();
		tong.tu = this.tu * p.getMau() + this.mau * p.getTu();
		tong.mau = this.mau * p.getMau();
		tong.rutgon();
		return tong;
	}
	
	// hàm trừ 2 phân số
	public PS tru2PS(PS p) {
		PS tru = new PS();
		tru.tu = this.tu * p.getMau() - p.getTu() * this.mau;
		tru.mau = this.mau * p.getMau();
		tru.rutgon();
		return tru;
	}

	// hàm nhân 2 phân số
	public PS nhan2PS(PS p) {
		PS nhan = new PS();
		nhan.tu = this.tu * p.getTu();
		nhan.mau = this.mau * p.getMau();
		nhan.rutgon();
		return nhan;
	}

	// hàm chia 2 phân số
	public PS chia2PS(PS p) {
		PS chia = new PS();
		chia.tu = this.tu * p.getMau();
		chia.mau = this.mau * p.getTu();
		chia.rutgon();
		return chia;
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}
	
	// hàm tính ước chung lớn nhất cho 2 số nguyên
	public int ucln(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (a != b) {
			if (a > b) {
				a -= b;
			} else
				b -= a;
		}
		return a;
	}

	// hàm rút gọn phân số
	public void rutgon() {
		int uc = ucln(this.tu, this.mau);
		this.tu /= uc;
		this.mau /= uc;
	}

	// hàm nhập phân số
	public void nhapPS() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tử số: ");
		this.tu = sc.nextInt();
		System.out.print("Nhập mẫu số: ");
		this.mau = sc.nextInt();
		do {
			if (this.mau == 0) {
				System.out.println("Phân số không thỏa mãn, nhập lại");
				System.out.print("Nhập tử số: ");
				this.tu = sc.nextInt();
				System.out.print("Nhập mẫu số: ");
				this.mau = sc.nextInt();
			}
		} while (this.mau == 0);
	}
	
	// hàm xuất phân số
	public void xuatPS() {
            if(mau<0){
                this.mau *= -1;
                this.tu *= -1;
            }
		if (tu == 0 || mau == 1) {
			System.out.println(this.tu);
		} else
			System.out.println(this.tu + "/" + this.mau);
	}
	
	// hàm so sánh 2 phân số
	public boolean equals(PS p) {
		float soSanh = (float) this.tu / this.mau - (float) p.getTu() / p.getMau();
		if (soSanh < 0) {
			return false; // trả về false nếu ps1 < ps2
		}
		return true; // trả về true nếu ps1 > ps2
	}
}