public class CoGiao {
    private String Ten;
    private int Tuoi;
    private String Monday;
    private String DiaChi;
    private boolean GioiTinh;

    public boolean isGioiTinh() {// ham tra ve gioi tinh, true la nam, false la nu
        return GioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {//ham cai dat  gioi tinh
        GioiTinh = gioiTinh;
    }

    public int getTuoi() {// ham tra ve so tuoi
        return Tuoi;
    }

    public void setTuoi(int tuoi) {// ham cai dat tuoi
        Tuoi = tuoi;
    }

    public String getMonday() {// ham tra ve mon day
        return Monday;
    }

    public void setMonday(String monday) {//ham cai dat ten mon day
        Monday = monday;
    }

    public String getDiaChi() {//ham tra ve dia chi
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {//ham cai dat dia chi
        DiaChi = diaChi;
    }

    public String getTen() {//ham tra ve ten giao vien
        return Ten;
    }

    public void setTen(String ten) {//ham cai dat ten giao vien
        Ten = ten;
    }
}
