
public class Rocket {
	
	private int rocketSize;
	private String centerChar;
	private char sideChar;
	private String seperatorChar;
	private String windowChar;
	
	public Rocket(){
		rocketSize = 0;
		centerChar = "";
		sideChar = ' ';
		seperatorChar = "";
		windowChar = "";
	}
	public Rocket(int RS, String CC, char sideC, String sepC, String winChar){
		rocketSize = RS;
		centerChar = CC;
		sideChar = sideC;
		seperatorChar = sepC;
		windowChar = winChar;
	}
	public void setSize(int RS){
		rocketSize = RS;
		return;
	}
	public void setSideChar(char sideC){
		sideChar = sideC;
		return;
	}
	public void setSepertor(String sepC){
		seperatorChar = sepC;
		return;
	}
	public void setCenterChar(String CC){
		centerChar = CC;
		return;
	}
	public void setWindowChar(String winChar){
		windowChar = winChar;
		return;
	}
	public int getSize(){
		return rocketSize;
	}
	public void printConeBottom(){
		for (int line = 1; line <= rocketSize*2-1; line++){ // cone/bottom
	        for (int space = rocketSize*2-line; space >= 1; space--){
	            System.out.print(" ");
	            }
	        for (int fSlash = line; fSlash >= 1; fSlash--){
	            System.out.print("/");
	            }
	        System.out.print(centerChar);
	        for (int bSlash = line; bSlash >= 1; bSlash --){
	         System.out.print("\\");
	            }
	         System.out.println("");
	         }
		return;
	}
	public void printSeperator(){
		for (int line = 1; line > 0; line--){ // seperator
	         System.out.print(sideChar);
	         for (int symbol = rocketSize * 2; symbol >=1; symbol--){
	            System.out.print(seperatorChar);
	            }
	         System.out.println(sideChar);
	         }
	         return;
	}
	public void printBody1and4(){
		for(int line = 1;line <= rocketSize; line++){ // body part 1/4
            System.out.print("|");
         for (int dot = rocketSize - line; dot >= 1; dot--){
               System.out.print(".");
               }
         for (int upCone = line; upCone >= 1; upCone--){
               System.out.print(windowChar);
               }
         for (int dot = rocketSize - line; dot >= 1; dot--){
               System.out.print("..");
               }
         for (int upCone = line; upCone>= 1; upCone--){
               System.out.print(windowChar);
               }
         for (int dot = rocketSize - line; dot >= 1; dot--){
               System.out.print(".");
               }
          System.out.println("|");
         }
         return;
	}
	public void printBody2and3(){
		for(int line = 1;line <= rocketSize; line++){ // body part 2/3
            System.out.print("|");
            for (int dot = line - 1; dot >= 1; dot--){
               System.out.print(".");
               }
            for (int downCone = (rocketSize + 1)-line; downCone >=1; downCone--){
               System.out.print(windowChar);
               }
            for (int dot = line - 1; dot >= 1; dot--){
               System.out.print("..");
               }
            for (int downCone = (rocketSize + 1)-line; downCone >=1; downCone--){
               System.out.print(windowChar);
               }
            for (int dot = line - 1; dot >= 1; dot--){
               System.out.print(".");
               }
            System.out.println("|");
         }
         return;
	}
}
