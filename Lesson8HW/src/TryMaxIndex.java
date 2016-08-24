
public class TryMaxIndex {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,61,2};
		int res = maxRec(arr, 0, arr.length-1, 0, 0);
		System.out.println(res+1);
	}
	static int maxRec(int[] arr,int i,int j,int maxIndex,int max){
		
		if(i==j){
			return maxIndex;
		}
		if(max<arr[i]){
			max = arr[i];
			maxIndex = i;
		}
		return maxRec(arr, i+1, j, maxIndex, max);
		
	}
}
