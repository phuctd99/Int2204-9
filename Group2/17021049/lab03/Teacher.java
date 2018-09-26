
import java.util.Scanner;

public class Teacher {
    private String name;
    private int age;
    private String sex;
    private String technical;
    private String degree;

    public Teacher(){

    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return this.age;
    }
    public void setSex(String s){
        this.sex = s;
    }
    public String getSex(){
        return this.sex;
    }
    public void setTechnical(String tech) {
        this.technical = tech;
    }

    public String getTechnical() {
        return this.technical;
    }

    public void setDegree(String deg) {
        this.degree = deg;
    }
    public String getDegree() {
        return this.degree;
    }

    public void inputTeacherInfomation(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter to Name : ");
         this.setName(sc.nextLine());
         System.out.print("Enter to Age : ");
         this.setAge(sc.nextInt());
         System.out.print("Enter to Sex : ");
         sc.nextLine();
         this.setSex(sc.nextLine());
         System.out.print("Enter to Teachnical : ");
         this.setTechnical(sc.nextLine());
         System.out.print("Enter to Degree : ");
         this.setDegree(sc.nextLine());
        }
       public void displayTeacherInfomation(){
         System.out.println("Name : " + this.getName());
         System.out.println("Age : " + this.getAge());
         System.out.println("Sex : " + this.getSex());
         System.out.println("Technical : " + this.getTechnical());
         System.out.println("Degree : " + this.getDegree());
       }
       public static void main(String[] args){
          Teacher teacher = new Teacher();
          teacher.inputTeacherInfomation();
          teacher.displayTeacherInfomation();
       }
    }


