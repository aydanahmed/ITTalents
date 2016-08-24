import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2 = "";
		do {
			System.out.println("Enter first string: ");
			s1 = sc.nextLine();
			System.out.println("Enter second string: ");
			s2 = sc.nextLine();
		} while (s1.length() + s2.length() > 40);
		System.out.print(s1.toUpperCase() + " " + s1.toLowerCase() + " ");
		System.out.print(s2.toUpperCase() + " " + s2.toLowerCase());
		sc.close();

	}

}
