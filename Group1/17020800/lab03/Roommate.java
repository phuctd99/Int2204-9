public class Roommate {
    //Tên
    private String Name ;
    //Quê quán
    private String Que ;
    //Tuổi
    private int Age ;
    public Roommate() {
        Name = "" ;
        Que = "" ;
        Age = 0 ;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQue() {
        return Que;
    }

    public void setQue(String que) {
        Que = que;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public String getInfo () {
        return (Name + "\n" + Que + "\n" + Age) ;
    }
}