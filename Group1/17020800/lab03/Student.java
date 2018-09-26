public class Student {
    //Nghề nghiệp
    private String job ;

    //Học tại trường nào
    private String School ;

    //Mã số Sinh viên
    private String id ;

    //Lớp học
    private String group ;

    //Trả về nghề nghiệp
    public String getJob() {
        return job;
    }

    //Khởi tạo
    public Student() {
        job = "Stundent" ;
        School = "VNU" ;
        id = "000" ;
        group = "K62" ;
    }

    //Thiết lập nghề nghiệp
    public void setJob(String job) {
        this.job = job;
    }

    //Trả về trường học
    public String getSchool() {
        return School;
    }

    //Thiết lập trường học
    public void setSchool(String school) {
        School = school;
    }

    //Trả về MSSV
    public String getId() {
        return id;
    }

    //Thiết lập MSSV
    public void setId(String id) {
        this.id = id;
    }

    //Trả về lớp
    public String getGroup() {
        return group;
    }

    //Thiết lập lớp
    public void setGroup(String group) {
        this.group = group;
    }

    //Trả về các thông tin
    public String getInfo () {
        return ( job + "\n" + School + "\n" + id + "\n" + group) ;
    }
}
