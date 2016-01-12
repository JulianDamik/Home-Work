
public class ArrayChecker {
   
   int [][] array;
   
   public ArrayChecker(int [][] testNums){
      array = testNums; 
   }
   
   public int arrayInstance (int testNum){
      int numElements = 0;
      
      for(int row = 0; row < array.length; row++){
         for(int col = 0; col < array[row].length; col++){
            if( testNum == array[row][col]){
               numElements++;
               }
         }
      }
      return numElements;
   }
      
   public int arrayDivisor(int divisor){
      
      int numDivided = 0;
      
      for(int row = 0; row < array.length; row++){
         for(int col = 0; col < array[row].length; col++){
            if(array[row][col] % divisor == 0){
               numDivided++;
            }
         }
      }
      return numDivided;
   }
   
   
}
