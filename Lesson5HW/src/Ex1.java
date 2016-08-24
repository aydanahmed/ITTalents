
public class Ex1 {

	public static void main(String[] args) {
		int[] array = {10,3,5,8,6,-3,7};
		int smallest = array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<smallest&&array[i]%3==0){
				smallest=array[i];
			}
			
			
		}
		
		System.out.println("The smallest number that devided of 3 is: " + smallest);

	}

}
