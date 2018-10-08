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
public class CamSanh extends QuaCam{
	CamSanh(){
		this.setLoaicam("Cam Sanh");
	}
	public void inThongTin(){
		System.out.println("Day la loai cam "+this.getLoaicam());
		super.inThongTin();//lop cha gan nhat
	}
}
