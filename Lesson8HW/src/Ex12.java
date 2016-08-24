import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array: ");
		int a = sc.nextInt();
		printArray(retArr(a));
		sc.close();
	}
	
	static int[] retArr(int n){
		int[] arr = new int[n];
		int a = 1;
		int c = 1;
		for(int i=0;i<arr.length-1;i++){
			arr[0] = a;
			arr[i+1]= a+c;
			if(a==arr.length-1){
				break;
			}
		c++;	
		}
		return arr;
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + ".");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}
}
