package dragon;
import java.util.Scanner;
public class DragonDriver {
	public static void main(String[] args) {
		   Scanner scnr = new Scanner(System.in);
		   
		   int wings = 0;
		   String color = "";
		   String type = "";
		   int age = 0;
		   
		   char flight = ' ';
		   char breathAttack = ' ';
		   char physicalAttack = ' ';
		   
		   System.out.println("Enter number of wings: ");
		   wings = scnr.nextInt();
		   
		   System.out.println("Enter color: ");
		   color = scnr.next();
		   
		   System.out.println("Enter type: ");
		   type = scnr.next();
		   
		   System.out.println("Enter age: ");
		   age = scnr.nextInt();
		   
		   System.out.println("Can the dragon fly? (Y or N) ");
		   flight = scnr.next().charAt(0);
		   System.out.println("Does the dragon have a breath attack? (Y or N) ");
		   breathAttack = scnr.next().charAt(0);
		   System.out.println("Can the dragon attack physically? (Y or N) ");
		   physicalAttack = scnr.next().charAt(0);
		   System.out.println();
		   
		   Dragon dragon1 = new Dragon(wings, color, type, age);
		   DragonAbilities abilities = new DragonAbilities(flight, breathAttack, physicalAttack);
		   
		   dragon1.setAbilities(abilities);
		   
		   dragon1.print();
		   System.out.println();
		   
		   dragon1.changeNumWings(4);
		   dragon1.changeColor("red");
		   dragon1.changeType("fire");
		   dragon1.addAge(3);
		   
		   
		   dragon1.print();
		   System.out.println();
	}	   
}
