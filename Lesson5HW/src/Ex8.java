public class Ex8 {

	public static void main(String[] args) {

		int[] masiv = { 7, 2, 2, 2, 2, 3, 4, 4, 1, 1, 1, 9, 4, 8 };
		int length;
		int maxlength = 0;
		int value = masiv[0];

		for (int i = 1; i < masiv.length; i++) {
			length = 1;
			while (masiv[i] == masiv[i - 1]) {
				length++;
				i++;
				if (i == masiv.length) {
					break;
				}
			}
			if (maxlength < length) {
				maxlength = length;
				value = masiv[i - 1];
			}
		}
		System.out.println("The longest same numbers:");
		for (int i = 0; i < maxlength ; i++) {
			System.out.print(value + " ");
		}
	}
}