import java.util.Scanner;

public class RocketDriver {

	   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   
	   int rocketSize1 = 0;
	   String centerChar = "";
	   char sideChar = ' ';
	   String seperatorChar = "";
	   String windowChar = "";
	   
	   System.out.print("Enter Rocket Size1: ");
	   rocketSize1 = scnr.nextInt();
	   
	   System.out.print("Enter Center Characters (2 same): ");
	   centerChar = scnr.next();
	   
	   System.out.print("Enter Side Character(1): ");
	   sideChar = scnr.next().charAt(0);
	   
	   System.out.print("Enter Seperator Characters (2 different): ");
	   seperatorChar = scnr.next();
	   
	   System.out.print("Enter Window Character(2 same): ");
	   windowChar = scnr.next();
	      
	   Rocket rocket1 = new Rocket(rocketSize1, centerChar, sideChar, seperatorChar, windowChar);
	   
	   rocket1.printConeBottom();
	   rocket1.printSeperator();
	   rocket1.printBody1and4();
	   rocket1.printBody2and3();
	   rocket1.printSeperator();
	   rocket1.printBody2and3(); 
	   rocket1.printBody1and4();
	   rocket1.printSeperator();
	   rocket1.printConeBottom();
	   
	         }
	       }
	      
