package person;

public class Person {
	
	private String fName;
	private String lName;
	private int age;
	private double weight; 
	
	public Person(String fN, String lN, int a, double w){
		fName = fN;
		lName = lN;
		age = a;
		weight = w;
	}
	public Person(){
		fName = " ";
		lName = " ";
		age = 0;
		weight = 0.0;
	}
	public void setFName(String name){
		fName = name;
	}
	public void setLName(String name){
		lName = name;
	}
	public void setAge(int ag){
		age = ag;
	}
	public void setWeight(double w){
		weight = w;
	}
	public String getFName(){
		return fName;
	}
	public String getLName(){
		return lName;
	}
	public int getAge(){
		return age;
	}
	public double getWeight(){
		return weight;
	}
	@Override
	public String toString(){
		return "Name: " + fName + " " + lName + "\nAge: " + age + "\nWeight: " + weight;
	}
}
	