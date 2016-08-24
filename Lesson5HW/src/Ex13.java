import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int x = sc.nextInt();
		int temp = x;
		int digits = 0;
		while (temp != 0) {
			temp = temp / 2;
			digits++;

		}
		if (digits == 0) {
			digits = 1;
		}
		int[] array = new int[digits];
		for (int i = array.length - 1; i >= 0; i--) {
			int digit = x % 2;
			array[i] = digit;
			x = x / 2;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
