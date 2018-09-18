import java.util.Scanner;

public class StudentManagement {
    student[] sv = new student[100];
    int sz = sv.length;

    public static boolean sameGroup(student s1 , student s2){
        boolean out = false ;
        if(s1.getGroup()== s2.getGroup())
            out = true ;
        return out ;
    }

    public void inputStudent(int n){
        Scanner sc = new Scanner(System.in);

        sz = n ;
        String name ;
        String id ;
        String group ;
        String email ;


        for(int i = 0 ; i< n ;i++){
        sv[i] = new student();
        System.out.println("Nhap name: ");
            name = sc.nextLine();
            sv[i].setName(name);
        System.out.println("Nhap id: ");
            id = sc.nextLine();
            sv[i].setId(id);
        System.out.println("Nhap group: ");
            group = sc.nextLine();
            sv[i].setGroup(group);
        System.out.println("Nhap email: ");
            email = sc.nextLine();
            sv[i].setEmail(email);


    }



    }
    public void studentinGroup(int n ){
                inputStudent(n);

        for(int i = 0 ; i<n;i++ ){
            if(sv[i].getGroup()=="INT22041"){
                sv[i].getInfo();
            }

        }
        for(int i = 0 ; i< n ; i++) {
            if (sv[i].getGroup() == "INT22042"){
                sv[i].getInfo();
            }

        }

    }



    public static void main( String args[]){
        Scanner in = new Scanner(System.in);



        StudentManagement  bang = new StudentManagement();
        student s1 = new student();


        s1.setName("tran van khai");
        s1.setId("17020830");
        s1.setGroup("IE9");
        s1.setEmail("khaitran2171999@gmail.com");

        s1.getInfo();

        student s2 = new student();
        student s3 = new student();
            s3.setGroup("INT22042");
        student s4 = new student(s1);
        student s5 = new student("tran van A" , "17020800" , "a1234@gmail.com");

        s2.getInfo();
        s3.getInfo();
        s4.getInfo();
        s5.getInfo();



        System.out.println(sameGroup(s1,s2));
        System.out.println("Nhap so sinh vien:");
        int ssv = in.nextInt();

        bang.studentinGroup(ssv);

















    }
}
