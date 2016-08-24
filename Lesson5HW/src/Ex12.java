
public class Ex12 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int temp;
		for(int i = 0 ; i <arr.length;i++){
			temp = arr[1];
			arr[1] = arr[0];
			arr[0]=temp;
		}
		for(int i = 0 ; i <arr.length;i++){
			arr[2]= arr[3]+arr[2];
			arr[3]= arr[2]-arr[3];
			arr[2]= arr[2]-arr[3];
		}
		for(int i = 0 ; i <arr.length;i++){
		arr[5] = arr[4]*arr[5];
		arr[4]=arr[5]/arr[4];
		arr[5]=arr[5]/arr[4];
		}
		System.out.println("New array is: ");
		for(int i = 0 ; i <arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}

}
