import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int[] arr = new int[7];
		int counter=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.print("Please enter value for cell:");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0 && arr[i]>5){
				counter ++;
				System.out.print(arr[i]+ " ");
				
			}
		}
		System.out.print(" count of numbers divided of 5 is: " +counter);

	}

}
