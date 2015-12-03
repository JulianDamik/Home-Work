package dragon;

public class Dragon {
	private int wings;
	private String color;
	private String type;
	private int age;
	private DragonAbilities dragonAbilities;
	
	public Dragon(){
		wings = 0;
		color = "";
		type = "";
		age = 0;
	}
	public Dragon(int wi, String col, String ty, int ag){
		wings = wi;
		color = col;
		type = ty;
		age = ag;
	}
	public int getNumWings(){
		return wings;
	}
	public String getColor(){
		return color;
	}
	public String getType(){
		return type;
	}
	public int getAge(){
		return age;
	}
	public void changeNumWings(int wi){
		wings = wi;
	}
	public void changeColor(String col){
		color = col;
	}
	public void changeType(String ty){
		type = ty;
	}
	public void addAge(int ag){
		age = age + ag;
	}
	
	public void setAbilities(DragonAbilities abilities){
		dragonAbilities = abilities;
	}
	public DragonAbilities getAbilities(){
		return dragonAbilities;
	}
	public void print(){
		System.out.println("Number of wings: " + wings);
		System.out.println("Color: " + color);
		System.out.println("Type: " + type);
		System.out.println("Age (Years): " + age);
		System.out.println("ABILITIES: " );
		dragonAbilities.print();
	}
}
