package bai1;

import java.util.Scanner;

public class HoaQua {
	public Scanner input = new Scanner(System.in);
	private String color;
	private double cost;
	HoaQua() {
		setColor("vang");
		setCost(20000);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double gia) {
		this.cost = gia;
	}
	public void print() {
		System.out.println( "mau sac pho bien: " + this.color + "\t\tgia trung binh: " + this.cost);
	}
}
