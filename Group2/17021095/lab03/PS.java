public class PS {
    //khai báo thuộc tính

    private int numerator;
    private int denominator;

    //phương thức khởi tạo phân số
    public PS(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    //phương thức tìm ước chung lớn nhất của 2 số nguyên a và b
    public int UCLN(int a, int b) {
        a=Math.abs(a);
        b=Math.abs(b);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    //phương thức tính Fibonaxi của 1 số nguyên n

    public int Fibonaxi(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return Fibonaxi(n - 2) + Fibonaxi(n - 1);
    }

    //phương thức rút gọn phân số
    public void simplify() {
        numerator = numerator / UCLN(numerator, denominator);
        denominator = denominator / UCLN(numerator, denominator);
    }

    //phương thức cộng phân số
    public PS sum(PS ps) {
        ps.numerator = ps.numerator * this.denominator + ps.denominator * this.numerator;
        ps.denominator = ps.denominator * this.denominator;
        ps.simplify();
        return ps;
    }

    //phương thức trừ phân số
    public PS subtraction(PS ps) {
        ps.numerator = ps.denominator * this.numerator - ps.numerator * this.denominator;
        ps.denominator = ps.denominator * this.denominator;
        ps.simplify();
        return ps;
    }

    //phương thức nhân phân số
    public PS multiplication(PS ps) {
        ps.numerator = ps.numerator * this.numerator;
        ps.denominator = ps.denominator * this.denominator;
        ps.simplify();
        return ps;
    }

    //chia 2 phân số
    public PS division(PS ps) {
        int a;
        a = ps.numerator;
        ps.numerator = ps.denominator;
        ps.denominator = a;
        multiplication(ps).simplify();
        return ps;
    }

    //so sánh 2 phân số
    public boolean equals(PS ps) {
        if (ps.denominator * this.numerator == ps.numerator * this.denominator)
            return true;
        return false;
    }

    //in ra ps
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public static void main(String[] args) {

        boolean b;
        PS ps1 = new PS(2, 3);
        PS ps2 = new PS(4, 8);

        ps2.simplify();

        ps1.sum(ps2).print();
        ps1.division(ps2).print();
        b = ps1.equals(ps2);
        System.out.print(b);

    }
}
