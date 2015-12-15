package person;

public class Student extends Person {
	private double GPA;
	private int IDNum;
	private String schoolName;
	private String favClass;
	
	public void setGPA(double gpa){
		GPA = gpa;
	}
	public void setIDNum(int ID){
		IDNum = ID;
	}
	public void setSchool(String school){
		schoolName = school;
	}
	public void setFavClass(String fav){
		favClass = fav;
	}
}
