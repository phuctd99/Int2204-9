public class HocSinh {
    private String HoTen;
    private String Lop;
    private String MSSV;
    private String NgaySinh;
    private boolean GioiTinh;
    private double DiemTB;
    public String getHoTen() {// ham tra ve ten hoc sinh
        return HoTen;
    }

    public void setHoTen(String hoTen) {//ham cai dat ten hoc sinh
        HoTen = hoTen;
    }

    public String getLop() {//ham tra ve ten lop
        return Lop;
    }

    public void setLop(String lop) {//ham cai dat ten lop
        Lop = lop;
    }

    public String getMSSV() {//ham tra ve ma so cua hoc sinh
        return MSSV;
    }

    public void setMSSV(String MSSV) {//ham cai dat ma so hoc sinh
        this.MSSV = MSSV;
    }

    public String getNgaySinh() {//ham tra ve ngay sinh cua hoc sinh
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {//ham cai dat ngay sinh cua hoc sinh
        NgaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {//ham tra ve gioi tinh, true la nam, false la nu
        return GioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {//ham cai dat gioi tinh hoc sinh
        GioiTinh = gioiTinh;
    }

    public double getDiemTB() {//ham tra ve diem trung binh cua hoc sinh
        return DiemTB;
    }

    public void setDiemTB(double diemTB) {// ham cai dat diem trung binh
        DiemTB = diemTB;
    }



}
