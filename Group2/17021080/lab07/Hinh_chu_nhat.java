package Bai_tap;

public class Hinh_chu_nhat extends Hinh_hoc {

    protected Toa_do[] diem = new Toa_do[4];

    protected double chieuDai ;
    protected double chieuRong ;

    public Hinh_chu_nhat(Toa_do trongTam, String mau, Toa_do[] diem) {
        super(trongTam, mau);
        this.diem = diem;
        this.ten = "hinh chu nhat";
    }

    public Toa_do[] getDiem() {
        return diem;
    }

    public void setDiem(Toa_do[] diem) {
        this.diem = diem;
    }

    public Hinh_chu_nhat() {
    }

    @Override
    public void khoiTao () {

        System.out.println("khoi tao mot hinh " + ten);
        System.out.print  ("hinh nay co mau gi : ");
        this.mau = scanner.nextLine();

        System.out.print  ("nhap toa do diem thu nhat : ");
        diem[0].set( scanner.nextDouble(), scanner.nextDouble() );

        System.out.print  ("nhap toa do diem thu hai  : ");
        diem[1].set( scanner.nextDouble(), scanner.nextDouble() );

        System.out.print  ("nhap toa do diem thu ba   : ");
        diem[2].set( scanner.nextDouble(), scanner.nextDouble() );

        System.out.print  ("nhap toa do diem thu tu  : ");
        diem[3].set( scanner.nextDouble(), scanner.nextDouble() );

        double d1 = oxy.khoang_cach( diem[0], diem[1] );
        double d2 = oxy.khoang_cach( diem[1], diem[2] );

        if ( d1 >= d2) {
            chieuDai = d1;
            chieuRong = d2;
        } else {
            chieuDai = d2;
            chieuRong = d1;
        }

        trongTam.set(  (diem[0].getX() + diem[1].getX() + diem[2].getX() + diem[3].getX() ) /4 ,
                       (diem[0].getY() + diem[1].getY() + diem[2].getY() + diem[3].getY() ) /4     );

    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.print ("toa do cac diem lan luot la : ");
        for (int i=0; i<4 ;i++) {
            diem[i].print();
            System.out.print(" ");
        }
    }

    @Override
    public boolean trungNhau(Hinh_chu_nhat hinh_chu_nhat) {
        int dem =0;
        for (int i = 0; i<4; i++) {
            for (int j = 0; j < 4; j++)
                if (oxy.trungNhau(diem[i], hinh_chu_nhat.getDiem()[j])) dem++;

        }
        return (dem == 4);
    }

    @Override
    public boolean trungNhau(Hinh_tam_giac hinh_tam_giac) {
        return false;
    }

    @Override
    public boolean trungNhau(Hinh_tron hinh_tron) {
        return false;
    }
}
