import java.util.Scanner;

public class DragonDriver {
	
	public static void main(String[] args) {
		   Scanner scnr = new Scanner(System.in);
		   
		   int wings = 0;
		   String color = "";
		   String type = "";
		   int health = 0;
		   int age = 0;
		   
		   System.out.print("Enter number of wings: ");
		   wings = scnr.nextInt();
		   
		   System.out.print("Enter color: ");
		   color = scnr.next();
		   
		   System.out.print("Enter type: ");
		   type = scnr.next();
		   
		   System.out.print("Enter amount of health: ");
		   health = scnr.nextInt();
		   
		   System.out.print("Enter age: ");
		   age = scnr.nextInt();
		   
		   Dragon dragon1 = new Dragon(wings, color, type, health, age);
		   
		   System.out.println("Wings: " + dragon1.getNumWings());
		   System.out.println("Color: " + dragon1.getColor());
		   System.out.println("Type: " + dragon1.getType() + " dragon");
		   System.out.println("Health: " + dragon1.getHealth() + " HP");
		   System.out.println("Age: " + dragon1.getAge() + " years");
		   System.out.println();
		   
		   dragon1.changeNumWings(4);
		   dragon1.changeColor("red");
		   dragon1.changeType("fire");
		   dragon1.baseHealth(5000);
		   dragon1.healthUp(20);
		   dragon1.healthDown(180);
		   dragon1.addAge(3);
		   
		   System.out.println("Wings: " + dragon1.getNumWings());
		   System.out.println("Color: " + dragon1.getColor());
		   System.out.println("Type: " + dragon1.getType() + " dragon");
		   System.out.println("Health: " + dragon1.getHealth() + " HP");
		   System.out.println("Age: " + dragon1.getAge() + " years");
	}	   
}
