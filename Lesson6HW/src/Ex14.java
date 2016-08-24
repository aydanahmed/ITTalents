//Ex14 from Homework5
public class Ex14 {

	public static void main(String[] args) {
		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };

		double max = 0;
		double[] arr2 = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > -2.99 && arr[i] < 2.99) {
				max = arr[i];
			}
			arr2[i] = max;
			max = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr2[i] == 0) {
				continue;
			}
			System.out.print(arr2[i]+";");
		}
	}

}
