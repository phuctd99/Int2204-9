// class mo ta ve meo
public class Cat {
	// tao ra cac thuoc tinh ten, tuoi, can nang cua con meo
	private String name;
	private int age;
    private int height;
    // phuong thuc khoi tao sao chep 
    public Cat(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    // gan gia tri cua bien vao cac thuoc tinh
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setHeight(int height) {this.height = height; }
    // tra ve gia tri cua cac thuoc tinh
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getHeight() { return height; }
   
    public String getInfo() {
		return("Ten cua meo: " + this.name + ", Tuoi: " + this.age
				+ ", Can nang: " + this.height +"kg");
	}
}
