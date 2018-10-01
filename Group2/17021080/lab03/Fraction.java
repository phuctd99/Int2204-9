package Bai_tap_tuan_03;

public class Fraction {
    private int denominator ; // mau so
    private int numerator; // tu so
    private Cau_01 myMath = new Cau_01();
    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public Fraction(int denominator, int numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public void print() {
        System.out.print( this.denominator + "/" + this.numerator );
    }
// viet ham cong hai phan so
    public Fraction add( Fraction frac_1) {

        int deno = frac_1.getDenominator() * this.getNumerator()
                + frac_1.getNumerator() * this.getDenominator();
        int num = frac_1.getNumerator() * this.getNumerator();

        int ucln_ = myMath.ucln(deno,num);
        deno /= ucln_;
        num /= ucln_;
        Fraction resultFrac = new Fraction(deno ,num);
        return  resultFrac;
    }
// viet ham tru
    public Fraction tru( Fraction frac_1) {

        int deno = frac_1.getDenominator() * this.getNumerator()
                - frac_1.getNumerator() * this.getDenominator();
        int num = frac_1.getNumerator() * this.getNumerator();

        int ucln_ = myMath.ucln(deno,num);
        deno /= ucln_;
        num /= ucln_;
        Fraction resultFrac = new Fraction(deno ,num);
        return  resultFrac;
    }

    // viet ham so sanh hai phan so
    public boolean equals(Fraction f) {
        if( (this.denominator*f.numerator - this.numerator*f.denominator) * this.numerator*f.numerator == 0) {
            return true;
        }
        else return  false;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,5);
        Fraction f2 = new Fraction(3,10);
        Fraction f = f1.add(f2);
        System.out.println( f1.equals(f2));
    }

}
