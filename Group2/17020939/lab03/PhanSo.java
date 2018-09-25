package bai_tap_tuan_3;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	// Khởi tạo phân số
	public PhanSo (int tuSo, int mauSo) {
		this.tuSo 	= tuSo;
		this.mauSo 	= mauSo;
	}
	
	
	
	public PhanSo () {
		this.tuSo	= 1;
		this.mauSo	= 1;
	}	
	// Hàm boolean equals
	public boolean equals(PhanSo ps1, PhanSo ps2) {
		int tuSo = ps1.tuSo*ps2.mauSo - ps2.tuSo*ps1.tuSo;
		if (tuSo == 0) {
			return true;
		}	
		return false;
	}	
	
	// Hàm cộng phân số;
	public void congPS (PhanSo ps1, PhanSo ps2) {
		PhanSo ps = new PhanSo();
		ps.setTuSo(ps1.getTuSo() * ps2.getMauSo() + ps2.getTuSo() * ps1.getMauSo());
		ps.setMauSo(ps1.getMauSo() * ps2.getMauSo());
		toiGianPS(ps);
		ps1.inPhanSo();
		System.out.print(" + ");
		ps2.inPhanSo();
		System.out.print(" = ");
		ps.inPhanSo();
		System.out.print("\n");
	}
	
	// Hàm trừ phân số
	public void truPS (PhanSo ps1, PhanSo ps2) {
		PhanSo ps = new PhanSo();
		ps.setTuSo(ps1.getTuSo() * ps2.getMauSo() - ps2.getTuSo() * ps1.getMauSo());
		ps.setMauSo(ps1.getMauSo() * ps2.getMauSo());
		toiGianPS(ps);
		ps1.inPhanSo();
		System.out.print(" - ");
		ps2.inPhanSo();
		System.out.print(" = ");
		ps.inPhanSo();
		System.out.print("\n");
	}
	
	// Hàm nhân phân số
	public void nhanPS (PhanSo ps1, PhanSo ps2) {
		PhanSo ps = new PhanSo();
		ps.setTuSo(ps1.getTuSo() * ps2.getTuSo());
		ps.setMauSo(ps1.getMauSo() * ps2.getMauSo());
		toiGianPS(ps);
		ps1.inPhanSo();
		System.out.print(" * ");
		ps2.inPhanSo();
		System.out.print(" = ");
		ps.inPhanSo();
		System.out.print("\n");
	}
	
	// Hàm chia phân số
	public void chiaPS (PhanSo ps1, PhanSo ps2) {
		PhanSo ps = new PhanSo();
		ps.setTuSo(ps1.getTuSo() * ps2.getMauSo());
		ps.setMauSo(ps1.getMauSo() * ps2.getTuSo());
		toiGianPS(ps);
		ps1.inPhanSo();
		System.out.print(" / ");
		ps2.inPhanSo();
		System.out.print(" = ");
		ps.inPhanSo();
		System.out.print("\n");
	}
	
	public void toiGianPS (PhanSo ps) {
		int ucln = ucln(ps.tuSo, ps.mauSo);
		ps.tuSo = ps.tuSo / ucln;
		ps.mauSo = ps.mauSo / ucln;
	}
	
	int ucln(int a, int b)
    {
        if(b==0)
            return a;
        else return ucln(b,a%b);
    }
	
	// Hàm in phân số
	public void inPhanSo() {
		if (mauSo != 1) {
			System.out.print(tuSo + "/" + mauSo);
		} else {
			System.out.print(tuSo);
		}
		
	}	
	
	public int getTuSo() {
		return tuSo;
	}
	
	public int getMauSo() {
		return mauSo;
	}
	
	public void setTuSo (int tuSo) {
		this.tuSo = tuSo;
	}
	
	public void setMauSo (int mauSo) {
		this.mauSo = mauSo;
	}
	
	
}
