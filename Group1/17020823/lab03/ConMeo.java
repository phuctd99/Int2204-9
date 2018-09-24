public class ConMeo {
    private String LoaiMeo;
    private boolean GT;
    private String MauLong;
    private int Tuoi;
    public String getLoaiMeo() {// tra ve ten loai meo
        return LoaiMeo;
    }

    public void setLoaiMeo(String loaiMeo) {//cai dat ten loai meo
        LoaiMeo = loaiMeo;
    }

    public boolean isGT() {//tra ve gioi tinh loai meo, true la duc, false la cai
        return GT;
    }

    public void setGT(boolean GT) {//cai dat gioi tinh cua con meo
        this.GT = GT;
    }

    public String getMauLong() {// tra ve mau long cua con meo
        return MauLong;
    }

    public void setMauLong(String mauLong) {//cai dat mau long cua con meo
        MauLong = mauLong;
    }

    public int getTuoi() {// tra ve so tuoi cua con meo
        return Tuoi;
    }

    public void setTuoi(int tuoi) {// cai dat tuoi con meo
        Tuoi = tuoi;
    }

}
