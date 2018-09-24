public class QuanAn {
    private String TenQuanAn;
    private String TenCacMonAn;
    private String DiaChi;
    private int NgayThanhLap;

    public String getTenQuanAn() {// ham tra ve ten quan an
        return TenQuanAn;
    }

    public void setTenQuanAn(String tenQuanAn) {// ham cai dat ten quan an
        TenQuanAn = tenQuanAn;
    }

    public String getTenCacMonAn() {//ham tra ve ten cac mon an
        return TenCacMonAn;
    }

    public void setTenCacMonAn(String tenCacMonAn) {//ham cai dat ten cac mon an
        TenCacMonAn = tenCacMonAn;
    }

    public String getDiaChi() {//ham tra ve dia chi quan an
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {//ham cai dat dia chi quan an
        DiaChi = diaChi;
    }

    public int getNgayThanhLap() {//ham tra ve ngay xay quan
        return NgayThanhLap;
    }

    public void setNgayThanhLap(int ngayThanhLap) {//ham cai dat ngay xay quan
        NgayThanhLap = ngayThanhLap;
    }
}
