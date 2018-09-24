public class Street {
    //Tên đường
    private String StreetName ;
    // Ở quận nào
    private String Quan ;
    //Chiều dài
    private Double Length ;

    public Street() {
        StreetName = "" ;
        Quan = "";
        Length = 0.0;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getQuan() {
        return Quan;
    }

    public void setQuan(String quan) {
        Quan = quan;
    }

    public Double getLength() {
        return Length;
    }

    public void setLength(Double length) {
        Length = length;
    }

    public  String getInfoStreet () {
        return (StreetName + "\n" + Quan + "\n" + Length) ;
    }
}
