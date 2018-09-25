public class street {
	private float length,witdt;//chieu dai va rongj cua con duong
	private String name;//ten duong
	private short time;//nam khoi cong
	public street(String name,float length,float witdt, short time){
		this.name=name;
		this.length=length;
		this.witdt=witdt;
		this.time=time;
	}

	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}

	public float getWitdt() {
		return witdt;
	}
	public void setWitdt(float witdt) {
		this.witdt = witdt;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public short getTime() {
		return time;
	}
	public void setTime(short time) {
		this.time = time;
	}
	//kiem ta chieu rong cua duong co du dieu kien cho phep cho o to di
	public boolean otoRun(){
		if(this.getWitdt()>=5)return true;
		else return false;
	}
	//kiem tra duong co can bao tri bao duong khong
	public void test(){
		if(this.getTime()<2015) System.out.println("can duoc quan sat nhieu de dam bao an toan");
		else System.out.println("duong moi di vao su dung");
	}
}
