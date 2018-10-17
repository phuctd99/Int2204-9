import java.util.Scanner;

public class QuaCam extends HoaQua{

    public String name;

    // get.set ten hoa qua
    public String getName(){

        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    // khoi tao ke thua khong tham so
    public QuaCam()
    {
          super();
          this.name = "Cam";
    }


    // khoi tao ke thua co tham so
     public QuaCam(String source,String dateAdd, String amout, String name){
        super(source,dateAdd,amout);
        this.name = "Cam";
     }
     @Override
     // ke thua ham nhap tu HoaQua
    public void nhapThongtin()
    {
        Scanner sc = new Scanner(System.in);
        super.nhapThongtin();
        System.out.print("\nTen loai hoa qua :");
        this.name = sc.nextLine();
    }
    @Override
     // ke thua ham xuat thong tin tu HoaQua
    public void xuatThongtin()
    {
        super.xuatThongtin();
        System.out.print("\nten hoa qua :" + this.name);
    }

}
