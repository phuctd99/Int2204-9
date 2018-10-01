public class People {
    private String name;
    private int age;
    private String adress;

    public People (String name, int age, String adress){
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName (){

        return this.name;
    }


    public void setAge (int age){

        this.age = age;
    }
    public int getAge (){
        return this.age;
    }


    public void setAdress (String adress){

        this.adress = adress;
    }
    public String getAdress (){

        return this.adress;
    }
}
