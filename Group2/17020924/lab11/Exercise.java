package Exercise;

import java.util.ArrayList;
import java.util.Arrays;

class Fraction implements Comparable<Fraction>{
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
		if (Form < 0) {
			Death = Death*(-1);
			Form = Form*(-1);
		}
		Fraction newf = new Fraction(Death, Form);
		if (newf.getDeath() * newf.getForm() != f.getDeath() * f.getForm()) {
			return false;
		}
		else {
			return true;
		}
	}
	public String print() {
		 return this.getDeath() + " / " + this.getForm();
	}
	@Override
	public int compareTo(Fraction f) {
		if (this.getDeath() * f.getForm() < this.getForm() * f.getDeath()) return -1;
        if (this.getDeath() * f.getForm() > this.getForm() * f.getDeath()) return 1;
        else return 0;
	}
}

public class Exercise {

    public < E extends Comparable<E>> void sort(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    E temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static <E extends Comparable<E>> E findMax(ArrayList<E> list) {
        E max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }
    
    
    public static void main(String[] args) {
        Exercise test = new Exercise();
        Integer[] arrInts = {1,7,3,9,3};
        test.sort(arrInts);
        System.out.println(Arrays.toString(arrInts));
        String[] arrString = {"action", "screen", "string", "uron"};
        test.sort(arrString);
        System.out.println(Arrays.toString(arrString));
        Character[] arrChar = {'d', 'e', 'b', 'u'};
        test.sort(arrChar);
        System.out.println(Arrays.toString(arrChar));
        
        
        Fraction[] fr = {new Fraction(1,3), new Fraction(-1, 2), new Fraction(2,3)};
        test.sort(fr);
        for (Fraction x : fr) {
            System.out.println(x.print());
        }
         
         ArrayList<Integer> ArrInts = new ArrayList<>();
         ArrInts.add(1);
         ArrInts.add(345);
         ArrInts.add(-123);
         ArrInts.add(3543);
         ArrInts.add(0);
         System.out.println(findMax(ArrInts));

         ArrayList<String> ArrString = new ArrayList<>();
         ArrString.add("ac");
         ArrString.add("usi");
         ArrString.add("li");
         ArrString.add("wwww");
         System.out.println(findMax(ArrString));
         
         ArrayList<Fraction> Arr = new ArrayList<>();
         Arr.add(new Fraction(5,3));
         Arr.add(new Fraction(-3,2));
         Arr.add(new Fraction(2,9));
         Arr.add(new Fraction(-1,3));
         System.out.println(findMax(Arr).print());
    }
}
