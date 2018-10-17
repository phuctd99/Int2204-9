package lab05bt1;
class Hoaqua {
    private int gia, soluong;          // khởi tạo đối tượng hoa quả gồm các thuộc 
    private String nguongoc, ngaynhap;// tính giá bán, nguồn gốc, ngày nhập, số lượng
    public int getGia() { // getter gia ban
        return this.gia;
    }
    public void setGia(int n) { // setter gia ban
        this.gia = n;
    }
    public String getNguongoc() { // getter nguon goc
        return this.nguongoc;
    }
    public void setNguongoc(String s) { // setter nguon goc
        this.nguongoc = s;
    }
    public String getNgaynhap() { // getter ngay nhap
        return this.ngaynhap;
    }
    public void setNgaynhap(String s) { // setter ngay nhap
        this.ngaynhap = s;
    }
    public int getSoluong() { // getter so luong
        return this.soluong;
    }
    public void setSoluong(int n) { // setter so luong
        this.soluong = n;
    }
    public Hoaqua(int g, String ng, String date, int sl) { // constructor
        this.gia = g;
        this.nguongoc = ng;
        this.ngaynhap = date;
        this.soluong = sl;
    }
    public void getInfo(Hoaqua hq) { // ham in ra thong tin 
        System.out.println("Gia ban:" + this.gia);
        System.out.println("Nguon goc:" + this.nguongoc);
        System.out.println("Ngay nhap:" + this.ngaynhap);
        System.out.println("So luong:" + this.soluong + "kg");
    }
}
class Quacam extends Hoaqua {
    
    public Quacam(int g, String ng, String date, int sl) {
        super(g, ng, date, sl);
    }
    
}
class Quatao extends Hoaqua{
    
    public Quatao(int g, String ng, String date, int sl) {
        super(g, ng, date, sl);
    }
    
}
class Camsanh extends Quacam{
    
    public Camsanh(int g, String ng, String date, int sl) {
        super(g, ng, date, sl);
    }
    
}
class CamCaoPhong extends Quacam {
    
    public CamCaoPhong(int g, String ng, String date, int sl) {
        super(g, ng, date, sl);
    }
    
}
public class Lab05BT1 {

    
    public static void main(String[] args) {
        Hoaqua nho = new Hoaqua(150000, "My", "7/10/2018", 100);
        Quacam camcanh = new Quacam(80000, "Viet Nam", "6/10/2018", 30);
        Quatao tao = new Quatao(100000, "My", "5/10/2018/", 50);
        CamCaoPhong caophong = new CamCaoPhong(50000, "Cao Phong", "4/10/2018", 80);
        Camsanh camsanh = new Camsanh(30000, "Ha Giang", "3/10/2018", 10);
        System.out.println("Qua nho:");
        nho.getInfo(nho);
        System.out.println();
        System.out.println("Qua cam Canh:");
        camcanh.getInfo(nho);
        System.out.println();
        System.out.println("Qua tao:");
        tao.getInfo(nho);
        System.out.println();
        System.out.println("Qua cam Cao Phong:");
        caophong.getInfo(nho);
        System.out.println();
        System.out.println("Qua cam sanh:");
        camsanh.getInfo(nho);
    }
    
}
