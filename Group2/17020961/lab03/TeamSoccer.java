package lap03;

public class TeamSoccer {
	private int numberPlayer;
	private int numberGoal;
	private String position;
	public int getNumberPlayer() {
		return numberPlayer;
	}
	public void setNumberPlayer(int numberPlayer) {
		this.numberPlayer = numberPlayer;
	}
	public int getNumberGoal() {
		return numberGoal;
	}
	public void setNumberGoal(int numberGoal) {
		this.numberGoal = numberGoal;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	//ham khoi tao
	TeamSoccer(){
		numberPlayer=11;
		numberGoal=0;
	}
	public boolean isGoodTeam(){
		if(numberGoal >= 10) return true;
		return false;
	}
	public void getInfor(){
		System.out.println("numberPalyer: "+this.numberPlayer);
		System.out.println("numberGoal: "+this.numberGoal);
		System.out.println("position: "+this.position);
	}
}
