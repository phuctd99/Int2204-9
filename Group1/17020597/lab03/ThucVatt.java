package Lab03;

public class ThucVatt {
	private String loaiThan;
	private String moiTruongSong;
	public void setLoaiThan(String cay) { this.loaiThan = cay; }
	public void setMoiTruongSong(String cay) { this.moiTruongSong = cay; }
	public String getLoaiThan() { return this.loaiThan;}
	public String getMoiTruongSong() { return this.moiTruongSong;}
	public ThucVatt() {
		this.loaiThan = "Than thao";
		this.moiTruongSong = "tren can";
	}
	public boolean sameGroup(ThucVatt s1, ThucVatt s2) {
		if (s1.getLoaiThan().equals(s2.getLoaiThan())) {
            return true;
        }
        return false;
	}
}
