public class AirPlane {
    private int timeFlight;
    private String name;
    private int priceOfTicket;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPriceOfTicket() {
        return priceOfTicket;
    }

    public int getTimeFlight() {
        return timeFlight;
    }

    public void setPriceOfTicket(int priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public void setTimeFlight(int timeFlight) {
        this.timeFlight = timeFlight;
    }

    public boolean isOldPlane(){
        if(this.timeFlight > 10000) return true;
        else return false;
    }

    public void getInfor(){
        System.out.println("Ten may bay: "+this.name+"| Thoi gian da bay: "+this.timeFlight+"| Gia ve: "+this.priceOfTicket);
    }
}

