public class MultiTable {
   public static void main(String[] args){

      int [][] multiTable = new int [13][13];
   
      for(int row = 1; row < 13; row++){
         for(int col = 1; col < 13; col++){
            multiTable[row][col] = row * col;
         }
      }
   
      for(int row = 1; row < 13; row++){
         for(int col = 1; col < 13; col++){
         System.out.print(multiTable[row][col] + "\t");
         }
         System.out.println();
      }
    }   
}