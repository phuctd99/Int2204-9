import java.util.Scanner;

public class HoaQua {
    protected String source, dateAdd, amout;

    // get.set nguon goc xuat xu
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    // get.set ngay nhap
    public String getDateAdd(){
        return dateAdd;
    }
    public void setDateAdd(String dateAdd){
        this.dateAdd = dateAdd;
    }

    // get.set so luong nhap
    public String getAmout() {
        return amout;
    }
    public void setAmout(String amout) {
        this.amout = amout;
    }

    //ham khoi tao khong tham so
    public HoaQua(){
        this.source = "VN";
        this.dateAdd = "26";
        this.amout = "1000kg";
    }

    // ham khoi tao co tham so
    public HoaQua(String source, String dateAdd, String amout){
        this.source = source;
        this.dateAdd = dateAdd;
        this.amout = amout;
    }

    //ham nhap thong tin
    public void nhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t\t\t Nhap thong tin \t\t\t\t\n");
        System.out.print("\nNguon goc nhap :");
        this.source = sc.nextLine();
        System.out.print("\n Ngay nhap la : ");
        this.dateAdd = sc.nextLine();
        System.out.print("\n so luong nhap la:");
        this.amout = sc.nextLine();
    }

    // ham xuat thong tin
    public void xuatThongtin(){
        System.out.println("\n\t\t\t\t Xuat thong tin \t\t\t\t\n");
        System.out.print("Nguon goc nhap la: " + this.source );
        System.out.print("\nNgay nhap la: " + this.dateAdd);
        System.out.print("\nSo luong nhap la: " + this.amout);
    }


}
