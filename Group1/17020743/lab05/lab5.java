import java.sql.SQLOutput;

public class lab5 {
    class Hoaqua{

            public double giaban;
            public double can;
            String nguongoc;
            String ngaynhap;
            int soluong;
            public double getGiaban() {
                return giaban;
            }
            public void setGiaban(double giaban) {
                this.giaban = giaban;
            }
            public double getCan() {
                return can;
            }
            public void setCan(double can) {
                this.can = can;
            }
            public String getNguongoc() {
                return nguongoc;
            }
            public void setNguongoc(String nguongoc) {
                this.nguongoc = nguongoc;
            }
            public String getNgaynhap() {
                return ngaynhap;
            }
            public void setNgaynhap(String ngaynhap) {
                this.ngaynhap = ngaynhap;
            }
            public int getSoluong() {
                return soluong;
            }
            public void setSoluong(int soluong) {
                this.soluong = soluong;
            }
            public Hoaqua() {
                super();
                giaban = 15000;
                can = 1;
                nguongoc = "Trung Quoc";
                ngaynhap = "1/1/2018";
                soluong = 100;
            }



        }
       class Quacam extends Hoaqua{
            public int somui ;
            public Quacam() {
                giaban = 23000 ;
                can = 1000 ;
                somui = 8 ;
            }





        }
        class Quatao extends Hoaqua{
            public String doto ;
            public Quatao() {
                giaban = 20000 ;
                can = 500 ;
                doto = "rat to" ;
            }



        }
        class CamCaoPhong extends Quacam{
            public String dongot ;
            public CamCaoPhong() {
                giaban = 30000 ;
                can = 1000 ;
                dongot = "rat ngot" ;
            }



        }
        class Camsanh extends Quacam {
            public String dongon;
            public Camsanh() {
                giaban = 25000;
                can = 1000;

            }


        }

        public static void main(String[] args) {

            baitaptuan1 bt = new baitaptuan1();

            Camsanh cs = bt.new Camsanh();
            System.out.println(cs.nguongoc);
            Quacam qc = bt.new Quacam();
            System.out.println(qc.giaban);
            CamCaoPhong ccp = bt.new CamCaoPhong() ;
            System.out.println(ccp.giaban);
            qc.setCan(15);

            System.out.println(qc.can);
    }
}
