public class teacher {
	private String name,object,email;
	private byte age;
	private boolean sex,review;
	public teacher(String name,String object,String email,byte age,boolean sex,boolean review){
		this.name=name;
		this.object=object;
		this.email=email;
		this.age=age;
		this.sex=sex;
		this.review=review;
	}
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//object
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	//email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//age
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	//review
	public boolean isReview() {
		return review;
	}
	public void setReview(boolean review) {
		this.review = review;
	}
	//bool
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	//in ra gioi tinh giao vien
	public void gioiTinh(){
		if (this.isSex()==true) System.out.println("gioi tinh giao vien: nu");
		else System.out.println("gioi tinh giao vien la: nam");
	}
	public void chatLuong(){
		if (this.isSex()==true) System.out.println("giao vien gioi");
		else System.out.println("giao vien binh thuong");
	}
}
