// class mo ta tung thanh vien trong gia dinh
public class Person {
    private String name; // Trường name - Thông tin tên người.
    private int bornYear; // Trường bornYear - thông tin năm sinh
    private String placeOfBirth; // Trường placeOfBirth - thông tin nơi sinh.
    private String gioiTinh;        // Trường gioiTinh - Thông tin giới tính người. 
    // Constructor có 3 tham số.
    // Mục đích nhằm để gán các giá trị cho các trường của Person.
    // Chỉ định rõ tên, năm sinh, nơi sinh của một người.
    public Person(String name, int bornYear, String placeOfBirth) {
        this.name = name;
        this.bornYear = bornYear;
        this.placeOfBirth = placeOfBirth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getBornYear() {
        return bornYear;
    }
    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
    public String getGioiTinh() {
		return gioiTinh;
	}
    public String getInfo() {
		return("ten : " + this.name + ", Nam sinh: " + this.bornYear
				+ ", Noi sinh: " + this.placeOfBirth + ", Gioi tinh: " + this.gioiTinh);
	}
}