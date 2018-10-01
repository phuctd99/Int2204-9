package phanso;
public class testPS {
    public static void main(String[] args) {
		PS p1 = new PS(1, 3);
		PS p2 = new PS(2, -3);
//		PS p1 = new PS();
//		PS p2 = new PS();
		p1.rutgon();
                p2.rutgon();
//		// nhập phân số
//		p1.nhapPS();
//		p2.nhapPS();
		
		// thực hiện tính toán trên 2 phân số
		PS tong = p1.cong2PS(p2);
		PS tru = p1.tru2PS(p2);
		PS nhan = p1.nhan2PS(p2);
		PS chia = p1.chia2PS(p2);
		
		// in kết quả
		System.out.print(p1.getTu() + "/" + p1.getMau() + " + " 
                        + p2.getTu() + "/" + p2.getMau() + " = ");
		tong.xuatPS();
		System.out.print(p1.getTu() + "/" + p1.getMau() + " - " 
                        + p2.getTu() + "/" + p2.getMau() + " = ");
		tru.xuatPS();
		System.out.print(p1.getTu() + "/" + p1.getMau() + " * " 
                        + p2.getTu() + "/" + p2.getMau() + " = ");
		nhan.xuatPS();
		System.out.print(p1.getTu() + "/" + p1.getMau() + " : " 
                        + p2.getTu() + "/" + p2.getMau() + " = ");
		chia.xuatPS();
		
		// so sánh 2 phân số
		System.out.println("So sánh 2 phân số: ");
		if (p1.equals(p2)) {
			System.out.println(p1.getTu() + "/" + p1.getMau() + " > " 
                                + p2.getTu() + "/" + p2.getMau());
		} else
			System.out.println(p1.getTu() + "/" + p1.getMau() + " < " 
                                + p2.getTu() + "/" + p2.getMau());
	}
}
