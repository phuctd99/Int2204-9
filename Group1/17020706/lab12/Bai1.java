/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author Nguyễn Giang
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    static void findPersonIsNotMarried(ThanhVien thanhVien) {
        if (thanhVien.married == false) {
            System.out.println(thanhVien.toString());
        }
        for (int i = 0; i < thanhVien.members.size(); i++) {
            findPersonIsNotMarried(thanhVien.members.get(i));
        }
    }

    static void findPersonBornTwoChild(ThanhVien rootThanhVien) {
        if (rootThanhVien.members.size() == 2) {
            System.out.println(rootThanhVien.name + "\t" + rootThanhVien.wifeThanhVien.name);
        }
        for (int i = 0; i < rootThanhVien.members.size(); i++) {
            findPersonBornTwoChild(rootThanhVien.members.get(i));
        }
    }

    static void findYoungestGener(ThanhVien rootThanhVien) {
        if (rootThanhVien.gener == ThanhVien.youngestGen) {
            System.out.println(rootThanhVien.toString());
        } else {
            for (int i = 0; i < rootThanhVien.members.size(); i++) {
                findYoungestGener(rootThanhVien.members.get(i));
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ThanhVien james = new ThanhVien("James", "15/01/1954", 64, "Nam", 2, false);
        ThanhVien hana = new ThanhVien("Hana", "02/10/1956", 62, "Nữ", 2, false);
        ThanhVien ryan = new ThanhVien("Ryan", "06/12/1979", 39, "Nam", 0, false);
        ThanhVien kai = new ThanhVien("Kai", "11/11/1984", 34, "Nam", 4, false);
        ThanhVien jenifer = new ThanhVien("Jenifer", "12/10/1986", 32, "Nữ", 4, true);
        ThanhVien bob = new ThanhVien("Bob", "12/12/1999", 19, "Nam", 0, false);
        ThanhVien anny = new ThanhVien("Anny", "24/12/2008", 10, "Nữ", 0, false);
        james.marriedWith(hana);
        james.bornChildren(ryan);
        james.bornChildren(kai);
        kai.marriedWith(jenifer);
        kai.bornChildren(bob);
        kai.bornChildren(anny);
        hana.getChildren().forEach((bome) -> {
            System.out.println(bome.toString());
        });
        System.out.println("Thành viên chưa kết hôn: ");
        findPersonIsNotMarried(james);
        System.out.println("Các cặp vợ chồng đẻ 2 con: ");
        findPersonBornTwoChild(james);
        System.out.println("Các thành viên thế hệ cuối cùng: ");
        findYoungestGener(james);
    }
}
