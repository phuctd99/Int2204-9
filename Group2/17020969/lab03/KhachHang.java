// class Tiền điện của khách hàng
import java.util.*;
public class KhachHang
{
	// xây dựng class gồm các thuộc tính: mã khách hàng, số lượng, đơn giá, thành tiền, ngày của hóa đơn và họ tên khách hàng.
     private int MaKH, SoLuong;
     private double DonGia, ThanhTien;
     private String NgayHD, HoTenKH;
     Scanner in =new Scanner(System.in);
     // phuong thuc khoi tao khong co tham so
     public KhachHang() {
         this.MaKH = 0;
         this.HoTenKH = "";
         this.DonGia = 0;
         this.NgayHD = "";
         this.SoLuong = 0;
     }
     // phuong thuc sao chep
     public KhachHang(int ma, double dgia, String ngay, String hoten, int sl, double ttien) {
         this.MaKH = ma;
         this.DonGia = dgia;
         this.NgayHD = ngay;
         this.HoTenKH = hoten;
         this.SoLuong = sl;
         this.ThanhTien = ttien;
     }
     //gan gia tri vao thuoc tinh
     public void setMaKH(int maKH) { this.MaKH = maKH; }
     public void setDonGia(double donGia) { this.DonGia = donGia; }
     public int getMaKH() { return MaKH; }
     public void setNgayHD(String ngayHD) { this.NgayHD = ngayHD;}
     public void setHoTenKH(String hoTenKH) { this.HoTenKH = hoTenKH;}
     public void setThanhTien(double thanhTien) { this.ThanhTien = thanhTien; }
     // phuong thuc tra ve gia tri cac thuoc tinh
     public double getDonGia() { return DonGia; }    
     public String getNgayHD() { return NgayHD;}   
     public String getHoTenKH() { return HoTenKH;}  
     public int getSoLuong() { return SoLuong; }
     public double getThanhTien() { return ThanhTien; }
    
     // nhập thông tin
     public void nhap() {
          System.out.println("Nhap Ma Khach Hang: ");
          MaKH = in.nextInt();
          System.out.println("Ho va Ten Khach Hang: ");
          HoTenKH = in.next();
          System.out.println("Ngay Lap Hoa Don: ");
          NgayHD = in.next();
          System.out.println("So Luong(KW): ");
          SoLuong = in.nextInt();
          System.out.println("Don Gia: ");
          DonGia = in.nextDouble();
     }
     // trả về thông tin khách hàng
     public String toString() {
          return "[MaKH: " + MaKH + ", HoTenKH: " + HoTenKH + ", NgayHD: " + NgayHD
                  + ", DonGia: " + DonGia + ", SoLuong: " +SoLuong;
     }
}