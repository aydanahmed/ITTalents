import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3 = "";
		do {
			System.out.println("Enter two words with interval: ");
			s1 = sc.next();
			s2 = sc.next();
		} while (s1.length() < 5 || s2.length() < 5 || s1.length() + s2.length() > 20);

		if (s1.length() > s2.length()) {
			s3 = s2.substring(0, 5) + s1.substring(5);
			System.out.println(s1.length() + " " + s3);

		} else {
			s3 = s1.substring(0, 5) + s2.substring(5);
			System.out.println(s2.length() + " " + s3);

		}
		sc.close();

	}

}
