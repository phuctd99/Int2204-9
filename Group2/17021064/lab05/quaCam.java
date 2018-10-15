import java.util.Scanner;

public class quaCam extends hoaQua{
    protected String vungSanXuat ;
    //set/getter
    public void setVungSanXuat(String vungSanXuat) {
        this.vungSanXuat = vungSanXuat;
    }

    public String getVungSanXuat() {
        return vungSanXuat;
    }
    //hàm khơi tạo quaCam
    public quaCam(){
        this.setTen("Quả cam");
        this.setVungSanXuat(this.vungSanXuat);
    }
    //hàm in tên Vùng sản xuất cam
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Vùng sản xuát : " + this.vungSanXuat);
    }
}
