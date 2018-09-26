package ex3;
//Doi tuong sach
public class Book {
    private String title;
    private String author;
    private String content;
    private String others;
    
    //getter va setter
    public void setTitle(String n) {
        title = n;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setAuthor(String n) {
        author = n;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setContent(String n) {
        content = n;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setOthers(String n) {
        others = n;
    }
    
    public String getOthers() {
        return others;
    }
    //ham lay thong tin
    public void getInfor() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(content);
        System.out.println(others);
    }
    
}
