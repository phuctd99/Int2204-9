public class ConNguoi {
    private Boolean GioiTinh;
    private int ChieuCao;
    private int Tuoi;
    private int CanNang;
    private String MauDa;
    private String QuocTich;

    public Boolean getGioiTinh() {// tra ve giới tính : 1 la nam, 0 la nu
        return GioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {// cai dat gioi tinh
        GioiTinh = gioiTinh;
    }

    public int getChieuCao() {// tra ve chieu cao la cm
        return ChieuCao;
    }

    public void setChieuCao(int chieuCao) {//cai dat chieu cao
        ChieuCao = chieuCao;
    }

    public int getTuoi() {// tra ve tuoi con nguoi
        return Tuoi;
    }

    public void setTuoi(int tuoi) {// cai dat tuoi con nguoi
        Tuoi = tuoi;
    }

    public int getCanNang() {// tra ve can nang
        return CanNang;
    }

    public void setCanNang(int canNang) {// cai dat can nang
        CanNang = canNang;
    }

    public String getMauDa() {// tra ve mau da
        return MauDa;
    }

    public void setMauDa(String mauDa) {// cai dat mau da
        MauDa = mauDa;
    }

    public String getQuocTich() {// tra ve quoc tich
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {//cai dat quoc tich
        QuocTich = quocTich;
    }
}
