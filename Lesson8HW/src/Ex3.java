import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word: ");
		String s1 = sc.nextLine();
		System.out.println("Enter second word: ");
		String s2 = sc.nextLine();
		if (s1.length() == s2.length()) {
			System.out.println("Two strings are with equal length.");
			System.out.println("Difference between two strings: ");
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					System.out.println((i + 1) + " " + s1.charAt(i) + "-" + s2.charAt(i));
				}
			}
		} else {
			System.out.println("Two strings are with not equal lengths.");

		}
		sc.close();

	}

}
