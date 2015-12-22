package person;

public class ClassesTaking{
	   
	   private String englishClass;
	   private String mathClass;
	   private String historyClass;
	   private String scienceClass;
	   private String otherClass;
	   
	   public ClassesTaking(){
	      englishClass = " ";
	      mathClass = " ";
	      historyClass = " ";
	      scienceClass = " ";
	      otherClass = " ";
	   }
	   public ClassesTaking(String eC, String mC, String hC, String sC, String oC){
	      englishClass = eC;
	      mathClass = mC;
	      historyClass = hC;
	      scienceClass = sC;
	      otherClass = oC;
	   }
	   
	   public void setEnglish(String eC){
	      englishClass = eC;
	   }
	   public void setMath(String mC){
	      mathClass = mC;
	   }
	   public void setHistory(String hC){
	      historyClass = hC;
	   }
	   public void setScience(String sC){
	      scienceClass = sC;
	   }
	   public void setOther(String oC){
	      otherClass = oC;
	   }
	   
	   public String getEnglish(){
	      return englishClass;
	   }
	   public String getMath(){
	      return mathClass;
	   }
	   public String getHistory(){
	      return historyClass;
	   }
	   public String getScience(){
	      return scienceClass;
	   }
	   public String getOther(){
	      return otherClass;
	   }
	   @Override
	   public String toString(){
	      return "\nEnglish Class: " + englishClass + "\nMath Class: " + mathClass + "\nHistory Class: " + historyClass + "\nScienceClass: " + scienceClass + "\nOther Class: " + otherClass + "\n"; 
	   }
	}
