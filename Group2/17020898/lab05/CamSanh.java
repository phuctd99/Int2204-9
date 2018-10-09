package com.company;

public class CamSanh extends QuaCam{
    public String doNgot;
    public String muivi;
    public CamSanh(){
        super();
        this.doNgot = " rat ngot ";
        this.muivi = "thom ";
    }

    public CamSanh(String mauSac, String hinhDang, String doNgot, String muivi) {
        super(mauSac, hinhDang);
        this.doNgot = doNgot;
        this.muivi = muivi;
    }

    public void setDoNgot(String doNgot) {
        this.doNgot = doNgot;
    }

    public String getDoNgot() {
        return doNgot;
    }

    public void setMuivi(String muivi) {
        this.muivi = muivi;
    }

    public String getMuivi() {
        return muivi;
    }

    @Override
    public String toString() {
        return "CamSanh{" +
                "doNgot='" + doNgot + '\'' +
                ", muivi='" + muivi + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", hinhDang='" + hinhDang + '\'' +
                ", nguonGoc='" + nguonGoc + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }
}
