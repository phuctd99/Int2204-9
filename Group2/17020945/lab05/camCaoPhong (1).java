public class camCaoPhong extends quaCam {
	private String quality;
	public camCaoPhong(){
		quality = "tot";
		this.setOrigin("Hoa Bimh");
		this.setFruit("cam Cao Phong");
		this.setTaste("ngot");
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	public void getInfo(){
		System.out.println("qua: "+this.getFruit());
		System.out.println("nguon goc: "+this.getOrigin());
		System.out.println("chat luong: "+this.getQuality());
		System.out.println("vi: "+this.getTaste());
	}
}
