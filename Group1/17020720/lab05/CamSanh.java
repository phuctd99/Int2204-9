package KeThua_Final;

public class CamSanh extends QuaCam {
    private String dacTrung;

    public CamSanh(String nguonGoc, String giaCa, String ngayNhap, String soLuong, String name, String dacTrung) {
        super(nguonGoc, giaCa, ngayNhap, soLuong, name);
        this.dacTrung = dacTrung;
    }

    public String getDacTrung() {
        return dacTrung;
    }

    public void setDacTrung(String dacTrung) {
        this.dacTrung = dacTrung;
    }

    public void getPrintCamSanh(){
        System.out.println("Dac trung: " + dacTrung);
    }
}
