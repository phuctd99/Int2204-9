package Bai_tap;

public class Hinh_tron extends Hinh_hoc {

    double banKinh = 1;

    public Hinh_tron(Toa_do trongTam, String mau, double banKinh) {
        super(trongTam, mau);
        this.banKinh = banKinh;
        this.ten = "hinh tron";
    }

    public Hinh_tron() {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void khoiTao() {
        System.out.println("khoi tao mot hinh tron");

        System.out.print  ("hinh nay co mau gi : ");
        this.mau = scanner.next();

        System.out.print  ("nhap toa do tam : ");
        trongTam.set( scanner.nextDouble(), scanner.nextDouble() );

        System.out.println("nhap ban kink  : ");
        banKinh = scanner.nextDouble();

    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.print ("tam : "  );
        trongTam.print();
        System.out.println();
        System.out.println("ban kinh : " + banKinh);
        System.out.println("----------------------");
    }

    @Override
    public boolean trungNhau(Hinh_tron hinh_tron) {
        if ( oxy.trungNhau( trongTam, hinh_tron.getTrongTam() ) ) {
            if(  banKinh == hinh_tron.getBanKinh() ); return  true;
        }
        return false;
    }

    @Override
    public boolean trungNhau(Hinh_chu_nhat hinh_chu_nhat) {
        return false;
    }

    @Override
    public boolean trungNhau(Hinh_tam_giac hinh_tam_giac) {
        return false;
    }
}
