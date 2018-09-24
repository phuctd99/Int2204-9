import java.util.Scanner;

public class Singer {
    private String name, kindMusic, hitSongs, awards;
    private int age;

    //Ham khoi tao Singer

    public Singer(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setKindMusic(String kindMusic) {
        this.kindMusic = kindMusic;
    }

    public String getKindMusic() {
        return this.kindMusic;
    }

    public void setHitSongs(String hitSongs) {
        this.hitSongs = hitSongs;
    }

    public String getHitSongs() {
        return this.hitSongs;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getAwards() {
        return this.awards;
    }

    public void inputSingerInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to Name : ");
        this.setName(sc.nextLine());
        System.out.print("Enter to Age : ");
        this.setAge(sc.nextInt());
        System.out.print("Enter to KindMusic : ");
        sc.nextLine();
        this.setKindMusic(sc.nextLine());
        System.out.print("Enter to HitSongs : ");
        this.setHitSongs(sc.nextLine());
        System.out.print("Enter to Awards : ");
        this.setAwards(sc.nextLine());
        System.out.println();
    }

    public void displaySingerInformation(){
        System.out.println("Name : " + this.getName());
        System.out.println("Age : " + this.getAge());
        System.out.println("KindMusic : " + this.getKindMusic());
        System.out.println("HitSongs : " + this.getHitSongs());
        System.out.println("Awards : " + this.getAwards());
    }

    public static void main(String[] args){
        Singer s = new Singer();
        s.inputSingerInformation();
        s.displaySingerInformation();
    }
}
