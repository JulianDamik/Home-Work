
public class Dragon {
	private int wings;
	private String color;
	private String type;
	private int health;
	private int age;
	
	public Dragon(){
		wings = 0;
		color = "";
		type = "";
		health = 0;
		age = 0;
	}
	public Dragon(int wi, String col, String ty, int hlth, int ag){
		wings = wi;
		color = col;
		type = ty;
		health = hlth;
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
	public int getHealth(){
		return health;
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
	public void baseHealth(int hlth){
		health = hlth;
	}
	public void healthUp(int hlth){
		health = health + hlth;
	}
	public void healthDown(int hlth){
		health = health - hlth;
	}
	public void addAge(int ag){
		age = age + ag;
	}
}
