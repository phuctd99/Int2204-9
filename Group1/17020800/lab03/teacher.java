public class teacher {
    //Nghề nghiệp
    private String job ;

    //Nơi làm việc
    private String Workplace ;

    //Môn dạy
    private String Subject ;

    //Đối tượng giảng dạy
    private String Work_Object ;

    //Khởi tạo
    public teacher() {
        job = "Teacher" ;
        Workplace = "University" ;
        Subject = "OOP" ;
        Workplace = "Student" ;
    }

    //Trả về nghề nghiệp
    public String getJob() {
        return job;
    }

    //Thiết lập nghề nghiệp
    public void setJob(String job) {
        this.job = job;
    }

    //Trả về nơi làm việc
    public String getWorkplace() {
        return Workplace;
    }

    //Thiết lập nơi làm việc
    public void setWorkplace(String workplace) {
        Workplace = workplace;
    }

    //Trả về môn giảng dạy
    public String getSubject() {
        return Subject;
    }

    //Thiết lập môn giảng dạy
    public void setSubject(String subject) {
        Subject = subject;
    }

    //Trả về đối tượng giảng dạy
    public String getWork_Object() {
        return Work_Object;
    }

    //Thiết lập đối tượng giảng dạy
    public void setWork_Object(String work_Object) {
        Work_Object = work_Object;
    }

    //Trả về các thông tin đặc trưng
    public String getInfo () {
        return ( job + "\n" + Workplace + "\n" + Subject + "\n" + Work_Object) ;
    }
}
