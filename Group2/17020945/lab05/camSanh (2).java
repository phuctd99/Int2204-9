public class camSanh extends quaCam{
	private String skin;
	public camSanh(){
		this.setFruit("cam sanh");
		this.setOrigin("Ha Giang");
		this.setCost(35000);
		skin = "san sui";
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}
	public void getInfo(){
		System.out.println("qua: "+this.getFruit());
		System.out.println("xuat xu: "+this.getOrigin());
		System.out.println("gia ca: "+this.getCost());
		System.out.println("vo: "+this.getSkin());
	}
}
