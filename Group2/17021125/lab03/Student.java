public class Student {
    private String name;
    private String maSV;
    private String group;
    private String email;

    public Student (String name, String maSV, String group, String email ){
        this.name = name;
        this.maSV = maSV;
        this.group = group;
        this.email = email;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName (){

        return this.name;
    }


    public void setMaSV (String maSV){

        this.maSV = maSV;
    }
    public String getMasv (){

        return this.maSV;
    }


    public void setGroup (String group){

        this.group = group;
    }
    public String getGroup () {
        return this.group;
    }


    public void setEmail (String email){
        this.email = email;
    }
    public String getEmail (){
        return this.email;
    }

}

