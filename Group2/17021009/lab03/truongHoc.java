public class truongHoc {
    private String tenTruong;
    private String diaChi;
    private int soHocSinh;
    private String sdt;

    public truongHoc()
    {
        tenTruong = "";
        diaChi = "";
        soHocSinh = 0;
        sdt = "";
    }

    //Cac phuong thuc get/set


    public String getTenTruong() {
        return tenTruong;
    }
    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoHocSinh() {
        return soHocSinh;
    }
    public void setSoHocSinh(int soHocSinh) {
        this.soHocSinh = soHocSinh;
    }

    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
