public class lake {
	private float area,depth;//dien tich ,do sau cua ho
	private byte number;//so loai ca co trong ho
	private boolean swim,fish;//boi va cau ca co duoc khong

	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}

	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}

	public byte getNumber() {
		return number;
	}
	public void setNumber(byte number) {
		this.number = number;
	}

	public boolean isSwim() {
		return swim;
	}
	public void setSwim(boolean swim) {
		this.swim = swim;
	}

	public boolean isFish() {
		return fish;
	}
	public void setFish(boolean fish) {
		this.fish = fish;
	}
	//kiem tra co duoc boi va cau ca khong
	public void Swim(){
		if(this.isSwim()==true) System.out.println("ban co the boi");
		else System.out.println("ban khong duoc boi");
	}
	public void Fish(){
		if(this.isFish()==true) System.out.println("ban co the cau ca");
		else System.out.println("ban khong the cau ca");
	}
	//kiem tra do sau cua ho xem co dam bao an toan khong
	public void testDepth(){
		if(this.getDepth()<=2) System.out.println("ho an toan voi nguoi lon");
		else System.out.println("ho nguy hiem");
	}
}
