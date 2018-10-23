package oop_tuan6;

public class Triangle extends Shape {
    private int x1, x2, x3;
    private int y1, y2, y3;
    
    
    public Triangle() {
        super();
        this.x1 = 40;
        this.x2 = 20;
        this.x3 = 0;
        this.y1 = 70;
        this.y2 = 0;
        this.y3 = 70;
    }

    public Triangle(int[] xT, int[] yT) {
        super();
        this.x1 = xT[0];
        this.x2 = xT[1];
        this.x3 = xT[2];
        this.y1 = yT[0];
        this.y2 = yT[1];
        this.y3 = yT[2];
    }

    public Triangle(int x, int y, String color, int[] xT, int[] yT) {
        super(x,y,color);
        this.x1 = xT[0];
        this.x2 = xT[1];
        this.x3 = xT[2];
        this.y1 = yT[0];
        this.y2 = yT[1];
        this.y3 = yT[2];
    }

   public int[] getXT() {
	   int[] returnArr = new int[3];
	   returnArr[0] = x1;
	   returnArr[1] = x2;
	   returnArr[2] = x3;
	   return returnArr;
   }
   
   public int[] getYT() {
	   int[] returnArr = new int[3];
	   returnArr[0] = y1;
	   returnArr[1] = y2;
	   returnArr[2] = y3;
	   return returnArr;
   }
   
   public void setXT(int[] arr) {
	   x1 = arr[0];
	   x2 = arr[1];
	   x3 = arr[2];
   }
   
   public void setYT(int[] arr) {
	   y1 = arr[0];
	   y2 = arr[1];
	   y3 = arr[2];
   }
   public int getWidth(){return 0;}
   public int getLength(){return 0;}
   public int getRadius() {return 0;}
   public boolean getIsSquare() {return false;}
   public int[] getxHex() 	{int[] arr = null; return arr;}
   public int[] getyHex() 	{int[] arr = null; return arr;}
}