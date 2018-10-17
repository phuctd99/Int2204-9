public class main {
    public static void main(String []args)
    {
        HoaQua hq = new HoaQua();
        hq.nhapThongtin();
        hq.xuatThongtin();

        QuaCam quacam = new QuaCam();
        quacam.nhapThongtin();
        quacam.xuatThongtin();

        QuaTao quatao = new QuaTao();
        quatao.nhapThongtin();
        quacam.xuatThongtin();

        CamCaoPhong ccp = new CamCaoPhong();
        ccp.nhapThongtin();
        ccp.xuatThongtin();


    }
}
