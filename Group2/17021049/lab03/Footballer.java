import java.util.Scanner;

public class Footballer {
    private String name;
    private int goals, cards;

    public Footballer(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoals() {
        return this.goals;
    }

    public void setCards(int cards) {
        this.cards = cards;
    }

    public int getCards() {
        return this.cards;
    }

    public void inputInformationInAMatch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to Name : ");
        this.setName(sc.nextLine());
        System.out.print("Enter to Goals : ");
        this.setGoals(sc.nextInt());
        System.out.print("Enter to Cards : ");
        this.setCards(sc.nextInt());
    }

    public void goalsInAMatch(){
        if(this.getGoals()==0) System.out.println(this.getName() + " : Zero goals");
        else if(this.getGoals()==1) System.out.println(this.getName() + " : A goals");
        else if(this.getGoals()==2) System.out.println(this.getName() + " : Double goals");
        else if(this.getGoals()==3) System.out.println(this.getName() + " : Hattrick goals");
        else if(this.getGoals()==4) System.out.println(this.getName() + " : Poker goals");
        else System.out.println(this.getName() + " : Rocket goals");
    }
    public static void main(String[] args){
        Footballer f = new Footballer();
        f.inputInformationInAMatch();
        f.goalsInAMatch();
        System.out.print("Cards : " + f.getCards());
    }
}
