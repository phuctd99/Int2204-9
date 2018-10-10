package Cau1;

public class QuaTao extends HoaQua{
	public String giongTao;
	
	public QuaTao (int giaBan, String nguonGoc, String ngayNhap, int soLuong, String loaiQua, String giongTao) {
		super(giaBan,nguonGoc,ngayNhap,soLuong,loaiQua);
		this.giongTao	= giongTao;
	}	
}
