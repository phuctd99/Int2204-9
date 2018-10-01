package OopWeek4;

public class Week4 {
	
	public static int timMax(int a, int b) {
		if(a > b) {
			return a;
		}
		return b;
	}
	
	public static int timMinCuaMang(int []mangSoNguyen) {
		int min = mangSoNguyen[0];
		for(int i=1; i<mangSoNguyen.length; i++) {
			if(min > mangSoNguyen[i]) {
				min = mangSoNguyen[i];
			}
		}
		return min;
	}
	
	public static String tinhChiSoBMI(double canNang, double chieuCao) {
		double BMI = canNang / (chieuCao*chieuCao);
		String ketQua = "";
		if(BMI < 18.5) {
			ketQua = "Thiếu cân";
		}
		if(BMI >= 18.5 && BMI <= 24.99) {
			ketQua = "Bình thường";
		}
		if(BMI >= 23 && BMI <= 24.99) {
			ketQua = "Thừa cân";
		}
		if(BMI > 25) {
			ketQua = "Béo phì";
		}
		return ketQua;
	}
}