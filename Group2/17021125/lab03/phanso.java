import java.util.Objects;

public class phanso {
    private int tuso;
    private int mauso;

    phanso (int tuso, int mauso ){
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int UCLN (int a, int b){
        int x = Math.abs(a);
        int y = Math.abs(b);
        if (x == 0 || y == 0){
            return 1;
        }
        else{

            while (x != y) {
                if (x > y) {
                    x = x - y;
                } else {
                    y = y - x;
                }
            }
            return x;
        }
    }

    public void toigianPhanso (){
        int ucln = UCLN(this.tuso,this.mauso);
        if (this.tuso == 0){
            System.out.println("0");
        }
        else if (this.tuso % this.mauso == 0){
            System.out.println(this.tuso/this.mauso);
        }
        else{
            System.out.println((this.tuso/ ucln) + "/"+ (this.mauso/ucln));
        }
    }

    public phanso congPS(phanso ps) {
        phanso tong = new phanso(tuso, mauso);
        tong.tuso = this.tuso*ps.mauso + this.mauso*ps.tuso;
        tong.mauso = ps.mauso * this.mauso;
        return tong;
    }

    public phanso truPS(phanso ps) {
        phanso hieu = new phanso(tuso, mauso);
        hieu.tuso = this.tuso*ps.mauso - this.mauso*ps.tuso;
        hieu.mauso = ps.mauso * this.mauso;
        return hieu;
    }

    public phanso nhanPS(phanso ps) {
        phanso tich = new phanso(tuso, mauso);
        tich.tuso = this.tuso*ps.tuso;
        tich.mauso = this.mauso*ps.mauso;
        return tich;
    }

    public phanso chiaPS(phanso ps) {
        phanso thuong = new phanso(tuso, mauso);
        thuong.tuso = this.tuso*ps.mauso;
        thuong.mauso = this.mauso*ps.tuso;
        return thuong;
    }

    public boolean equals (Object a){
       if ((a instanceof  phanso)){
           phanso ps = (phanso) a;
           if (ps.tuso * this.mauso - ps.mauso*this.tuso == 0){
               return true;
           }
           return false;
       }
        return false;
    }

    public static void main(String[] args) {
        phanso a = new phanso(5,-2);
        phanso b = new phanso(-5,2);
        a.congPS(b).toigianPhanso();
        a.truPS(b).toigianPhanso();
        a.nhanPS(b).toigianPhanso();
        a.chiaPS(b).toigianPhanso();

        if(a.equals(b)){
            System.out.println("hai phan so  bang nhau");
        }
        else {
            System.out.println("hai phan so khong bang nhau");
        }
    }
}
