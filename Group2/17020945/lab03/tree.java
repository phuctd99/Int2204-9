public class tree {
	private String name,kind;
	private byte height,witdt;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

	public byte getHeight() {
		return height;
	}
	public void setHeight(byte height) {
		this.height = height;
	}

	public byte getWitdt() {
		return witdt;
	}
	public void setWitdt(byte witdt) {
		this.witdt = witdt;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//kiem tra do tuoi cay dua ra ket luan
	public void cay(){
		if(this.getAge()>=50) System.out.println("cay lau nam can duoc cham soc va bao ve");
		if(this.getAge()<3) System.out.println("cay moi trong");
		if(this.getAge()>=3&&this.getAge()<50) System.out.println("cay truong thanh");
	}
	//kiem tra do an toan cua cay
	public void tanCay(){
		if(this.getWitdt()>=5) System.out.println("can cat tia de dam bao an toan");
		else System.out.println("cay an toan");
	}
}
