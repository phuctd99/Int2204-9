public class lab04 {
	public static int gtln(int a, int b)
	{
		if(a>b){
			return a;
		}
		else
			return b;
	}
	public static int gtnn(int[] n)
	{
		int min = n[0];
		for(int i=1; i<n.length; i++){
			if(min>n[i]){
				min = n[i];
			}
		}
		return min;
	}
	public static String BMI(double weight, double height)
	{
		double BMI = weight/(height*height);

		if(BMI < 18.5) return "Thiếu cân";
		if(BMI<23&&BMI>=18.5) return "Bình thường";
		if(BMI>=23&&BMI<25) return "Thừa cân";
		return "Béo phì";
	}

}
