public class hospital {
	private String name;//ten benh vien
	private boolean condition;//co so vat chat benh vien
	private float area;//dien tich
	private int patient, sickBed, doctor;//so luong benh nhan,giuong benh,bac si trong benh vien

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public int getDoctor() {
		return doctor;
	}

	public void setDoctor(int doctor) {
		this.doctor = doctor;
	}

	public int getSickBed() {
		return sickBed;
	}

	public void setSickBed(int sickBed) {
		this.sickBed = sickBed;
	}

	public int getPatient() {
		return patient;
	}

	public void setPatient(int patient) {
		this.patient = patient;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	//kiem tra co so vat chat cua benh vien
	public void Condition() {
		if (this.isCondition() == true) System.out.println("co so vst chat tot");
		else System.out.println("co so vat chat can duoc cai thien va nang csp");
	}
	//kiem tra benh vien co qua tai khong
	public boolean test(){
		if(this.getPatient()/this.getDoctor()<=65&&this.getPatient()/this.getSickBed()<=1)return false;
		else return true;
	}
}
