package person;

public class ShopStudent extends Student {
	   private String shopName;
	   private String academy;
	   private Uniform uniform;
	   
	   
	   public ShopStudent(String fN, String lN, int a, double w, double gpa, String school, String shop, String acad){
	      super(fN, lN, a, w, gpa, school);
	      shopName = shop;
	      academy = acad;
	   }
	   public ShopStudent(){
	      shopName = " ";
	      academy = " ";
	   }
	   public void setShop(String shop){
	      shopName = shop;
	   }
	   public void setAcademy(String acad){
	      academy = acad;
	   }
	   public void setUniform(Uniform uni){
		      uniform = uni;
	   }
	   public String getShop(){
		   return shopName;
	   }
	   public String getAcademy(){
		   return academy;
	   }
	   public Uniform getUniform(){
		   return uniform;
	   }
	   @Override
	   public String toString(){
		   return "\nShop Name: " + shopName + "\nAcademy: " + academy + uniform.toString();
	   }
	}