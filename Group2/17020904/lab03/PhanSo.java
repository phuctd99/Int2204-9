public class PhanSo {
    private int Tu, Mau;
    public PhanSo (int a, int b){
        this.Tu = a;
        this.Mau = b;
    }
    void setTu(int n){
        this.Tu= n;
    }
    int getTu() {
        return Tu;
    }
    void setMau(int n){
        this.Mau= n;
    }
    int getMau() {
        return Mau;
    }
    public static int UCLN(int a, int b){
        while (a != b){
            if (a > b) a = a - b;
            if (a < b) b = b - a;
        }
        return a;
    }

    void toiGianPS(){
        int a = UCLN(getMau(),getTu());
        this.setMau(getMau()/a);
        this.setTu(getTu()/a);
    }

    public void congPS(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo psTong =  new PhanSo(ts, ms);
        psTong.toiGianPS();
        System.out.println("Tổng hai phân số = " + psTong.Tu + "/" + psTong.Mau);
    }

    public void truPS(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo psHieu = new PhanSo(ts, ms);
        psHieu.toiGianPS();
        System.out.println("Hiệu hai phân số = " + psHieu.Tu + "/" + psHieu.Mau);
    }

    public void nhanPS(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo psTich = new PhanSo(ts, ms);
        psTich.toiGianPS();
        System.out.println("Tích hai phân số = " + psTich.Tu + "/" + psTich.Mau);
    }

    public void chiaPS(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo psThuong = new PhanSo(ts, ms);
        psThuong.toiGianPS();
        System.out.println("Thương hai phân số = " + psThuong.Tu + "/" + psThuong.Mau);
    }
    public void ssPS (PhanSo ps){
        int a = this.getTu() * ps.getMau();
        int b = this.getMau() * ps.getTu();
        if (a > b) {
            System.out.print("Phân số " + this.getTu() + "/" + this.getMau() + " > ");
            System.out.println("Phân số " +ps.getTu() + "/" + ps.getMau());
        }
        else {
            System.out.print("Phân số " + this.getTu() + "/" + this.getMau() + " < ");
            System.out.println("Phân số " +ps.getTu() + "/" + ps.getMau());
        }
    }

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(15,9);
        PhanSo ps2 = new PhanSo(9,15);

        // Cong, tru, nhan, chia Phan So

        ps1.congPS(ps2);
        ps1.truPS(ps2);
        ps1.chiaPS(ps2);
        ps1.nhanPS(ps2);

        //  So sanh hai phan so;

        ps1.ssPS(ps2);
        ps2.ssPS (ps1);
    }

}
