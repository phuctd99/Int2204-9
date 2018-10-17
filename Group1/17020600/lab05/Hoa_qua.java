/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baituan5;

/**
 *
 * @author CCNE
 */
public class Hoa_qua {
        protected String nguon_goc;
        protected int gia;
        protected String ngay_nhap;
        protected int so_luong;
        public String getNguon_goc() {
            return nguon_goc;
        }

        public void setNguon_goc(String nguon_goc) {
            this.nguon_goc = nguon_goc;
        }

        public int getGia() {
            return gia;
        }

        public void setGia(int gia) {
            this.gia = gia;
        }

        public String getNgay_nhap() {
            return ngay_nhap;
        }

        public void setNgay_nhap(String ngay_nhap) {
            this.ngay_nhap = ngay_nhap;
        }

        public int getSo_luong() {
            return so_luong;
        }

        public void setSo_luong(int so_luong) {
            this.so_luong = so_luong;
        }
        public Hoa_qua(){
            
        }
        public Hoa_qua(String nguon_goc, int gia, String ngay_nhap, int so_luong){
            this.nguon_goc = nguon_goc;
            this.gia = gia;
            this.ngay_nhap = ngay_nhap;
            this.so_luong = so_luong;
        }
    public String toString() {
        return "Hoa_qua{" + "nguon_goc=" + nguon_goc + ", gia=" + gia + ", ngay_nhap=" + ngay_nhap + ", so_luong=" + so_luong + '}';
    }
        
}
