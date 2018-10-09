import java.util.Scanner;

public class CamCaoPhong extends QuaCam{

        public String species, price;

        //get.set chung loai

        public String getSpecies() {
            return species;
        }
        public void setSpecies(String species) {
            this.species = species;
        }

        // get.set gia ban
        public String getPrice() {

            return price;
        }
        public void setPrice(String price)
        {
            this.price = price;
        }

        // ham khoi tao khong tham so ke thua tu QuaCam
        public CamCaoPhong()
        {
            super();
        }

        // ham khoi tao co tham so
        public CamCaoPhong(String source,String dateAdd, String amout, String name, String species, String price){
            super(source,dateAdd,amout,name);
            this.species = "Cam Cao Phong";
            this.price = "15k";
        }
        @Override
        // ham nhap thong tin
        public void nhapThongtin(){
            super.nhapThongtin();
            Scanner sc = new Scanner(System.in);
            System.out.print("\nChung loai cam :");
            species = sc.nextLine();
            System.out.print("\nGia ban :");
            price = sc.nextLine();
        }
        @Override
         // ham xuat thong tin
        public void xuatThongtin(){
            super.xuatThongtin();
            System.out.print("\nChung loai cam : " + this.species);
            System.out.print("\nGia ban : " + this.price);
        }
}