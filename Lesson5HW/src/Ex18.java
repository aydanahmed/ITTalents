public class Ex18 {

	public static void main(String[] args) {
		int[] arr = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] copyArr = new int[arr.length];
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			if (i == j) {

				if (arr[i] > arr2[j]) {
					copyArr[i] = arr[i];
				}
				if (arr[i] < arr2[j]) {
					copyArr[i] = arr2[j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(copyArr[i] + ",");
		}

	}

}
