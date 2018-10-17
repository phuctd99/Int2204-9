package ex1;

class Apple{
	double priceApple;
	double weightApple;
	String sourceApple;
	double amountApple;
	void setApple(double priceApple,double weightApple,double amountApple,
		String sourceApple) {
		this.priceApple = priceApple;
		this.weightApple = weightApple;
		this.amountApple = amountApple;
		this.sourceApple = sourceApple;
	}
	String getSourceApple() {
		return this.sourceApple;
	}
	double getMoneyApple() {
		return this.priceApple*this.weightApple*this.amountApple;
	}
}
class Oranges extends Apple{
	double priceOranges;
	double weightOranges;
	String sourceOranges;
	double amountOranges;
	void setOranges(double priceOranges,double weightOranges,double amountOranges,
		String sourceOranges) {
		super.setApple(priceOranges, weightOranges, amountOranges, sourceOranges);
	}
	String getSourceOranges() {
		return this.sourceOranges;
	}
	double getMoneyOranges() {
		return this.priceOranges*this.weightOranges*this.amountOranges;
	}
}
class TallOrange extends Oranges{
	double priceTallOrange;
	double weightTallOrange;
	String sourceTallOrange;
	double amountTallOrange;
	void setTallOrange(double priceTallOrange,double weightTallOrange,double amountTallOrange,
		String sourceTallOrange) {
		super.setApple(priceTallOrange, weightTallOrange, amountTallOrange, sourceTallOrange);
	}
	String getSourceTallOrange() {
		return this.sourceTallOrange;
	}
	double getMoneyTallOrange() {
		return this.priceTallOrange*this.weightTallOrange*this.amountTallOrange;
	}
}
class Orange extends TallOrange{
	double priceOrange;
	double weightOrange;
	String sourceOrange;
	double amountOrange;
	void setOrange(double priceOrange,double weightOrange,double amountOrange,
		String sourceOrange) {
		super.setApple(priceOrange, weightOrange, amountOrange, sourceOrange);
	}
	String getSourceOrange() {
		return this.sourceOrange;
	}
	double getMoneyOrange() {
		return this.priceOrange*this.weightOrange*this.amountOrange;
	}
}
class Vegetable extends Orange{
	double priceVegetable;
	double weightVegetable;
	String sourceVegetable;
	double amountVegetable;
	void setVegetable(double priceVegetable,double weightVegetable,double amountVegetable,
		String sourceVegetable) {
		super.setApple(priceVegetable, weightVegetable, amountVegetable, sourceVegetable);
	}
	String getSourceVegetable() {
		return this.sourceVegetable;
	}
	double getMoneyVegetable() {
		return this.priceVegetable*this.weightVegetable*this.amountVegetable;
	}
}
public class Fruit{

	public static void main(String[] args) {
		Vegetable v = new Vegetable();
		v.setApple(10000, 0.2, 17, "Bac Giang");
		v.setOranges(12000, 0.4, 13, "Lao Cai");
		v.setTallOrange(15000, 0.7, 3, "Cao Bang");
		v.setOrange(10000, 0.25, 8, "Lang Son");
		v.setVegetable(2000, 0.1, 28, "Ha Noi");
		System.out.println("Money Apple: " + v.getMoneyApple());
		System.out.println("Source Apple: " + v.getSourceApple());
		System.out.println("Money Oranges: " + v.getMoneyOranges());
		System.out.println("Source Oranges: " + v.getSourceOranges());
		System.out.println("Money Tall Orange: " + v.getMoneyTallOrange());
		System.out.println("Source Tall Orange: " + v.getSourceTallOrange());
		System.out.println("Money Orange:" + v.getMoneyOrange());
		System.out.println("Source Orange: " + v.getSourceOrange());
		System.out.println("Money Vegetable: " + v.getMoneyVegetable());
		System.out.println("Source Vegetable: " + v.getSourceVegetable());
		
	}

}
