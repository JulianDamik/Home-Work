package person;

public class Student extends Person {
	private double GPA;
	private int IDNum;
	private String schoolName;
	private static int studentNum = 0;
	private ClassesTaking classesTaking;
	
	public Student(String fN, String lN, int a, double w, double gpa, String school){
		super(fN, lN, a, w);
		setGPA(gpa);
		setIDNum();
		setSchool(school);
	}
	public Student(){
		GPA = 4.0;
		setIDNum();
		schoolName = " ";
	}
	public void setGPA(double gpa){
		GPA = gpa;
	}
	public void setIDNum(){
		studentNum++;
      IDNum = studentNum;
	}
	public void setSchool(String school){
		schoolName = school;
	}
   public void setClasses(ClassesTaking classes){
      classesTaking = classes;
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
   public ClassesTaking getClasses(){
      return classesTaking;
   }
   @Override
	public String toString(){
		return super.toString() + "\nGPA: " + GPA + "\nID Number: " + IDNum + "\nSchool: " + schoolName + "\nClasses Taking" + classesTaking;
	}
}
