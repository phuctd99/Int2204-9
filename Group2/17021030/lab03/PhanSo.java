package lab03;

public class PhanSo {
    private int TuSo;
    private int MauSo;
    // phuong thuc khoi tao co doi
    public PhanSo(int TuSo, int MauSo) {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }
    // phuong thuc khoi tao khong doi
    public PhanSo() {
        TuSo = 0;
        MauSo = 1;
    }
    // phuong thuc lay ra tu so
    public int getTuSo() {
        return TuSo;
    }
    // phuong thuc cai dat tu so
    public void setTuSo(int TuSo) {
        this.TuSo = TuSo;
    }
    // phuong thuc lay ra mau so
    public int getMauSo() {
        return MauSo;
    }
    // phuong thuc cai dat mau so
    public void setMauSo(int MauSo) {
        this.MauSo = MauSo;
    }
    // phuong thuc cong 2 phan so
    public PhanSo congPhanSo(PhanSo ps) {
        PhanSo result = new PhanSo();
        result.TuSo = this.TuSo*ps.MauSo + ps.TuSo*this.MauSo;
        result.MauSo = this.MauSo*ps.MauSo;
        if (result.TuSo == 0) return result;
        int rut_gon = Fibonaci_and_UCLN.UCLN(result.TuSo, result.MauSo);
        result.TuSo /= rut_gon;
        result.MauSo /= rut_gon;
        return result;
    }
    // phuong thuc tru 2 phan so
    public PhanSo truPhanSo(PhanSo ps) {
        PhanSo result = new PhanSo();
        result.TuSo = this.TuSo*ps.MauSo - ps.TuSo*this.MauSo;
        result.MauSo = this.MauSo*ps.MauSo;
        if (result.TuSo == 0) return result;
        int rut_gon = Fibonaci_and_UCLN.UCLN(result.TuSo, result.MauSo);
        result.TuSo /= rut_gon;
        result.MauSo /= rut_gon;
        return result;
    }
    // phuong thuc nhan 2 phan so
    public PhanSo nhanPhanSo(PhanSo ps) {
        PhanSo result = new PhanSo();
        result.TuSo = this.TuSo*ps.TuSo;
        result.MauSo = this.MauSo*ps.MauSo;
        if (result.TuSo == 0) return result;
        int rut_gon = Fibonaci_and_UCLN.UCLN(result.TuSo, result.MauSo);
        result.TuSo /= rut_gon;
        result.MauSo /= rut_gon;
        return result;
    }
    // phuong thuc cong 2 phan so
    public PhanSo chiaPhanSo(PhanSo ps) {
        PhanSo result = new PhanSo();
        if (ps.TuSo != 0 ) {
            result.TuSo = this.TuSo*ps.MauSo;
            result.MauSo = this.MauSo*ps.TuSo;
            if (result.TuSo == 0) return result;
            int rut_gon = Fibonaci_and_UCLN.UCLN(result.TuSo, result.MauSo);
            result.TuSo /= rut_gon;
            result.MauSo /= rut_gon;
    
        }
        return result;
    }
    // phuong thuc so sanh 2 phan so
    public boolean equals(PhanSo ps) {
        return (this.TuSo*ps.MauSo == ps.TuSo*this.MauSo) ;
    }
}
