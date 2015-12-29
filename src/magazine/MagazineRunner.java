package magazine;

public class MagazineRunner {
	   public static void main(String[] args) {
	      MasterSubscription magazines = new MasterSubscription();
	        
	      magazines.addOrder(new MagazineOrder("Men's Health", 1));
	      magazines.addOrder(new MagazineOrder("Cosmopolitan", 2));
	      magazines.addOrder(new MagazineOrder("America and You", 6));
	      magazines.addOrder(new MagazineOrder("Men's Health", 3));

	      if (magazines.getTotalMagazines() == 12) {
	         System.out.println("Part A is correct.");
	      }
	      else {
	         System.out.println("Part A is incorrect.");
	      }
	        
	      if ((magazines.removeMagazine("Men's Health") == 4) && (magazines.getTotalMagazines() == 8)) {
	         System.out.println("Part B is correct.");
	      }
	      else {
	         System.out.println("Part B is incorrect.");
	      }

	      return;
	   }
	}