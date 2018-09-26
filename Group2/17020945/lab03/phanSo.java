import java.util.Scanner;

public class phanSo {
	private int ts, ms;
	public phanSo(int ts, int ms){
		this.ts=ts;
		this.ms=ms;
	}
	//get,set tu so
	public int getTs() {
		return ts;
	}
	public void setTs(int ts) {
		this.ts = ts;
	}
	//get,set mauso
	public int getMs() {
		return ms;
	}
	public void setMs(int ms) {
		this.ms = ms;
	}
	//ucln cua tu so va mau so
	public int ucln(int a,int b){
		int t=Math.abs(a);//tu so
		int m=Math.abs(b);//mau so
		if(t==0) return b;//neu tu so =0
		while (t != m) {
			if(t>m) t=t-m;
			else m=m-t;
		}
		return t;
	}
	//rut gon phan so
	public void rutGon(){
		int UCLN=ucln(this.getTs(),this.getMs());
		this.setTs(this.getTs()/UCLN);
		this.setMs(this.getMs()/UCLN);
	}
	//ham cong phan so
	public void congPS(phanSo ps){
		int x=this.getTs()*ps.getMs()+this.getMs()*ps.getTs();
		int y=this.getMs()*ps.getMs();
		phanSo tong=new phanSo(x,y);
		tong.rutGon();
		System.out.println("tong hai phan so la: "+tong.ts+"/"+tong.ms);
	}
	//hieu hai phan so: lay tri tuyet doi
	public void truPS(phanSo ps){
		int x=Math.abs(this.getTs()*ps.getMs()-this.getMs()*ps.getTs());
		int y=this.getMs()*ps.getMs();
		phanSo hieu =new phanSo(x,y);
		hieu.rutGon();
		System.out.println("hieu hai phan so la: "+hieu.ts+"/"+hieu.ms);
	}
	//tich hai phan so
	public void nhanPS(phanSo ps){
		int x=this.getTs()*ps.getTs();
		int y=this.getMs()*ps.getMs();
		phanSo tich =new phanSo(x,y);
		tich.rutGon();
		System.out.println("tich hai phan so la: "+tich.ts+"/"+tich.ms);
	}
	//chia hai phan so
	public void chiaPS(phanSo ps){
		int x=this.getTs()*ps.getMs();
		int y=this.getMs()*ps.getMs();
		phanSo thuong =new phanSo(x,y);
		thuong.rutGon();
		System.out.println("thuong hai phan so la: "+thuong.ts+"/"+thuong.ms);
	}
	public boolean equals(Object obj){

		if(obj instanceof phanSo){
			phanSo ps=(phanSo)obj;
			return this.getTs()*ps.getMs()==this.getMs()*ps.getTs();

		}
		return false;
	}


	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		//nhap phan so thu nhat
		int TS1=scanner.nextInt();
		int MS1=scanner.nextInt();
		phanSo PS1=new phanSo(TS1,MS1);
		System.out.println("phan so thu nhat: "+PS1.ts+"/"+PS1.ms);
		//nhap phan so thu hai
		int TS2=scanner.nextInt();
		int MS2=scanner.nextInt();
		phanSo PS2=new phanSo(TS2,MS2);
		System.out.println("phan so thu hai: "+PS2.ts+"/"+PS2.ms);
		//thuc hien cac ham coi 2 phan so
		PS1.congPS(PS2);
		PS1.truPS(PS2);
		PS1.nhanPS(PS2);
		PS1.chiaPS(PS2);
		System.out.println("hai phan so bang nhau: "+PS1.equals(PS2));
	}
}
