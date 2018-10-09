package KeThua_Final;

public class Main {
    public static void main(String[] args){
        HoaQua qt = new QuaTao("Nhat Ban", "50$/kg", "5/10/2018", "10 kg", "xanh", "gion, ngot");
        qt.getInfo();
        ((QuaTao) qt).getPrintQuaTao();

        HoaQua cs = new CamSanh("Viet Nam", "10$/kg","15/10/2018", "15 kg", "Cam sanh", "xanh, chua" );
        cs.getInfo();
        ((CamSanh) cs).getPrintCamSanh();
        ((CamSanh) cs).getPrintQuaCam();

        HoaQua ccp = new CamCaoPhong("My", "70$", "10/10/2018", "5kg", "Cam cao Phong", "chin vàng, mọng nước, ngot");
        ccp.getInfo();
        ((CamCaoPhong) ccp).getPrintQuaCam();
        ((CamCaoPhong) ccp).getPrintCamCaoPhong();
    }
}
