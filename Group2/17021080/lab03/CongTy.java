package Doi_tuong_xung_quanh;

public class CongTy  // mieu ta mot nhan vien tronng cong ty
{
    private String name;
    private String email;
    private int luong;
    private CongTy giamdoc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public CongTy getGiamdoc() {
        return giamdoc;
    }

    public void setGiamdoc(CongTy giamdoc) {
        this.giamdoc = giamdoc;
    }

    public CongTy(String name, String email, int luong, CongTy giamdoc) {
        this.name = name;
        this.email = email;
        this.luong = luong;
        this.giamdoc = giamdoc;
    }
}
