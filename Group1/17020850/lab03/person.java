public class person {
    private String name;
    private String id;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public String getId()
    {
        return id;
    }
    public int salary(int day,int cost)
    {
        int salary=day*cost;
        return salary;
    }
}
