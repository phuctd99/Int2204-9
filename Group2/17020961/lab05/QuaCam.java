/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan51;

/**
 *
 * @author CCNE
 */
public class QuaCam extends HoaQua{
	private String loaicam;
	public void inThongTin(){
		System.out.println("Day la qua cam");
		super.inThongTin();  //super goi den lop cha gan nhat
	}
	public String getLoaicam() {
		return loaicam;
	}
	public void setLoaicam(String loaicam) {
		this.loaicam = loaicam;
	}
}
