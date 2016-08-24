import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value");
			arr[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[arr.length];
		for(int i = 0; i< arr2.length; i++){
			arr2[i] = arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
