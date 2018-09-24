package exercise3;

public class PS {
	private double tu;
	private double mau;
	public double getTu() {
		return tu;
	}
	public void setTu(double tu) {
		this.tu = tu;
	}
	public double getMau() {
		return mau;
	}
	public void setMau(double mau) {
		this.mau = mau;
	}
	public PS(double ts, double ms) {
		this.tu = ts;
		this.mau = ms;
	}
	public double GCD(double a, double b) {
		if (b == 0) {
			return a;
		} else {
			return GCD(b, a % b);
		}
	}
	public void toiGianPs() {
		int gcd = (int) GCD(this.getTu(), this.getMau());
		this.setTu(this.getTu() / gcd);
		this.setMau(this.getMau() / gcd);
		if (this.getMau() < 0) {
			this.setMau(this.getMau() * -1);
			this.setTu(this.getTu() * -1);
		}
		if (this.getTu() == 0) this.setMau(0);
	}
	
	public PS congPS(PS ps) {
		double ts = this.getTu() * ps.getMau() + this.getMau() * ps.getTu();
		double ms = this.getMau() * ps.getMau();
		PS tongPS = new PS(ts, ms);
		tongPS.toiGianPs();
		return tongPS;
	}
	public PS truPS(PS ps) {
		double ts = this.getTu() * ps.getMau() - this.getMau() * ps.getTu();
		double ms = this.getMau() * ps.getMau();
		PS hieuPS = new PS(ts, ms);
		hieuPS.toiGianPs();
		return hieuPS;
	}
	public PS nhanPS(PS ps) {
		double ts = this.getTu() * ps.getTu();
		double ms = this.getMau() * ps.getMau();
		PS tichPS = new PS(ts, ms);
		tichPS.toiGianPs();
		return tichPS;
	}
	public PS chiaPS(PS ps) {
		double ts = this.getTu() * ps.getMau();
		double ms = this.getMau() * ps.getTu();
		PS thuongPS = new PS(ts, ms);
		thuongPS.toiGianPs();
		return thuongPS;
	}
	public boolean quals(PS ps) {
		double ts = this.getTu();
		double ms = this.getMau();
		ps.toiGianPs();
		PS newPS = new PS(ts, ms);
		if (newPS.getMau() != ps.getMau() || newPS.getTu() != ps.getTu()) {
			return false;
		} else {
			return true;
		}
	}
	public void print() {
		System.out.println(this.getTu() + "/" + this.getMau());
	}
}
