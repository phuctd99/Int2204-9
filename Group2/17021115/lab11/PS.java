
import static java.lang.Math.E;
import java.util.Scanner;
import week11.Sort;

public class PS implements Comparable<PS>{

    private int tu;
    private int mau;

    public PS() {
    }

    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

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

    // hàm tính ước chung lớn nhất cho 2 số nguyên
    public int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    // hàm rút gọn phân số
    public void rutgon() {
        int uc = ucln(this.tu, this.mau);
        this.tu /= uc;
        this.mau /= uc;
        if (this.mau < 0) {
            this.tu *= -1;
            this.mau *= -1;
        }
    }

    // hàm xuất phân số
    public void xuatPS() {
        rutgon();
        if (tu == 0 || mau == 1) {
            System.out.println(this.tu);
        } else {
            System.out.println(this.tu + "/" + this.mau);
        }

    }

    // hàm so sánh 2 phân số
    @Override
    public int compareTo(PS p) {
        float soSanh = (float) this.tu / this.mau - (float) p.getTu() / p.getMau();
        if (soSanh < 0) {
            return -1; // trả về false nếu ps1 < ps2
        }
        if(soSanh > 0)  return 1;
        else    return 0;
    }
    
    public static void main(String[] args) {
        Sort test = new Sort();

        PS p1 = new PS(1, 3);
        PS p2 = new PS(2, -3);
        PS p3 = new PS(5, 2);
        PS p4 = new PS(3, 3);
        PS p5 = new PS(-5, 1);

        PS[] arrPS = {p1, p2, p3, p4, p5};
        test.sortArray(arrPS);
        for (int i = 0; i < arrPS.length; i++) {
            arrPS[i].xuatPS();
        }
    }
}
