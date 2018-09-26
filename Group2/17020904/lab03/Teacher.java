public class Teacher {
    private String name, age, phone, id,subject, qualification;
    // getter và setter
    void setName(String n){
        this.name = n;
    }
    String getName() {
        return name;
    }

    void setPhone(String n){
        this.phone = n;
    }
    String getPhone() {
        return phone;
    }

    void setAge(String n){
        this.age = n;
    }
    String getAge() {
        return age;
    }

    void setID (String n){ this.id = n;}
    String getID (){return id;}

    void setSubject(String n){ this.subject = n;}
    String getSubject (){return subject;}

    void setQualification(String n){ this.qualification = n;}
    String getQualification (){return qualification;}
    // kiểm tra bài cũ

    void ktBai(){
        System.out.println("Kiểm tra bài cũ");
    }
    // dạy học
    void day()
    {
        // dạy bài học mới
    }


}
