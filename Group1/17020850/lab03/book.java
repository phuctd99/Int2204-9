public class book {
    private String name;
    private String author;
    public book(String name,String author)
    {
        this.name=name;
        this.author=author;
    }
    //gan gia tri cho thuoc tinh
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    //tra ve gia tri
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    //ham tinh gia tien
    public int cost(int sale,int Xcost)
    {
        int cost=Xcost*sale;
        return cost;
    }
}
