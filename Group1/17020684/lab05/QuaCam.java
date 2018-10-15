
package lab5;


public class QuaCam extends HoaQua {
    
    
    public QuaCam() {
    }

    @Override
    public String toString() {
        return "QuaCam{" + "giaban=" + giaban + ", nguongoc=" + nguongoc + ", ngaynhap=" + ngaynhap + ", soluong=" + soluong + '}';
    }
    public QuaCam( double giaban, String nguongoc, String ngaynhap, int soluong) {
        super(giaban, nguongoc, ngaynhap, soluong);
        
    }


    @Override
    public double getGiaban() {
        return giaban;
    }

    @Override
    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    @Override
    public String getNguongoc() {
        return nguongoc;
    }

    @Override
    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    @Override
    public String getNgaynhap() {
        return ngaynhap;
    }

    @Override
    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    @Override
    public int getSoluong() {
        return soluong;
    }

    @Override
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

}
