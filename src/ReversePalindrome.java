
public class ReversePalindrome {
	String reversedStr = "";
	
	public String wordReverse(String originalStr) {
		String reversedStr = wordReverse(originalStr);
		      
		System.out.println(reversedStr);
		      
		return reversedStr;
	}
		    
		   public static boolean isPalindrome(String originalStr) {
		      boolean test;
		      
		      if(wordReverse(originalStr) == originalStr){
		         System.out.println(originalStr + " is a palindrome.");
		         test = true;
		      }
		      else{
		         System.out.print(originalStr + " is not a palindrome.");
		         test = false;
		      }
		      return test;
		   }
		   
		   public static void main(String args[]) {
		     
		      String originalStr = "racecar";
		        
		      if (wordReverse(originalStr).equals("racecar")) {
		         System.out.println("Part A is correct.");
		      }
		      else { 
		         System.out.println("Part A is incorrect.");
		      }

		      if (isPalindrome(originalStr) && 
		          isPalindrome("mom") && 
		          !isPalindrome("123456789") && 
		          !isPalindrome("lizard")) {
		         System.out.println("Part B is correct.");
		      }
		      else {
		         System.out.println("Part B is incorrect.");
		      } 
		   }
		}

}
