package baseball;

import java.util.ArrayList;

public class BaseballPlayerRunner {
   public static void main(String args[]) {
      BaseballPlayer baseballPlayer = new BaseballPlayer(5, 34, 3); 
      ArrayList<String> playerNames = new ArrayList<String>();
      int namesRemoved = 0;
        
      if (baseballPlayer.playerStats.get(0) == 5 &&  
          baseballPlayer.playerStats.get(1) == 34 &&
          baseballPlayer.playerStats.get(2) == 3) {
          System.out.println("Part A Correct.");
      }   
      else {
         System.out.println("Part A Incorrect.");
         System.out.println("Expected (5, 34, 3)");
         System.out.println("Result (" + baseballPlayer.playerStats.get(0) +
                            ", " + baseballPlayer.playerStats.get(1) +
                            ", " + baseballPlayer.playerStats.get(2) + ")");
      }   

      playerNames.add("Tim Kim");
      playerNames.add("Jim bob");
      playerNames.add("Michael Scott");
      playerNames.add("Tim Kim");
      playerNames.add("x");
      playerNames.add("c");
      playerNames.add("x");
      playerNames.add("c");        
                                         
      namesRemoved = baseballPlayer.fixPlayerList(playerNames);
      if (namesRemoved == 3 && playerNames.size() == 5) {
         System.out.println("Part B Correct.");
      }
      else {
         System.out.println("Part B Incorrect.");
         System.out.println("Expected: 3 names removed, 5 names remaining." );
         System.out.println("Result: " + namesRemoved + " names removed, " +
                            playerNames.size() + " names remaining");
      }

      return;   
   }   
}
