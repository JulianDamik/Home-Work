package person;

public class PersonDerivation {
	public static void main(String[] args){
		Person person1 = new Person();
		Student student1 = new Student();
		
		person1.setFName("Jaune");
		person1.setLName("Arc");
		person1.setAge(17);
		person1.setWeight(180);
		
		student1.setFName("Leo");
		student1.setLName("Montenez");
		student1.setAge(16);
		student1.setWeight(140);
		student1.setSchool("Worc. Tech");
		student1.setIDNum(111111);
		
		System.out.println(student1);
		System.out.println(person1);
	}
}
