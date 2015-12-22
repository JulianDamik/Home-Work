package person;

public class Uniform {
	
	private String shirt;
	private String pants;
	private String shoes;
	
	public Uniform(String pant, String shi, String sho){
		pants = pant;
		shirt = shi;
		shoes = sho;
	}
	public Uniform(){
		pants = " ";
		shirt = " ";
		shoes = " ";
	}
	public void setPants(String pant){
		pants = pant;
	}
	public void setShirt(String shi){
		shirt = shi;
	}
	public void setShoes(String sho){
		shoes = sho;
	}
	public String getPants(){
		return pants;
	}
	public String getShirt(){
		return shirt;
	}
	public String getShoes(){
		return shoes;
	}
	@Override
	public String toString(){
		return "\nShirt: " + shirt + "\nPants: " + pants + "\nShoes: " + shoes;
	}
}
