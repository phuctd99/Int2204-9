package bai1;

import java.util.Date;

/**
 * Trừu tượng hóa lớp hoa quả
 * @author Nguyễn Quang Hiệp
 */
public class HoaQua {
    private String source;
    private int amount;
    private Date dateAdded;
    private Date expirationDate;
    // trả về nguồn gốc
    public String getSource() {
        return source;
    }
    // gán nguồn gốc
    public void setSource(String source) {
        this.source = source;
    }
    // trả về số lượng
    public int getAmount() {
        return amount;
    }
    // gán số lượng
    public void setAmount(int amount) {
        this.amount = amount;
    }
    // gán ngày nhập
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
    // trả về ngày nhập
    public Date getDateAdded() {
        return dateAdded;
    }
    // gán ngày hết hạn
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    // trả về ngày hết hạn
    public Date getExpirationDate() {
        return expirationDate;
    }
}
