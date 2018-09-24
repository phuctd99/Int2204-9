public class hocSinh {
    private String ten;
    private String lop;
    private String email;
    private String mssv;

    public hocSinh(){
        ten = "";
        lop = "";
        email = "";
        mssv = "";
    }

    //Cac phuong thuc get/set
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMssv() {
        return mssv;
    }
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
}
