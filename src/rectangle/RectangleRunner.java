package rectangle;

public class RectangleRunner {
	   public static void main(String args[]) {
	      Rectangle testRect = new Rectangle(3, 5);
	      if (testRect.getHeight() == 3 && testRect.getWidth() == 5) {
	         System.out.println("Part A is correct.");
	      }
	      else {
	         System.out.println("Part A is incorrect.");
	      }
	      if (testRect.getPerimeter() == 16) {
	         System.out.println("Part B is correct.");
	      }
	      else {
	         System.out.println("Part B is incorrect.");
	      }
	      if (testRect.getArea() == 15) {
	         System.out.println("Part C is correct.");
	      }
	      else {
	         System.out.println("Part C is incorrect.");
	      }

	      return;
	   }
	} 
	 