import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int[] arr = new int[7];
		int sum = 0;
		int absSub = 0, minSub = 0;
		int sub = 0;
		int avg = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Please enter a value for each cell:");
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		avg = sum / arr.length;
		System.out.println("Average is: " + avg);
		int[] substractions = new int[arr.length];
		for (int i = 0; i < substractions.length; i++) {
			sub = arr[i] - avg;
			absSub = sub < 0 ? 0 - sub : sub;
			substractions[i] = absSub;
		}
		minSub = substractions[0];
		int minIndex = 0;
		for (int i = 1; i < substractions.length; i++) {
			if (minSub > substractions[i]) {
				minSub = substractions[i];
				minIndex = i;

			}
		}
		System.out.println("The closest number is: " + arr[minIndex]);
	}

}
