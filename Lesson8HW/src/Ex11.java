
public class Ex11 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 4 };
		printArray(arr);

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
