package ExampleClass;

public class Teacher {
    private String name, monday, lopday;

    public Teacher(String ten, String subject, String group){
        this.name = ten;
        this.monday = subject;
        this.lopday = group;
    }

    public void setName(String ten){
        this.name = ten;
    }

    public String getName(){
        return this.name;
    }

    public void setMonday(String monday){
        this.monday = monday;
    }

    public String getMonday(){
        return this.monday;
    }

    public void setLopday(String lopday){
        this.lopday = lopday;
    }

    public String getLopday(){
        return this.lopday;
    }

    public void getInfo(){
        System.out.println("Giang vien: " + name);
        System.out.println("Day mon: " + monday);
        System.out.println("Lop day: " + lopday);
    }

    public static void main(String[] args){
        System.out.println("Giang vien truong dai hoc cong nghe !!!");
        Teacher tea1 = new Teacher("Tran Dinh D", "Lap trinh huong doi tuong", "INT2204 9");
        Teacher tea2 = new Teacher("Dao Thi Phuong Thao", "Giai tich 2", "INT 2205 3");
        tea1.getInfo();
        tea2.getInfo();
    }
}
