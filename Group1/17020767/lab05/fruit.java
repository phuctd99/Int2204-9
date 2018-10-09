/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05.Fruit;

/**
 *
 * @author admin
 */
public class fruit {
    private long tienNhap ;         // Số tiền nhập hoa quả 
    private String nguonGoc;        // Nguồn gốc xuất xứ 
    private int soLuong;            // Số lượng hoa quả nhập vào : kg 

    public long getTienNhap() {
        return tienNhap;
    }

    public void setTienNhap(long tienNhap) {
        this.tienNhap = tienNhap;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}




