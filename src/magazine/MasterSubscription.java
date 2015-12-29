package magazine;

import java.util.List;
import java.util.ArrayList;

public class MasterSubscription {
   private List<MagazineOrder> orders;

   public MasterSubscription() {
      orders = new ArrayList<MagazineOrder>();
   }

   public void addOrder(MagazineOrder theOrder) {
      orders.add(theOrder);
   }

   public int getTotalMagazines() {
	  int total = 0;
	  MagazineOrder temp;
      for(int i  = 0; i < orders.size();i++){
    	  temp = orders.get(i);
    	  total += temp.getNumMagazines();
      }
      return total;
   }

   public int removeMagazine(String magazineName) {
      int total = 0;
      MagazineOrder temp;
      for(int i = orders.size() - 1; i >= 0; i--){
    	  temp = orders.get(i);
    	  if( magazineName.equals(temp.getName())){
    		  orders.remove(i);
    	  }
    	  total++;
      }
      return total;
   }
}
