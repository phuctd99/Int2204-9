package diagram;

public class triangle extends shape{
	double bottom;
	double height;
        public double getBottom() {
		return bottom;
	}
	public void setBottom(double bottom) {
		this.bottom = bottom;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean sameTriangle(triangle tr1) {
		if(x == tr1.x && y == tr1.y && height == tr1.height
			&& bottom == tr1.bottom	) {
		return true;}
		
		return false;
	}
	public void Input() {
		super.input();
		System.out.println("Nhap chieu dai: ");
		setHeight(super.scan.nextDouble());
		System.out.println("Nhap chieu rong: ");
		setBottom(super.scan.nextDouble());	
	}
	public void Output() {
		super.output();
		System.out.println("Chieu dai: " + getBottom());
		System.out.println("Chieu rong: " +getHeight() );
	}
}