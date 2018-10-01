public class BankAccount {
    private int money;
    private String typeOfMoney;

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getTypeOfMoney() {
        return typeOfMoney;
    }

    public void setTypeOfMoney(String typeOfMoney) {
        this.typeOfMoney = typeOfMoney;
    }

    public boolean vipAccount(){
        if(this.money > 1000000) return true;
        return false;
    }

    public void withdrawMoney(int money){
        this.money -= money;
    }

    public void transMoney(BankAccount a, int money){
        this.money += money;
        a.money -= money;
    }

}
