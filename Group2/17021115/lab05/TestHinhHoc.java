package HinhHoc;

public class Test {
	public static void main(String[] args) {
		/* biểu đồ có 3 quan hệ thừa kế
		 	circle thừa kế từ hình
		  	hình CN thừa kế từ hình
		  	hình vuông thừa kế từ hình CN
		 
		*/
		
		Shape hinh = new Shape("xanh", true);
		System.out.println(hinh.toString());
		System.out.println("===========================");
		Circle hinhTron = new Circle(2, "hồng", true);
		System.out.println(hinhTron.toString());
		System.out.println("===========================");
		Rectangle hinhCN = new Rectangle(2, 3, "đỏ", false);
		System.out.println(hinhCN.toString());
		System.out.println("===========================");
		Square hinhVuong = new Square(2, "tím", false);
		System.out.println(hinhVuong.toString());
		
		//	Biến PI có nên để từ khóa final vì trong quá trình sử dụng tránh người dùng thay đổi số làm sai kết quả

	}
}
