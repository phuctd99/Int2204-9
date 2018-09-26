public class BestFriend {
    //Tên
    private String Team ;
    //Số lượng
    private int members ;
    //Sở thích
    private String hobby ;

    public BestFriend() {
        Team = "" ;
        members = 0 ;
        hobby = "" ;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getInfo () {
        return (Team + "\n" + members + "\n" + hobby) ;
    }
}
