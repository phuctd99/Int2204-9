package Cau1;

import java.time.LocalDate;

public class CamSanh extends QuaCam {

    //Hàm khởi tạo cho cam sành
    public CamSanh(String loaiHoaQua, String loaiCam, int giaBan1Can, String nguonGoc, LocalDate ngayNhap, double soLuongKg) {
        super(loaiHoaQua, loaiCam, giaBan1Can, nguonGoc, ngayNhap, soLuongKg);
    }
}
