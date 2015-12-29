package baseball;

import java.util.ArrayList;

public class BaseballPlayer {
   public ArrayList<Integer> playerStats;

   public BaseballPlayer(int numHits, int numRuns, int numRBIs) {
      playerStats = new ArrayList<Integer>();
      playerStats.add(numHits);
      playerStats.add(numRuns);
      playerStats.add(numRBIs);
   }

   public int fixPlayerList(ArrayList<String> baseballPlayers) {
	   int removed = 0;
	   for(int i = 0; i < baseballPlayers.size(); i++){
    	  for(int j = baseballPlayers.size()-1; j >= 0; j--){
    		  if(baseballPlayers.get(i).equals(baseballPlayers.get(j))){
    			  baseballPlayers.remove(j);
    			  j--;
    			  removed++;
    		  }
    	  }
      }
	 return removed;
   }
}
