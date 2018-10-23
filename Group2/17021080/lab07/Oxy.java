package Bai_tap;

public class Oxy {

    public Duong_thang vtpt_1diem( Toa_do vtpt, Toa_do diem ) {
        double A = vtpt.getX();
        double B = vtpt.getY() ;
        double C = -A * diem.getX() - B*diem.getY();
        Duong_thang d = new Duong_thang( A, B, C) ;
        return d;
    } // A(x- x0) + B(y- y0) = 0;

    public double khoang_cach (Toa_do a, Toa_do b ) {
        double d2 = ( a.getX() - b.getX()) * ( a.getX() - b.getX() )
                + ( a.getY() - b.getY()) * ( a.getY() - b.getY() );
        return Math.sqrt(d2);
    }

    public Toa_do giao_diem ( Duong_thang d1, Duong_thang d2 ) {

        double a = d1.getA();
        double b = d1.getB();
        double c = -d1.getC();
        double a1 = d2.getA();
        double b1 = d2.getB();
        double c1 = -d2.getC();

        double D = a*b1 - a1 *b;
        double Dx = c*b1 - c1*b ;
        double Dy = a*c1 - a1*c ;

        Toa_do giao = new Toa_do(Dx/D, Dy/D );

        return giao;
    }

    public boolean trungNhau( Toa_do a, Toa_do b ) {
        return ( a.getY() == b.getY() && a.getX() == b.getX() );
    }





}
