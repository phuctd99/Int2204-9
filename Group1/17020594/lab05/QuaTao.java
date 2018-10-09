/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Tommmm^^
 */
public class QuaTao extends HoaQua {
    String chatLuong;
    public QuaTao(String loai, String ngaySx , String xuatXu , int soLuong, String chatLuong){
        super(loai, ngaySx, xuatXu, soLuong);
                this.chatLuong = chatLuong;
    }
    
}
