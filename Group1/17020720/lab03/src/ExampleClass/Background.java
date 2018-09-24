package ExampleClass;

public class Background {
    private String name, age, job, sex;

    Background(String hoten, String tuoi, String ngheNghiep, String gioiTinh){
        this.name = hoten;
        this.age = tuoi;
        this.job = ngheNghiep;
        this.sex = gioiTinh;
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

    public void setJob(String job){
        this.job = job;
    }

    public String getJob(){
        return this.job;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return this.sex;
    }

    public void getInfo(){
        System.out.println("SO YEU LI LICH !!!");
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " +age);
        System.out.println("Nghe nghiep: "+job);
        System.out.println("Gioi tinh: " + sex);
    }

    public static void main(String[] args){
        Background b = new Background("Nguyen Van A", " 27", "lap trinh vien", "nam");
        b.getInfo();
    }
}
