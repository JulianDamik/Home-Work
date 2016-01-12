
public class DiceGame {
   private int[][] playerRolls;

   public DiceGame(int[][] initRolls) {
      playerRolls = initRolls;
   }

   public int getPlayerTotal(int playerNum) {
      int playerTotal = 0;
      for(int col = 0; col < playerRolls[playerNum].length; col++){
         playerTotal += playerRolls[playerNum][col];   
      }
      return playerTotal;
   }

   public int getMaxPlayer() {
      int tot0 = 0;
      int tot1 = 0;
      int tot2 = 0;
      
      int maxPlayer = 0;
      
      for(int row = 0; row <playerRolls.length; row++){   
         for(int col = 0; col < playerRolls[row].length; col++){
            if(row == 0){
               tot0 += playerRolls [row][col];
            }
            if(row == 1){
               tot1 += playerRolls [row][col];
            }
            if(row == 2){
               tot2 += playerRolls [row][col];   
            }
         }
      }
      if(tot0 == Math.max(Math.max(tot0,tot1),tot2)){
         maxPlayer = 0;   
      }
      if(tot1 == Math.max(Math.max(tot0,tot1),tot2)){
         maxPlayer = 1;   
      }
      if(tot2 == Math.max(Math.max(tot0,tot1),tot2)){
         maxPlayer = 2;   
      }
      return maxPlayer;
   }
   
} 