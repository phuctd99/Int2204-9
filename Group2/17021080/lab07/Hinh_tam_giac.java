package Bai_tap;

public class Hinh_tam_giac extends Hinh_hoc {
    public Hinh_tam_giac() {
    }

    private Toa_do[] diem = new Toa_do[3];
    private double[] canh = new double[3];

    public Toa_do[] getDiem() {
        return diem;
    }

    public void setDiem(Toa_do[] diem) {
        this.diem = diem;
    }

    public double[] getCanh() {
        return canh;
    }

    public void setCanh(double[] canh) {
        this.canh = canh;
    }

    public Hinh_tam_giac(Toa_do trongTam, String mau) {
        super(trongTam, mau);
        this.ten = "hinh tam giac";
    }

    @Override
    public void khoiTao() {
        System.out.println("khoi tao mot hinh " + ten);
        System.out.print  ("hinh nay co mau gi : ");
        this.mau = scanner.nextLine();

        System.out.print  ("nhap toa do diem thu nhat : ");
        diem[0].set( scanner.nextDouble(), scanner.nextDouble() );

        System.out.print  ("nhap toa do diem thu hai  : ");
        diem[1].set( scanner.nextDouble(), scanner.nextDouble() );

        System.out.print  ("nhap toa do diem thu ba   : ");
        diem[2].set( scanner.nextDouble(), scanner.nextDouble() );

        trongTam.set(  (diem[0].getX() + diem[1].getX() + diem[2].getX()  ) /3 ,
                       (diem[0].getY() + diem[1].getY() + diem[2].getY() ) /3     );
        canh[0] = oxy.khoang_cach( diem[0], diem[1]);
        canh[1] = oxy.khoang_cach( diem[2], diem[1]);
        canh[2] = oxy.khoang_cach( diem[0], diem[2]);

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

    public boolean isTamGiac() {
        return ( ten.equalsIgnoreCase("hinh tam giac"));
    }

    public boolean isHinhTron() {
        return ( ten.equalsIgnoreCase("hinh tron"));
    }

    public boolean isTamHcn (){
        return ( ten.equalsIgnoreCase("hinh chu nhat"));
    }

    public boolean isTamvuong() {
        return ( ten.equalsIgnoreCase("hinh vuong"));
    }

    public boolean cungLoai( Hinh_hoc hinh_hoc ) {
        return ( ten.equalsIgnoreCase( hinh_hoc.getTen() ) );
    }


    @Override
    public boolean trungNhau(Hinh_tron hinh_tron) {
        return false;
    }

    @Override
    public boolean trungNhau(Hinh_tam_giac hinh_tam_giac) {
        int dem =0;
        for (int i = 0; i<3; i++) {
            for (int j = 0; j < 3; j++)
                if (oxy.trungNhau(diem[i], hinh_tam_giac.getDiem()[j])) dem++;

        }
        return (dem == 3);
    }

    @Override
    public boolean trungNhau(Hinh_chu_nhat hinh_chu_nhat) {
        return false;
    }
}
