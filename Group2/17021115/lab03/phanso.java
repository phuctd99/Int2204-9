
public class phanso {
    private int tu;
    private int mau;

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
    public phanso cong2PS(phanso p) {
		phanso tong = new phanso();
		tong.tu = this.tu * p.getMau() + this.mau * p.getTu();
		tong.mau = this.mau * p.getMau();
		tong.rutgon();
		return tong;
	}
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
}
