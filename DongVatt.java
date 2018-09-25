package Lab03;

public class DongVatt {
	private String loai;
	private String moiTruongSong;
	public void setLoai(String dv) { this.loai = dv; }
	public void setMoiTruongSong(String dv) { this.moiTruongSong = dv; }
	public String getLoai() { return this.loai;}
	public String getMoiTruongSong() { return this.moiTruongSong;}
	public DongVatt() {
		this.loai = "An co";
		this.moiTruongSong = "Tren can";
	}
	public boolean cungLoai(DongVatt dv1, DongVatt dv2) {
		if(dv1.getLoai().equals(dv2.getLoai())) {
			return true;
		}
		return false;
	}
}
