public class bridge {
    //Tên cây cầu
    private String BridgeName ;
    //Bắc qua con sông
    private String RiverName ;
    //Chiều dài
    private Double Length ;
    //Độ rộng
    private Double Width ;
    public bridge() {
        BridgeName = "" ;
        RiverName = "" ;
        Length = 0.0 ;
        Width = 0.0 ;
    }

    public String getBridgeName() {
        return BridgeName;
    }

    public void setBridgeName(String bridgeName) {
        BridgeName = bridgeName;
    }

    public String getRiverName() {
        return RiverName;
    }

    public void setRiverName(String riverName) {
        RiverName = riverName;
    }

    public Double getLength() {
        return Length;
    }

    public void setLength(Double length) {
        Length = length;
    }

    public Double getWidth() {
        return Width;
    }

    public void setWidth(Double width) {
        Width = width;
    }
    public String getInfo () {
        return (BridgeName + "\n" + RiverName + "\n" + Length + "\n" + Width) ;
    }
}
