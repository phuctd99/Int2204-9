public class Numeral extends Expression{
	private int value;
	public Numeral(int value){
		this.value = value;
	}
	public Numeral(){
		this.value = 0;
	}

	@Override
	public int evaluate() {
		return value;
	}

	@Override
	public String toString() {
		return String.format("%s", value) ;
	}
}
