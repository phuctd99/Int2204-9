public class PS {

    private int tu;
    private int mau;

    //constructors
    public PS() {
        tu = 0;
        mau = 1;
    }

    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        compact();
    }

    public void printPs() {
        if (mau == 1)
            System.out.println(tu);
        else if (tu == 0)
            System.out.println(0);
        else System.out.println(tu + " / " + mau);
    }

    //getter
    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }


    //math
    public void plus(PS other) {
        this.tu = this.tu * other.mau + other.tu * this.mau;
        this.mau *= other.mau;
        compact();
    }

    public void minus(PS other) {
        this.tu = this.tu * other.mau - other.tu * this.mau;
        this.mau *= other.mau;
        compact();
    }

    public void mul(PS other) {
        this.tu *= other.tu;
        this.mau *= other.mau;
        compact();
    }

    public void div(PS other) {
        this.tu *= other.mau;
        this.mau *= other.tu;
        compact();
    }

    public void compact() {
        if (tu != 0) {
            int a = tu > 0 ? tu : -tu;
            int b = mau > 0 ? mau : -mau;
            while (a != b) {
                if (a > b) a -= b;
                else b -= a;
            }
            tu /= a;
            mau /= b;
        }
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof PS) {
            PS temp = (PS) obj;
            return (mau == temp.getMau() && tu == temp.getTu());
        }
        return false;
    }

    public static void main(String[] args) {
        PS ps1 = new PS(4, 8);
        PS ps2 = new PS(-1, 3);
        ps1.compact();
        ps1.printPs();
        System.out.println(ps1.equals(new PS(3, 6)));
    }
}
