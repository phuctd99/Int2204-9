package fraction;

public class PhanSo {
    private int tuSo, mauSo;

    PhanSo(){
        this.tuSo = 0;
        this.mauSo = 0;
    }

    PhanSo(int tu, int mau) {
        this.tuSo = tu;
        this.mauSo = mau;
    }

    PhanSo(PhanSo p){
        this.tuSo = p.tuSo;
        this.mauSo = p.mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getTuSo() {
        return this.tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getMauSo() {
        return this.mauSo;
    }

    public void getInfo() {
        System.out.println(tuSo + "/" + mauSo);
    }

    public int UCLN(int a, int b){
        if(b == 0) return a;
        else return UCLN(b, a%b);
    }

    public void rutGon()
    {
        int c = UCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo()/c);
        this.setMauSo(this.getMauSo()/c);
    }

    public void congPhanSo(PhanSo ps){
        int ts = this.getTuSo()*ps.getMauSo() + this.getMauSo()*ps.getTuSo();
        int ms = this.getMauSo()*ps.getMauSo();
        PhanSo tongPhanSo = new PhanSo(ts, ms);
        tongPhanSo.rutGon();
        System.out.println("Tong hai phan so la: " + tongPhanSo.tuSo + "/" + tongPhanSo.mauSo);
    }

    public void truPhanSo(PhanSo ps){
        int ts = this.getTuSo()*ps.getMauSo() - this.getMauSo()*ps.getTuSo();
        int ms = this.getMauSo()*ps.getMauSo();
        PhanSo hieuPhanSo = new PhanSo(ts, ms);
        hieuPhanSo.rutGon();
        System.out.println("Hieu hai phan so la: " + hieuPhanSo.tuSo + "/" + hieuPhanSo.mauSo);
    }

    public void nhanPhanSo(PhanSo ps){
        int ts = this.getTuSo()*ps.getTuSo();
        int ms = this.getMauSo()*ps.getMauSo();
        PhanSo tichPhanSo = new PhanSo(ts, ms);
        tichPhanSo.rutGon();
        System.out.println("Tich hai phan so la: " + tichPhanSo.tuSo + "/" + tichPhanSo.mauSo);
    }

    public void chiaPhanSo(PhanSo ps){
        int ts = this.getTuSo()*ps.getMauSo();
        int ms = this.getMauSo()*ps.getTuSo();
        PhanSo thuongPhanSo = new PhanSo(ts, ms);
        thuongPhanSo.rutGon();
        System.out.println("Thuong hai phan so la: " + thuongPhanSo.tuSo + "/" + thuongPhanSo.mauSo);
    }

    public float GiaTri(PhanSo P) // Cái này nên dùng tham chiếu
    {
        float giatri = 0;
        giatri= (float)P.tuSo/P.mauSo; // ép kiểu về float nhé
        return giatri;
    }

    public boolean squals(PhanSo P,PhanSo K)
    {
        if(GiaTri(P) == GiaTri(K)){
            return true;
        } else return false;
    }

    public static void main(String[] args){
        PhanSo ps = new PhanSo();
        PhanSo ps1 = new PhanSo(12, 33);
        PhanSo ps2 = new PhanSo(3, 4);
        PhanSo ps3 = new PhanSo(6, 8);
        System.out.println("Phan So 1: ");
        ps1.getInfo();
        System.out.println("Phan So 2: ");
        ps2.getInfo();
        System.out.println("Phan So 3: ");
        ps3.getInfo();
        System.out.print("Rut gon phan so 3: ");
        ps3.rutGon();
        ps3.getInfo();
        ps1.congPhanSo(ps2);
        ps1.truPhanSo(ps2);
        ps1.nhanPhanSo(ps2);
        ps1.chiaPhanSo(ps2);

        System.out.println();
        if(ps.squals(ps2, ps3) == true){
            System.out.println("Phan so ps2 bang phan so ps3");
        }else{
            System.out.println("Phan so ps2 bang phan so ps3");
        }

    }
}
