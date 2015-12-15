package person;

public class Student extends Person {
	private double GPA;
	private int IDNum;
	private String schoolName;
	
	public Student(String fN, String lN, int a, double w, double gpa, int ID, String school){
		super(fN, lN, a, w);
		setGPA(gpa);
		setIDNum(ID);
		setSchool(school);
	}
	public Student(){
		GPA = 4.0;
		IDNum = 0;
		schoolName = " ";
	}
	public void setGPA(double gpa){
		GPA = gpa;
	}
	public void setIDNum(int ID){
		IDNum = ID;
	}
	public void setSchool(String school){
		schoolName = school;
	}
	public double getGPA(){
		return GPA;
	}
	public int getIDNum(){
		return IDNum;
	}
	public String getSchool(){
		return schoolName;
	}
	public String toString(){
		return "Name: " + getFName() + " " + getLName() + "\nAge: " + getAge() + "\nWeight: " + getWeight() + "\nGPA: " + GPA + "\nID Number: " + IDNum + "\nSchool: " + schoolName + "\n";
	}
}
