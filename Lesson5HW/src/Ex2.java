
public class Ex2 {

	public static void main(String[] args) {
		int[] arr = {1,4,10,12,9,5};
		int[] arr2 = new int[arr.length];
		for(int index =0;index<arr2.length;index++){
			arr2[index]=arr[index];
			
 		}
		for(int index1=3;index1<arr2.length-2;index1++){
			int temp = arr2[index1];
		    arr2[index1] = arr2[arr2.length -1];
		    arr2[arr2.length-1] = temp;
			
		}
		
		
		
		
		for(int index1 =0;index1<arr2.length;index1++){
			System.out.print(arr2[index1]);
			if(index1==arr.length-1){
				System.out.print(".");
			}else{
				System.out.print(",");
			}
		}

	}

}
