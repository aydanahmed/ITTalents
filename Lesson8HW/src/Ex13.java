public class Ex13 {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 5, 6, 6 };
		int[] arr2 = { 2, 3, 3, 5, 6, 3, 9 };
		System.out.print("New array is: ");
		printArray((retArr(arr1, arr2)));

	}

	static int[] retArr(int[] arr, int[] arr2) {
		int[] arr3 = new int[arr.length + arr2.length];
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			arr3[arr3.length - 1 - j] = arr2[arr2.length - 1 - j];
		}
		return arr3;
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
