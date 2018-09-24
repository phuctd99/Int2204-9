public class Student {
    private
        String name, id, group, email;
    public

        void setName(String n){
            name = n;
        }
        String getName(){
            return name;
        }
        void setId(String n){
            id = n;
        }
        String getId(){
            return id;
        }
        void setGroup(String n){
            group = n;
        }
        String getGroup(){
            return group;
        }
        void setEmail(String n){
            email = n;
        }
        String getEmail(){
            return email;
        }
        String getInfo(){
            return (name+" "+id+" "+group+" "+ email);
        }
        // Tao sinh vien khong tham so
        void Student(){
            name = "Student";
            id = "000";
            group = "K59CB";
            email = "uet@vnu.edu.vn";
        }
        // Tao sinh vien co san gr
        void Student (String name, String sid, String em){
            name = name;
            id = sid;
            group = "K59CB";
            email = em;
        }
        // Sao chep sv
        void Student (Student s){
            name = s.name;
            id = s.id;
            group = s.group;
            email = s.email;
        }

}
