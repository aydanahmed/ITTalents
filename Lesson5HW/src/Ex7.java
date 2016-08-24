
public class Ex7 {

	public static void main(String[] args) {
		int[] arr = {2,3,5,6,1,3};
		int[] arr2 = new int[arr.length];
		for(int i =0;i<arr.length;i++){
			arr2[i] = arr[i];
		}
		for(int i =0,k=1;i<arr.length-2;i++,k++){
			arr2[k] = arr[i]+arr[k];
		
		}
		System.out.print("New array is: ");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr2[i]+" ");
			
		}
		
		
		
		
	}

}
