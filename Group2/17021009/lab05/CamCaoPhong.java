package Cau1;

import java.time.LocalDate;

public class CamCaoPhong extends QuaCam {

    //Hàm khởi tạo cho cam cao phong
    public CamCaoPhong(String loaiHoaQua, String loaiCam, int giaBan1Can, String nguonGoc, LocalDate ngayNhap, double soLuongKg) {
        super(loaiHoaQua, loaiCam, giaBan1Can, nguonGoc, ngayNhap, soLuongKg);
    }
}
