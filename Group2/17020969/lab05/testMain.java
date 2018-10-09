package lab05;

public class testMain extends CamCaoPhong{
	public static void main(String[] args) {
		CamCaoPhong cam = new CamCaoPhong();
		cam.GetInfo();
		CamSanh cam1 = new CamSanh();
		cam1.GetInfo();
		QuaTao tao = new QuaTao();
		tao.GetInfo();
	}
}
