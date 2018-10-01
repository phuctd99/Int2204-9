public class idol {
	private String name,country,job;
	private byte age;
	private boolean sex;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	//gioi tinh
	public void gioitinh(){
		if(this.isSex()==true) System.out.println("nu");
		else System.out.println("nam");
	}
}
