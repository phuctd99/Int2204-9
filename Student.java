package Lab03;


public class Student {
	private String name;
	
	private String ID;
	
	private int hocPhi;
	
	private String group;
	
	public void setName(String name) {this.name = name;}
	
	public void setID(String ID) {this.ID = ID;}
	
	public void sethocPhi(int hocPhi) {this.hocPhi = hocPhi;}
	
	public void setGroup(String group) {this.group = group; }
	
	public String getName() { return this.name;}
	
	public String getID() { return this.ID;}
	
	public int getHocPhi() { return this.hocPhi;}
	public String getGroup() { return this.group;}
	public Student() {
		this.name = "Nguyen Ngoc Ngan";
		this.ID = "1702****";
		this.hocPhi = 0;
		this.group = "K62-CL";
	}
	
}
