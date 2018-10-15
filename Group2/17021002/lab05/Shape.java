package lapo5;

public class Shape {
 private String color ;
 private boolean filled;
   
 public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
public Shape () {
	 this.color = "red";
	 this.setFilled(true);
 }
 public Shape(String color, boolean filled)
 {
	 this.color = color;
	 this.setFilled(filled);
 }
 public String getcolor() {
     return color;
 }

 public void setcolor(String color) {
     this.color = color;
 }
 public void setfilled(boolean filled) {
     this.setFilled(filled);
}
 public boolean isfilled( boolean filled) {
	 return filled;
 }
 public String toString() {return color;}
}
