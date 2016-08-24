import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a= sc.nextInt();
		int b;
		for(int i =0;i<arr.length-7;i++){
			arr[i]=a;
		}
		for(int j = 2,i=0;j<arr.length;j++,i++){
			arr[j] = arr[i] + arr[i+1];
		}
		
		for(int j = 0;j<arr.length;j++){
			System.out.print(arr[j]);
			if(j==arr.length-1){
				System.out.print(".");
			}else{
				System.out.print(",");
			}
		}

	}

}
