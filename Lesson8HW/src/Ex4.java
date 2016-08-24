import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names: ");
		String s1 = sc.nextLine();
		System.out.println("Enter names: ");
		String s2 = sc.nextLine();
		int a = 0, b = 0;
		for (int i = 0; i < s1.length(); i++) {
			a = a + (int) s1.charAt(i);
		}
		for (int j = 0; j < s2.length(); j++) {
			b = b + (int) s2.charAt(j);
		}
		if (a > b) {
			System.out.println(s1);

		} else {
			System.out.println(s2);
		}
		sc.close();
	}

}
