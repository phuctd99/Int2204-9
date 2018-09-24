package exercise2;

public class Fraction {
	private int death, form;
	public void setDeath(int death) {
		this.death = death;
	}
	public int getDeath(){
		return death;
	}
	public void setForm(int form) {
		this.form = form;
	}
	public int getForm() {
		return form;
	}
	public Fraction(int death, int form) {
		this.death = death;
		this.form = form;
	}
	public int GCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return GCD(b, a % b);
		}
	}
	public void MinimalFractions() {
		int x = GCD(this.getDeath(),this.getForm());
		this.setDeath(this.getDeath()/x);
		this.setForm(this.getForm()/x);
	}
	public Fraction plus(Fraction f) {
		int Death = this.getDeath() * f.getForm() + this.getForm() * f.getDeath();
		int Form = this.getForm() * f.getForm();
		Fraction plusf = new Fraction(Death, Form);
		plusf.MinimalFractions();
		return plusf;
	}
	public Fraction minus(Fraction f) {
		int Death = this.getDeath() * f.getForm() - this.getForm() * f.getDeath();
		int Form = this.getForm() * f.getForm();
		Fraction minusf = new Fraction(Death, Form);
		minusf.MinimalFractions();
		return minusf;
	}
	public Fraction human(Fraction f) {
		int Death = this.getDeath()*f.getDeath();
		int Form = this.getForm() * f.getForm();
		Fraction humanf = new Fraction(Death, Form);
		humanf.MinimalFractions();
		return humanf;
	}
	public Fraction share(Fraction f) {
		int Death = this.getDeath()*f.getForm();
		int Form = this.getForm() * f.getDeath();
		Fraction sharef = new Fraction(Death, Form);
		sharef.MinimalFractions();
		return sharef;
	}
	public boolean quals(Fraction f) {
		int Death = this.getDeath();
		int Form = this.getForm();
		f.MinimalFractions();
		Fraction newf = new Fraction(Death, Form);
		if (newf.getDeath() != f.getDeath() || newf.getForm() != f.getForm()) {
			return false;
		} else {
			return true;
		}
	}
	public String print() {
		 return this.getDeath() + " / " + this.getForm();
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction(6, 8);
		System.out.println(f1.print());
		Fraction f2 = new Fraction(2, 4);
		System.out.println(f2.print());
		Fraction fplus = f1.plus(f2);
		System.out.println(fplus.print());
		Fraction fminus = f1.minus(f2);
		System.out.println(fminus.print());
		Fraction fhuman = f1.human(f2);
		System.out.println(fhuman.print());
		Fraction fshare = f1.share(f2);
		System.out.println(fshare.print());
		System.out.println(f1.equals(f2));
	}
}
