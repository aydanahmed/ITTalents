//Ex15 from Homework5
public class Ex15 {

	public static void main(String[] args) {

		int[] arr = {4,9,5,8,6,9,-3,-11,14,3,5,7,3,9,8,9,8,5};
		
		int maxSum = 0;
		int orig1 = 0;
		int orig2 = 0;
		int orig3 = 0;
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				for(int k = j+1; k< arr.length; k++){
					if(arr[i] == arr[j] || arr[j] == arr[k] || arr[i] == arr[k]){
						continue;
					}
					int abs1 = (arr[i] < 0) ? 0-arr[i] : arr[i];
					int abs2 = (arr[j] < 0) ? 0-arr[j] : arr[j];
					int abs3 = (arr[k] < 0) ? 0-arr[k] : arr[k];
					int sum = abs1 + abs2 + abs3;
					if(sum > maxSum){
						maxSum = sum;
						orig1 = arr[i];
						orig2 = arr[j];
						orig3 = arr[k];
					}
				}
			}
		}
		System.out.println("The values are: " + orig1 + ", " + orig2 + " and " + orig3);
		
	}

}
