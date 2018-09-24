public class giaoVien {
    private String ten;
    private int tuoi;
    private String monHoc;
    private String email;
    private String sdt;

    public giaoVien()
    {
        ten = "";
        tuoi = 0;
        monHoc = "";
        email = "";
        sdt = "";
    }

    //Cac phuong thuc get/set

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMonHoc() {
        return monHoc;
    }
    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
