package KeThua_Final;

public class HoaQua {
    private String nguonGoc, giaCa, ngayNhap, soLuong;

    HoaQua(String nguonGoc, String giaCa, String ngayNhap, String soLuong){
        this.nguonGoc = nguonGoc;
        this.giaCa = giaCa;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public String getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(String giaCa) {
        this.giaCa = giaCa;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public void getInfo(){
        System.out.println("Nguon goc: " + nguonGoc);
        System.out.println("Ngay nhap: " + ngayNhap);
        System.out.println("Gia ca: " + giaCa);
        System.out.println("So luong: " + soLuong);
    }
}
