/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author pc
 */
public class rectangle extends shape{
    protected double width = 1.0;
    protected double length = 1.0;
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public boolean sameRectangle(rectangle re)//xem 2 hinh chu nhat giong nhau k
            
    {
	if(x == re.x && y == re.y && width == re.width && length == re.width)
	return true;
		
	return false;
	}
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap chieu dai ");
	setLength(super.scan.nextDouble());
	System.out.println("Nhap chieu rong ");
	setWidth(super.scan.nextDouble());
    }
    public void output() {
		
	System.out.println("hinh chu nhat");
	super.output();
	System.out.println("Chieu dai " + getLength());
	System.out.println("Chieu rong " + getWidth());
	
    }
}
