/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author CACLV
 */
public class Date {
    private int day, month, year; // khai báo 3 thuộc tính ngày, tháng, năm
    
    // khởi tạo mặc định // không tham số truyền vào
    public Date() {}
    
    // contructor với 3 tham số truyền vào là thông tin các thuộc tính
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    // các phương thức set/get
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    //
    public boolean leapYear() {
	return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    
    // hàm in ra ngày tháng năm này là vào thứ mấy
    public void print() {
        String days = null;
        String [] date = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
	int y0 = year - (14 - month) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	int m0 = month + 12 * ((14 - month) / 12) - 2;
	int d0 = (day + x + 31 * m0 / 12) % 7;
	
        for (int i = 0; i < 7; i++) {
            if(d0 == i) days = date[i - 1] ;
        }
	
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year + " is " + days);
        System.out.print(this.year);
        System.out.println(this.leapYear() ? " is leap year" : " is not leap year");
        
    }
    public static void main(String[] args) {
        // khỏi tạo một đối tượng Date date
        Date date = new Date(30,2,2018); 
        
        // in ra thông tin về ngày này(năm nhuận ? , vào thứ mấy trong tuần?)
        date.print();
    }
    
}
