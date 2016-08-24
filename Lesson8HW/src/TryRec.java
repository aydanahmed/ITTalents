
public class TryRec {

	public static void main(String[] args) {
		int[] arr = {5,2,3,4,-2,2};
		int res =minRec(arr, 0,arr[0]);
		System.out.println(res);
	}
	static int minRec(int[] arr,int i,int min){
		if(i==arr.length-1){
			return min;
		}
			
		if(min >arr[i]){
		min = arr[i];
				
		}
		
		
		
	
		return minRec(arr,i+1,min);
		
		
	}

}
