public class film {
    private String name;
    private String director;
    private String day;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public int fare(int hour,int cost)
    {
        int fare=hour *cost;
        return fare;
    }
}
