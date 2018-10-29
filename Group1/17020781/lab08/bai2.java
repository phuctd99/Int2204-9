	import java.lang.NullPointerException;
	import  java.lang.ArrayIndexOfBoundException;
	import  java.lang.ArithmeticException;
	import  java.lang.ClassCastException;
	import  java.io.IOException;
	import 	java.io.FileNotFoundException;

	public class bai2{
		public void NullPE() throws NullPointerException{

		}
		public void ArrayIOBE() throws ArrayIndexOfBoundException{

		}
		public void AriE() throws ArithmeticException {

		}
		public void ClassCE() throws ClassCastException {

		}
		public void IOE() throws IOException{

		}
		public void FileNFE() throws FileNotFoundException{

		}

		public static void main(String[] args) {
			try{
				NullPE();
			} catch(NullPointerException e){
				System.out.println("1");
			}
			try{
				ArrayIOBE();
			} catch(ArrayIndexOfBoundException e){
				System.out.println("2");
			}
			try{
				AriE();
			} catch(ArithmeticException e){
				System.out.println("3");
			}
			try{
				ClassCE();
			} catch(ClassCastException e){
				System.out.println("4");
			}
			try{
				IOE();
			} catch(IOException e){
				System.out.println("5");
			}
			try{
				FileNFE();
			} catch(FileNotFoundException e){
				System.out.println("6");
			}
		}
	}