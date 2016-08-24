
public class Ex5 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i<arr.length;i++){
			arr[i]=i*3;	
		}
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]);
			if(i==arr.length-1){
				System.out.print(".");
			}else{
				System.out.print(",");
			}
		}
	}

}
