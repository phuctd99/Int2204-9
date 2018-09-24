package ExampleClass;

public class Programer {
    private String name, age, lever, language;

    Programer(String ten, String tuoi, String trinhDo, String ngonNgu){
        this.name = ten;
        this.age = tuoi;
        this.lever = trinhDo;
        this.language = ngonNgu;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getAge(){
        return this.age;
    }

    public void setLever(String lever){
        this.lever = lever;
    }

    public String getLever(){
        return this.lever;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getLanguage(){
        return this.language;
    }

    public void getInfo(){
        System.out.println("Ho va ten: "+name);
        System.out.println("Tuoi: " + age);
        System.out.println("Trinh do: " + lever);
        System.out.println("Ngon ngu thong thao: " + language);
    }

    public static void main(String[] args){
        System.out.println("LAP TRINH VIEN !!!");
        Programer p = new Programer("Nguyen minh phuong", "19", "Dai hoc", "java, C++, HTML_CSS");
        p.getInfo();
    }
}
