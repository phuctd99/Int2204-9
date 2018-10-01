public class cat {
	private float height,weigh;
	private boolean sex;
	private String kind;//giong meo
	private byte age;

	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public float getWeigh() {
		return weigh;
	}
	public void setWeigh(float weigh) {
		this.weigh = weigh;
	}

	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	//gioi tinh
	public void gioitinh(){
		if(this.isSex()==true) System.out.println("cai");
		else System.out.println("duc");
	}
}
