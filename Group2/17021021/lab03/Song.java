public class Song {

    private String name;
    private String author;
    private int length;


    //constructor
    public Song() {
        name = "";
        author = "";
        length = 0;
    }

    public Song(String name, String author, int length) {
        this.name = name;
        this.author = author;
        this.length = length;
    }


    //getter
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int length) {
        this.length = length;
    }

}
