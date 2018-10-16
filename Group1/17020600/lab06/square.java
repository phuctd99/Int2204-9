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
public class square extends rectangle{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void input(){
        super.input();
        System.out.println("nhap canh hinh vuong");
        side = super.scan.nextDouble();
    }
    @Override
    public void output() {		
	super.output();
	System.out.println("Do dai canh la  " + length);
	}
}
