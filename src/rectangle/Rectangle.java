package rectangle;

public class Rectangle {
	   private int height, width;
	    
	   public Rectangle(int rectHeight, int rectWidth) {
	      height = rectHeight;
	      width = rectWidth;
	   }

	   public int getHeight() {
	      return height;
	   }
	   
	   public int getWidth() {
	      return width;
	   }

	   public int getPerimeter() {
	      int perimiter = (2*height) + (2*width);
	      return perimiter;
	   }

	   public int getArea() {
	      int area = height * width;
	      return area;
	   }
	}