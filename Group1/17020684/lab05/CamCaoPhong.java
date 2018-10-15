
package lab5;

public class CamCaoPhong extends QuaCam {
    protected String mausac="cam";
    private String ngaynhap;
    private int soluong;
    private String nguongoc;
    private double giaban;
    
    public CamCaoPhong() {
        
    }
    public CamCaoPhong( double giaban, String nguongoc, String ngaynhap, int soluong) {
//        super ( giaban, nguongoc, ngaynhap, soluong);
    }
   
    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}