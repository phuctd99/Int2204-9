
public class phanSo {
    private int tu, mau;
    public phanSo(int tu, int mau){
        this.tu=tu;
        this.mau=mau;
    }
    public phanSo(){
        this(0,1);
    }

    public phanSo simplify(){
           phepToan a = new phepToan();
           phanSo toiGian = this;
           if (this.tu == 0) {return this;}
            else {
               int UC = a.UCLN(toiGian.tu, toiGian.mau);
               toiGian.tu = toiGian.tu / UC;
               toiGian.mau = toiGian.mau / UC;
            }
          return this;
    }

    public void inPS(){
        System.out.println(this.tu + "/" + this.mau);
    }

    public phanSo cong(phanSo a) {
        this.tu = this.tu*a.mau + a.tu*this.mau;
        this.mau = this.mau*a.mau;
        return this.simplify();
    }

    public phanSo tru(phanSo a){
        this.tu = (this.tu*a.mau) - (a.tu*this.mau);
        this.mau = this.mau*a.mau;
        return this.simplify();
    }

    public phanSo nhan(phanSo a){
        this.tu = this.tu*a.tu;
        this.mau = this.mau*a.mau;
        return this.simplify();
    }
    public phanSo chia(phanSo a){
        this.tu = this.tu*a.mau;
        this.mau = this.mau*a.tu;
        return this.simplify();
    }

    public boolean equals(phanSo a){
        return this.tu*a.mau == a.tu*this.mau;
    }
}
