
public class HomeWork {
	public static void main(String[] args){
		int a = 0;
		int[] array1 = new int[5];
		
		array1[0] = 0;
		array1[1] = 1;
		array1[2] = 2;
		array1[3] = 3;
		
		for(a = 0; a < 4; a++){
			array1[a] = array1[a]*2 - 2;
		}
		
		for(a = 0; a < 4; a++){
			System.out.println(array1[a]);
		}
		
	}
}
