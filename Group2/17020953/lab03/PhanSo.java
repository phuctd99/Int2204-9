/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Admin
 */
public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	// Khởi tạo phân số
	public PhanSo (int tuSo, int mauSo) {
            this.tuSo 	= tuSo;
            this.mauSo 	= mauSo;
	}
	
        public PhanSo() {
            this.tuSo   = 1;
            this.mauSo  = 1;
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
	
	// Hàm cộng phân số;
	public PhanSo congPS (PhanSo ps1, PhanSo ps2) {
		PhanSo ps = new PhanSo();
		setTuSo(ps1.getTuSo() * ps2.getMauSo() + ps2.getTuSo() * ps1.getMauSo());
		setMauSo(ps1.getMauSo() * ps2.getMauSo());
		return ps;
	}
	
	// Hàm trừ phân số
	public PhanSo truPS (PhanSo ps1, PhanSo ps2) {
		PhanSo ps = new PhanSo();
		setTuSo(ps1.getTuSo() * ps2.getMauSo() - ps2.getTuSo() * ps1.getMauSo());
		setMauSo(ps1.getMauSo() * ps2.getMauSo());
		return ps;
	}
	
	// Hàm nhân phân số
	public PhanSo nhanPS (PhanSo ps1, PhanSo ps2) {
		PhanSo ps = new PhanSo();
		setTuSo(ps1.getTuSo() * ps2.getTuSo());
		setMauSo(ps1.getMauSo() * ps2.getMauSo());
		return ps;
	}
	
	// Hàm chia phân số
	public PhanSo chiaPS (PhanSo ps1, PhanSo ps2) {
		PhanSo ps = new PhanSo();
		setTuSo(ps1.getTuSo() * ps2.getMauSo());
		setMauSo(ps1.getMauSo() * ps2.getTuSo());
		return ps;
	}
	
	// Hàm in phân số
	public void inPhanSo(PhanSo ps) {
		System.out.println(ps.getTuSo() + "/" + ps.getMauSo());
	}
        
        // Hàm boolean equals
	public boolean equals(PhanSo ps1, PhanSo ps2) {
                PhanSo ps3 = new PhanSo();
		ps3.tuSo= ps1.tuSo*ps2.mauSo - ps2.tuSo*ps1.tuSo;
		ps3.mauSo = ps1.mauSo * ps2.mauSo;
                if( ps3.tuSo * ps3.mauSo == 0) return true ;
                else return false ;
	}	
}