public class HoaQua {
    private String loaiQua;
    private String Vi;
    private String KichThuoc;
    private Integer Gia;

    public HoaQua(){
        loaiQua = "";
        Vi = "";
        KichThuoc = "";
        Gia = 0;
    }
    public HoaQua(String loaiQua){
        loaiQua = loaiQua;
        Vi = "";
        KichThuoc = "";
        Gia = 0;
    }

    public Integer getGia() {
        return Gia;
    }

    public void setGia(Integer gia) {
        Gia = gia;
    }

    public String getLoaiQua() {
        return loaiQua;
    }

    public void setLoaiQua(String loaiQua) {
        this.loaiQua = loaiQua;
    }

    public String getVi() {
        return Vi;
    }

    public void setVi(String vi) {
        Vi = vi;
    }

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        KichThuoc = kichThuoc;
    }
}
