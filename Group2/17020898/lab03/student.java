public class student {
    public String name;
    public String id;
    public String group;
    public String email;
    public student(){
        name = "Minh";
        id = "17020898";
        group = "K62IE9";
        email = "17020898@uet.vnu.edu.vn";
    }
    public void setName(String ten){
        name = ten;
    }

    public String getName(){
        return name;
    }

    public void setId(String maSV){
        id = maSV;
    }

    public String getId(){
        return id;
    }

    public void setGroup(String nhom){
        group = nhom;
    }

    public String getGroup(){
        return group;
    }

    public void setEmail(String mail){
        email = mail;
    }

    public String getEmail(){
        return email;
    }
}

