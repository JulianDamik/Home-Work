import java.util.Scanner;
import java.util.ArrayList;
public class DragonDriver {
	
	public static void main(String[] args) {
		   Scanner scnr = new Scanner(System.in);
		   ArrayList<Dragon> dragonList = new ArrayList<Dragon>();
		   
		   int wings = 0;
		   String color = "";
		   String type = "";
		   int health = 0;
		   int age = 0;
		   
		   char cont = ' ';
		   
		   System.out.println("Do you want to build a dragon? (y or n)");
		   cont = scnr.next().charAt(0);
		   
		   while(cont == 'y'){
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
			   
			   Dragon dragon = new Dragon();
			   dragonList.add(new Dragon(wings, color, type, health, age));
			   
			   System.out.println("Do you want to make another dragon? (y or n)");
			   cont = scnr.next().charAt(0);
		   }
		   
		   for(int i = 0; i < dragonList.size(); i++){
			   System.out.println("Dragon" + (i + 1));
			   dragonList.get(i).print();
		   }
		   
	}	   
}
