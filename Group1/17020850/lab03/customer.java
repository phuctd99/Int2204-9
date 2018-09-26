public class customer {
    private String name;
    private String phone;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    public String getPhone()
    {
        return phone;
    }
    public int money(int amount,int cost)
    {
        int money= amount * cost;
        return money;
    }
}
