/**
 * Created by CCNE on 24/09/2018.
 */
public class PS {
    private int tuSo;
    private int mauSo;

    public PS() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PS(int tu, int mau) {
        this.tuSo = tu;
        this.mauSo = mau;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public PS congPhanSo(PS b){
        this.tuSo = this.tuSo*b.getMauSo() + this.mauSo*b.getTuSo();
        this.mauSo = this.mauSo*b.getMauSo();
        return this;
    }
    public PS truPhanSO(PS b){
        this.tuSo = this.tuSo*b.getMauSo() - this.mauSo*b.getTuSo();
        this.mauSo = this.mauSo*b.getMauSo();
        return this;
    }
    public PS nhanPhanSo(PS b){
        this.tuSo = this.tuSo*b.getTuSo();
        this.mauSo = this.mauSo*b.getMauSo();
        return this;
    }
    public PS chiaPhanSo (PS b){
        this.tuSo = this.tuSo*b.getMauSo();
        this.mauSo = this.mauSo*b.getTuSo();
        return this;
    }

    public boolean equals(PS b) {
        if (b.getMauSo()*this.tuSo == b.getTuSo()*this.mauSo){
            return true;
        } else {
            return false;
        }
    }
    public int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if ((a == 0) || (b == 0)) {
            if (a == 0) {
                return b;
            }
            if (b == 0) {
                return a;
            }
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }
        return a;
    }
    public void inPhanSo(){
        int c = UCLN(this.tuSo, this.mauSo);
        this.tuSo /= c;
        this.mauSo /= c;
        if ((this.tuSo < 0) && (this.mauSo < 0)) {
            this.tuSo = - this.tuSo;
            this.mauSo = - this.mauSo;
        }
        if ((this.tuSo > 0 ) && (this.mauSo < 0)){
            this.tuSo = - this.tuSo;
            this.mauSo = - this.mauSo;
        }
        if (this.mauSo != 0){
            if (this.tuSo == 0){
                System.out.println(0);
            } else {
                if ((this.tuSo % this.mauSo == 0)) {
                    System.out.println(this.tuSo / this.mauSo);
                } else {
                    System.out.println(this.tuSo + "/" + this.mauSo);
                }
            }
        } else {
            if (this.mauSo == 0){
                System.out.println("phan so khong ton tai");
            }
        }
    }
    public static void main (String[] args){
        PS a = new PS(2, 6);
        PS b = new PS(12,36);
        PS c = new PS(7, -7);
        c.congPhanSo(a);
        c.inPhanSo();
        c.truPhanSO(a);
        c.inPhanSo();
        c.nhanPhanSo(a);
        c.inPhanSo();
        c.chiaPhanSo(a);
        c.inPhanSo();
        if (a.equals(b)){
            System.out.println("bang nhau");
        } else {
            System.out.println("khong bang nhau");
        }
    }
}