package Bai_tap;

// tao class duong thang

public class Duong_thang {
    // Ax + By + C = 0
    private double A = 1;
    private double B = 1;
    private double C = 0;

    public Duong_thang(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    public Toa_do vecto_phap_tuyen () {
        Toa_do vtpt = new Toa_do(A, B);
        return vtpt;
    }

    public Toa_do vetor_chi_phuong () {
        Toa_do vtcp = new Toa_do(B, -A);
        return vtcp;
    }

    public void print() {
        System.out.printf ("%.3fx + %.3fx + %.3f = 0 ", A, B, C);
    }

    public boolean trung_nhau (Duong_thang d) {
        return ( A/d.getA() == B/d.getB() && A/d.getA() == C/d.getC() );
    }


}
