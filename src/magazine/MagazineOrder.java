package magazine;

public class MagazineOrder {
	   String name;
	   int quantity;

	   public MagazineOrder(String magazineName, int subscriptionQuantity) {
	      name = magazineName;
	      quantity = subscriptionQuantity;
	   }

	   public String getName() {
	      return name;
	   }

	   public int getNumMagazines() {
	      return quantity;
	  }
	}