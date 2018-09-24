package lab03bt3;
class manhdat{ // đối tượng mảnh đất
    private double cd, cr; // khởi tạo 2 thuộc tính chiều dài , chiều rộng
    public double getCd(){ // getter chieu dai
        return cd;
    }
    public void setCd(double n){ // setter chieu dai
        cd = n;
    }
    public double getCr(){ // getter chieu rong
        return cr;
    }
    public void setCr(double n){ // setter chieu rong
        cr = n;
    }
    public double dt(manhdat s){ // ham tinh dien tich manh dat
        return s.cd * s.cr;
    }
    public double cv(manhdat s){ // ham tinh chu vi manh dat
        return 2 * (cd + cr);
    }
}
class cauthu{   // đối tượng cầu thủ
    private int bt, kt; // khởi tạo hai thuộc tính bàn thắng, kiến tạo
    public int getBt(){ // getter ban thang
        return bt;
    }
    public void setBt(int n){ // setter ban thang
        bt = n;
    }
    public int getKt(){ // getter kien tao
        return kt;
    }
    public void setKt(int n){ // setter kien tao
        kt = n;
    }
    public String tiendao(cauthu s){  // ham phan loai tien dao
        if (s.getBt() < 5){
            return "tien dao kem";
        }
        else if(s.getBt() >= 5 && s.getBt() < 20){
            return "tien dao tot";
        }
        else {
            return "sieu tien dao";
        }
    }
    public String tienve(cauthu s){  // ham phan loai tien ve
        if (s.getKt() < 5){
            return "tien ve kem";
        }
        else if(s.getKt() >= 5 && s.getKt() < 20){
            return "tien ve tot";
        }
        else {
            return "vua kien tao";
        }
    }
}
class channel{ // đối tượng kênh youtube
    private int view, sub; // khởi tạo hai thuộc tính lượt xem, lượt đăng ký
    public int getView(){ // getter luot view
        return view;
    }
    public void setView(int n){ // sette luot view
        view = n;
    }
    public int getSub(){ // getter luot sub
        return view;
    }
    public void setSub(int n){ // setter luot sub
        sub = n;
    }
    public String phanloai(channel s){ // ham phan loai kenh youtube
        if (s.getSub() >= 100000 && s.getSub() < 1000000){
            return "Silver";
        }
        if (s.getSub() >= 1000000 && s.getSub() < 10000000){
            return "Gold";
        }
        if (s.getSub() >= 10000000){
            return "Diamond";
        }
        return null;
    }
}
class concho{ // đối tượng con chó
    private int weight; // khởi tạo hai thuộc tính cân nặng và màu sắc
    private String color;//
    public int getWeight(){
        return weight;
    }
    public void setWeight(int n){
        weight = n;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String s){
        color = s;
    }
    public boolean chomuc(concho s){ // hàm kiểm tra chó mực 
        if (s.getColor() == "Black"){
            return true;
        }
        else {
            return false;
        }
    }
    public String phanloai(concho s){ // hàm phân loại chó
        if (s.getWeight() < 10){
            return "cho con";
        }
        else if (s.getWeight() >= 10 && s.getWeight() <= 20){
            return "cho lon";
        }
        else{
            return "cho rat lon";
        }
    }
}
class album{ // đối tượng album nhạc
    private int view, release;// khởi tạo 2 thuộc tính lượt nghe, lượt phát hành 
    public int getView(){
        return view;
    }
    public void setView(int n){
        view = n;
    }
    public int getRelease(){
        return release;
    }
    public void setRelease(int n){
        release = n;
    }
    public String phanloai(album s){ // hàm phân loại album nhạc
        if (s.getRelease() >= 500000 && s.getRelease() < 1000000){
            return "Gold";
        }
        else if(s.getRelease() >= 1000000 && s.getRelease() < 10000000){
            return "Platinum";
        }
        else {
            return "Diamond";
        }
    }
}
class giaovien{ // đối tượng giáo viên
    private String name; // khởi tạo 2 thuộc tính tên và tuổi nghề
    private int age;     //
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    public int getAge(){
        return age;
    }
    public void set(int n){
        age = n;
    }
    public boolean tuoinghe(giaovien gv1, giaovien gv2){ // hàm kiểm tra hai 
        if (gv1.getAge() == gv2.getAge()){     // giáo viên có cùng tuổi nghề
            return true;
        }
        else {
            return false;
        }
    }
}
class conmeo{  // đối tượng con mèo
    private int weight; // khởi tạo 2 thuộc tính cân nặng và màu sắc
    private String color; //
    public int getWeight(){
        return weight;
    }
    public void setWeight(int n){
        weight = n;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String s){
        color = s;
    }
    public boolean meomun(conmeo s){ // hàm kiểm tra có phải là mèo mun không
        if(s.getColor() == "Black"){
            return true;
        }
        else {
            return false;
        }
    }
}
class car{ // Đối tượng xe hơi
    private int socho;        // khởi tạo hai thuộc tính số chỗ và nhiên liệu
    private String nhienlieu; //
    public int getSocho(){
        return socho;
    }
    public void setSocho(int n){
        socho = n;
    }
    public String getNhienlieu(){
        return nhienlieu;
    }
    public void setNhienlieu(String s){
        nhienlieu = s;
    }
    public boolean canhan(car s){ // hàm kiểm tra có phải xe cá nhân không
        if (s.getSocho() <= 7){
            return true;
        }
        else {
            return false;
        }
    }
}
class tree{ // Đối tượng cây
    private String re, la; // khởi tạo hai thuộc tính rễ và lá
    public String getRe(){
        return re;
    }
    public void setRe(String s){
        re = s;
    }
    public String getLa(){
        return la;
    }
    public void setLa(String s){
        la = s;
    }
    public String phanloai(tree s){ // Hàm phân loại cây theo tán lá
        if (s.getLa() == "nho") {
            return "cay ua bong";
        }
        else {
            return "cay ua nang";
        }
    }
}
class movie{ // Đối tượng phim chiếu rạp
    private int dotuoi; // khởi tạo hai thuộc tính độ tuổi giới hạn xem phim 
    private String theloai; // và thể loại phim
    public int getDotuoi(){
       return dotuoi;
    }
    public void setDotuoi(int n){
        dotuoi = n;
    }
    public String getTheloai(){
        return theloai;
    }
    public void setTheloai(String s){
        theloai = s;
    }
    public boolean all(movie s){ // hàm kiểm tra phim có dành cho mọi lứa tuổi
        if (s.getDotuoi() < 13){
            return true;
        }
        else {
            return false;
        }
    }
 }



