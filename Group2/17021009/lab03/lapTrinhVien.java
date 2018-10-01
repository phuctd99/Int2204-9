public class lapTrinhVien {
    private String ten;
    private int tuoi;
    private int namKinhNghiem;
    private String ngonNguLapTrinh;
    private String sdt;

    public lapTrinhVien(){
        ten = "";
        tuoi = 0;
        namKinhNghiem = 0;
        ngonNguLapTrinh = "";
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

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }
    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }

    public String getNgonNguLapTrinh() {
        return ngonNguLapTrinh;
    }
    public void setNgonNguLapTrinh(String ngonNguLapTrinh) {
        this.ngonNguLapTrinh = ngonNguLapTrinh;
    }

    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
