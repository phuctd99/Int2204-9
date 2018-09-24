public class Book {

    private String name;
    private String author;
    private int page;


    //constructor
    public Book() {
        name = "";
        author = "";
        page = 0;
    }

    public Book(String name, String author, int page) {
        this.name = name;
        this.author = author;
        this.page = page;
    }


    //getter
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

}
