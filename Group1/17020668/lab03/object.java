package baitap03;

public class object {
    static class lecturer{
        private
        String name;
        String date;
        String major;
        String Story;

        public String getName() {
            return name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public String getStory() {
            return Story;
        }

        public void setStory(String story) {
            Story = story;
        }

        public void setName(String name) {
            this.name = name;
        }
    } // giảng viên

    static class Student{
        private
        String name;
        String ID;
        String date;
        String group;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        String major;

    }// sinh viên

    static class Programer{
        private
        String name;
        String date;
        String university;
        String language;
        String major;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getUniversity() {
            return university;
        }

        public void setUniversity(String university) {
            this.university = university;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }
    }//lập trình viên

    static class cat{
        private
        String name;
        String age;
        String specie;
        String kindOfFood;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSpecie() {
            return specie;
        }

        public void setSpecie(String specie) {
            this.specie = specie;
        }

        public String getKindOfFood() {
            return kindOfFood;
        }

        public void setKindOfFood(String kindOfFood) {
            this.kindOfFood = kindOfFood;
        }
    }//mèo

    static class singer{
        private
        String name;
        String AKA;
        String date;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAKA() {
            return AKA;
        }

        public void setAKA(String AKA) {
            this.AKA = AKA;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getKindOfMusic() {
            return KindOfMusic;
        }

        public void setKindOfMusic(String kindOfMusic) {
            KindOfMusic = kindOfMusic;
        }

        String KindOfMusic;
    }//ca sĩ

    static class albumMusic{
        private
        String albumName;
        String singer;
        String pieces;
        String price;

        public String getAlbumName() {
            return albumName;
        }

        public void setAlbumName(String albumName) {
            this.albumName = albumName;
        }

        public String getSinger() {
            return singer;
        }

        public void setSinger(String singer) {
            this.singer = singer;
        }

        public String getPieces() {
            return pieces;
        }

        public void setPieces(String pieces) {
            this.pieces = pieces;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }//album nhạc

    static class intrumental{
        public String getNameOfIntrumental() {
            return nameOfIntrumental;
        }

        public void setNameOfIntrumental(String nameOfIntrumental) {
            this.nameOfIntrumental = nameOfIntrumental;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        String nameOfIntrumental;
    String material;
    String origin;
    String company;
    }//nhạc cụ

    static class electric{
        String name;
        String company;
        String price;
        String uses;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getUses() {
            return uses;
        }

        public void setUses(String uses) {
            this.uses = uses;
        }
    }//đồ điện tử

    static class laptop{
        String name;
        String model;
        String price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }//laptop

    static class FC{
        String name;
        String nation;
        String host;
        String league;
        String coach;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNation() {
            return nation;
        }

        public void setNation(String nation) {
            this.nation = nation;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getLeague() {
            return league;
        }

        public void setLeague(String league) {
            this.league = league;
        }

        public String getCoach() {
            return coach;
        }

        public void setCoach(String coach) {
            this.coach = coach;
        }
    }// football club


}


